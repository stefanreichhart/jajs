echo OFF

echo:
echo "0) Cleaning up ..."

mkdir out
mkdir mods
rm mods/modA.* mods/modB.* mods/modC.*

echo:
echo "1) Compiling sources and modules ..."

REM destination: out
REM lookup of other modules: src
REM module sources for compilation: src
REM sources for compilation: *.java
"C:\Program Files\Java\jdk-11.0.1\bin\javac.exe" -d out --module-path src --module-source-path src src\modA\a1\A1.java src\modB\b1\B1.java src\modC\c1\C1.java
if errorlevel 1 goto :endofscript

echo:
echo "2) Packaging modules ..."

REM create jar file: mods\mod*.jar
REM create from module: out/mod*
"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modA.jar -C out/modA .
REM "C:\Program Files\Java\jdk-11.0.1\bin\jmod.exe" create --module-path mods --class-path out\modA mods\modA.jmod
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modB.jar -C out/modB .
REM "C:\Program Files\Java\jdk-11.0.1\bin\jmod.exe" create --module-path mods --class-path out\modB mods\modB.jmod
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\jar.exe" --create --file=mods\modC.jar -C out/modC .
REM "C:\Program Files\Java\jdk-11.0.1\bin\jmod.exe" create --module-path mods --class-path out\modC mods\modC.jmod
if errorlevel 1 goto :endofscript

echo:
echo "3) Executing Modules/Main ..."

REM run class: modA/a1/A1
REM module lookup path: mods
"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modA/a1.A1
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modB/b1.B1
if errorlevel 1 goto :endofscript

"C:\Program Files\Java\jdk-11.0.1\bin\java.exe" --module-path mods -m modC/c1.C1
if errorlevel 1 goto :endofscript

:endofscript
echo:

echo ON