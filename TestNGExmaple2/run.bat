cd C:\Users\pvidy\eclipse-workspace2\TestNGExmaple2
set ProjectPath=C:\Users\pvidy\eclipse-workspace2\TestNGExmaple2

echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml