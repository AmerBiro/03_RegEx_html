grammar dato;

start   : d=TAG EOF;

TAG:  OPEN MID END;

OPEN: ('<'([a-z][a-z1-9]*)'>')+;
END: ('</'([a-z][a-z1-9]*)'>')+;
MID : [a-zA-Z0-9 ][a-zA-Z0-9 \n]*;

WHITESPACES: [ \t\n]+ -> skip;
Comment: ('//' (~[\n])*) -> skip;
MULTICOMMENT: ('/*' (('*' ~[/] | ~[*])*) '*/') -> skip;
