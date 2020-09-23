;## ScriptHeader Legobit - General constant declarations for Legobit's JAWS Script Language Extensions
;## File name: ScriptHeader Legobit.jsh
;## Version: 2020
;## Copyright: © 2019-2020 by Csaba Árpádházy-Godó

;#: Constants
Const

;: Debug state constants
		DEBUG_ON = 1,
		DEBUG_OFF = 0,


;: String handling constants
			CASE_INSENSITIVE = 1,
CASE_SENSITIVE = 0,


; Character constants

	cscAmpersand = "&",
	cscHasmark = "#",
	cscNullString = "",
	;cscSpace = " ",	; in hjConst.jsh 
	cscTab = "	",
	cscUnderscore = "_",
	cscDot = ".", ; cscPeriod
	cscComma = ",",
	cscSemicolon = ";",
	;cscColon = ":",",	; in hjConst.jsh 
	cscQuestionmark = "?",
	cscExclamation = "!",
	cscBackslash = "\92",
	;cscDoubleBackslash = "\92\92",
	cscSlash = "/",
	cscApostrophe = "'",
	cscCaret = "^",
	cscSeparator = "|",
	cscBullet = "•",
	cscStar = "*",
	cscMinusSign = "-",
	cscPlusSign = "+",
	cscTilde = "~",
	cscLeftParen = "(",
	cscRightParen = ")",
	cscLeftBracket = "[",
	cscRightBracket = "]",
	cscQuote ="\34",
	cscEqualSign = "=",
	;cscLess = "<",",	; in hjConst.jsh 
	;cscGreater = ">",",	; in hjConst.jsh 

	cscFiller = "\5", ;fekete káró jele
	cscLineEnd = "\13",
		cscNewLine = "\r\n",


; Character codes

	ASCII_LINE_END = 13,
	ASCIICR_= 13, ; carriage return
	ASCII_EMPTY_LINE = 13,
	ASCII_EOL_CHAR = 13,
	ASCII_SPACE = 32,
	ASCII_TAB = 9,
	ASCII_HTAB = 9, ; horizontal tab
	ASCII_VTAB = 11, ; vertical tab
	ASCII_LINE_FEED = 10,
	ASCII_NULL_CHAR = 0, 
	ASCII_BOF_CHAR = 0,
	ASCII_NON_CHARACTER_VALUES = "0|9|10|11|13|32",


;: Control characters

	CHAR_CRLF = "\r\n",
	CHAR_LINE_BREAK = "\r\n",
	CHAR_NEW_LINE = "\n",
	CHAR_RETURN = "\r",
	CHAR_TAB = "\t",


;	Character strings

	LATIN_ALPHA_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZŠŒ£¥ª¯¼¾ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİŞ",
	LATIN_ALPHA_UPPER_SPECIAL = "ŠŒ£¥ª¯¼¾ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİŞ",
	LATIN_LAPHA_LOWER = "abcdefghijklmnopqrstuvwxyzœŸ³¹ºßàáâãäåæçèêëìíîïğñòóôõöøùúûüış",
	LATIN_ALPHA_LOWER_SPECIAL = "L",
	ARABIC_NUMBERS = "0123456789",
	LATIN_ALPHA_PUNCTUATION = ".!?:,;",

	CYRILLIC_ALPHA_LOWER = "",
	CYRILLIC_ALPHA_UPPER = "",
	GREEK_ALPHA_LOWER = "",
	GREEK_ALPHA_UPPER = "",


;: RegExp expressions

	REGEXP_LATIN_ALPHA_SPECIAL = "[ŠŒ£¥ª¯¼¾ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİŞœŸ³¹ºßàáâãäåæçèêëìíîïğñòóôõöøùúûüış]",
	REGEXP_ENGLISH_ALPHA = "[a-zA-Z]",
	REGEXP_INI_HEADER = "\\[.*\\]",


;: Caret positions

	cpCaretNotVisible = -100,
	cpEmptyLine = -1,
	cpLineStart = 0,
	cpLineEnd = 1,
	cpWordStart = 2,
	cpWordEnd = 3,
	cpInWord = 4,
	cpLineStartAfterWhiteSpace = 5,


; Synthetizer constants

	SBL_PROFIVOX = "profivox.sbl",


; Keystrokes

; General menu commands
	cksFileMenu = "Alt+F",
	cksOpenFile = "Control+O",
	cksSave = "Control+S",

	cksControlW = "Control+W",
	cksCloseDocumentWindow = "Control+F4",
		cksFindNext = "F3",
	cksFindPrev = "Shift+F3",
	cksNextScript = "F2",
	cksPriorScript = "Shift+F2",

	cksSelectAddress = "Control+L",
	cksOneWordBack = "Control+LeftArrow",
	cksBackToWordStart = "Control+LeftArrow",
	cksOneWordForward = "Control+RightArrow",
	cksControlLeftArrow = "Control+LeftArrow",
	cksControlRightArrow = "Control+RightArrow",
	cksSelectWordToEnd = "Control+Shift+RightArrow",
	cksSelectWord = "Control+Shift+RightArrow",
	cksSelectWordFromEnd = "Control+Shift+LeftArrow",
cksControlShiftRightArrow= "Control+Shift+RightArrow",
	cksControlShiftLeftArrow= "Control+Shift+LeftArrow",

	cksSelectToLineStart = "Shift+Home",
	cksSelectLineToStart = "Shift+Home",
	cksShiftHome = "Shift+Home",
cksSelectToLineEnd = "Shift+End",
	cksSelectLineToEnd = "Shift+End",
	cksShiftEnd = "Shift+End",

	cksDeselectCharacter = "Shift+LeftArrow",
	cksSelectToEndOfDocument = "Control+Shift+End",
	cksSelectToStartOfDocument = "Control+Shift+Home",
	cksSelectToEnd = "Shift+End",
	cksSelectToStart = "Shift+Home"


;#: Literal constants

Const

;: Window classes
		WC_MOZILLA_Dialog = "MozillaDialogClass",


;#:: Message dialog constants
	YES = "Y",
	NO = "N",
	CANCEL = "C",


;#:: Script key announcement
	cskAmpersand = ", than "


;#:: GetVarianttype function constants
Const
	cUnknown = 0,
	cString = 1,
	cInteger = 2,
	cInt = 2,
	cObject = 3,
	cHandle = 2,
	cNullValue = 4,


;#:: File extension constants

	EXT_JKM = ".jkm",
		EXT_JSS = ".jss",
	EXT_JSB = ".jsb",
	EXT_TXT = ".txt",
	EXT_INI = ".ini",
	EXT_JSD = ".jsd",
	EXT_JDF = ".jdf",
	EXT_JSP = ".jsp",
	EXT_MNU = ".mnu"
