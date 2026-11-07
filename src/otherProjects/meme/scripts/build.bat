@echo off
chcp 65001 > nul
set JAVA_BIN=C:\Program Files\Java\jdk-21\bin

:: 1. Переходим в корень проекта (на уровень выше папки scripts)
cd /d "%~dp0.."

echo 1. Компиляция кода...
:: Создаем папку compile, если ее вдруг нет
if not exist compile mkdir compile
:: Компилируем исходник из src, а результат (.class) отправляем в compile
"%JAVA_BIN%\javac.exe" -d compile src\main.java

:: 2. Переходим в рабочую папку compile для дальнейшей сборки
cd compile

echo 2. Создание JAR архива...
"%JAVA_BIN%\jar.exe" cfe MyApp.jar Main Main.class

echo 3. Подготовка папки input...
if not exist input mkdir input
move /Y MyApp.jar input\ > nul

echo 4. Очистка старых сборок...
if exist MyCoolApp rmdir /S /Q MyCoolApp

echo 5. Сборка автономной программы через jpackage...
"%JAVA_BIN%\jpackage.exe" --type app-image --name MyCoolApp --input input --main-jar MyApp.jar --main-class Main --win-console --add-modules java.base,java.desktop --java-options "-Xshare:off"

echo Готово! Ваша автономная папка MyCoolApp находится внутри папки compile.
pause