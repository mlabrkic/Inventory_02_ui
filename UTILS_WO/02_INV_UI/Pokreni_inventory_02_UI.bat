REM x1 = Shell(sPath + sFile + " " + sUItemplate + " " + sUR_ID + " " + sPort, vbNormalFocus)

set UITEMPLATE=%1
set EQUIPMENT=%2
set PORT=%3

:: Change Current Directory to the location of this batch file
:: http://ss64.com/nt/cd.html
CD /d "%~dp0"

:: Open the command prompt, and type command (CMD /k for development)
:: http://ss64.com/nt/cmd.html

:: https://ss64.com/nt/syntax-args.html
:: ---------------------------------
:: All parameters:
:: CMD /c %JAVA_HOME%bin\java -cp Inventory_02_UI-1.0-SNAPSHOT.jar;C:\UTILS_WO\00_dependency205\* com.mxb.inventory.Inventory_02_ui %*

:: ---------------------------------
:: Development :
:: CMD /k %JAVA_HOME%bin\java -cp Inventory_02_UI-1.0-SNAPSHOT.jar;C:\UTILS_WO\00_dependency205\* com.mxb.inventory.Inventory_02_ui %UITEMPLATE% %EQUIPMENT% %PORT%

CMD /c %JAVA_HOME%bin\java -cp Inventory_02_UI-1.0-SNAPSHOT.jar;C:\UTILS_WO\00_dependency205\* com.mxb.inventory.Inventory_02_ui %UITEMPLATE% %EQUIPMENT% %PORT%
