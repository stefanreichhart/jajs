echo OFF

mkdir out
mkdir mods

echo "Compiling sources and modules ..."

"C:\Program Files\Java\jdk-11.0.1\bin\javac.exe" -d out --module-path src --module-source-path src src\modA\a1\A1.java src\modB\b1\B1.java src\modC\c1\C1.java
if errorlevel 1 goto :endofscript

echo "Packaging modules ..."

"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modA.jar -C out/modA .
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modB.jar -C out/modB .
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modC.jar -C out/modC .
if errorlevel 1 goto :endofscript

echo "Executing Modules/Main ..."

"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modA/a1.A1
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modB/b1.B1
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modC/c1.C1
if errorlevel 1 goto :endofscript

:endofscript
echo ""

echo ON