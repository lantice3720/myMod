@rem put this project path into PATH_FROM
setlocal
set PATH_FROM=D:\Documents\progamming\mindustry\myMod\myMod2
@rem put your mindustry local path into PATH_TO
setlocal
set PATH_TO=C:\Users\yuchan\AppData\Roaming\Mindustry
@rem put your minudstry *jar* path into MINDUSTRY
setlocal
set MINDUSTRY=D:\Downloads\Mindustry.jar
if exist %PATH_TO%\mods\MyMod.jar del %PATH_TO%\mods\MyMod.jar
xcopy %PATH_FROM%\build\libs\MyMod.jar %PATH_TO%\mods\ /k
del %PATH_FROM%\build\libs\MyMod.jar
java -jar %MINDUSTRY%