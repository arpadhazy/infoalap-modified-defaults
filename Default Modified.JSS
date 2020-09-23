;## JAWS default script file - Updated default functions and scripts
;## File name: Default Modified.jss
;## Version: 2020
;## Copyright:  © 2012-2019 by Csaba Árpádházy-Godó

 ;#: Include directrives
;#: Includes
include "ScriptHeader Freedom.jsh"	; Freedom's factory script headers & message files
include "ScriptHeader Legobit.jsh"	; Header for extended script language functionality


;#: Modified scripts
Script SaySystemTime ()
var
	string sTimeOrDate,
	string sNameday = SysGetDate ("MMdd"),
	string sPath = FindJAWSSettingsFile ("nevek.ini"),
	string sName = IniReadString ("names", sNameDay, cscNullstring, sPath)

	Delay (2)

	if GetRunningFSProducts() == product_MAGic
		&& IsSpeechOff() then
		ExMessageBox(FormatString(cMsgGetSysTimeAndDate,SysGetTime(),SysGetDate()),
		cscNull,MB_ICONINFORMATION)
		return
	endIf

var
	int iTimesPressed=IsSameScript ()
	
	If iTimesPressed == 1 then
		sTimeOrDate = FormatString (cmsgGetSysDate, SysGetDate ())
		sTimeOrDate  = sTimeOrDate  + cscComma + cscSpace + sName
		
			ElIf iTimesPressed == 2 Then
					sTimeOrDate = "Mai napi emlékeztetõk"
			
	Else
		Delay (1)
		sTimeOrDate = FormatString (cmsgGetSysTime, SysGetTime ())
	EndIf

	SayUsingVoice (	VCTX_MESSAGE, sTimeOrDate, ot_user_requested_information)
EndScript ; SaySystemTime 

