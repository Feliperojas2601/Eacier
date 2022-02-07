grammar Expresion;

exp1: exp2 (op exp2)*;
exp2 : PAR_IZQ exp1 PAR_DER | TOKEN_ENTERO | TOKEN_REAL | TOKEN_CADENA | TOKEN_CHAR | ID (arreglo | funcion)? |PAR_IZQ TYPE PAR_DER  exp2;
op: OP_DIV | OP_MAT | OP_REL | TILDE;
arreglo: ('[' exp1 ']')+;
funcion:'('exp1 (',' exp1)*')';

TOKEN_REAL: TOKEN_ENTERO ('.'(TOKEN_ENTERO)*);
TOKEN_ENTERO:  '0'..'9'+;
TOKEN_CADENA: ["](.*?)["];
TOKEN_CHAR: ['](.?)['] ;
TYPE: ('char'
         |   'short'
         |   'int'
         |   'long'
         |   'float'
         |   'double'
         |   'signed'
         |   'unsigned'
         |   '_Bool');
PAR_IZQ: ('(' | '?');
PAR_DER: (')' | '¿');
NEG: '!';
ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* | '&' ID;
OP_REL: ('=='| '!=' |'<'|'>'|'<='|'>=' | '&&' | '||') ;
OP_DIV: ('/');
OP_MAT: ('*'|'%'|'+'|'-' | '<<' | '>>');
TILDE: '~';

//{nodo{0}} | {nodo{23*45/4}{nodo{23}nodo{*}nodo{45}nodo{/}nodo{4}}nodo{0}} | {nodo{23*45+4}{nodo{23*45}{nodo{23}nodo{*}nodo{45}}nodo{+}nodo{4}}} | { | {nodo{(suma+set)*num*red*set+34}{nodo{(suma+set)*num*red*set}{nodo{suma+set}{nodo{suma}nodo{+}nodo{set}}nodo{*}nodo{num}nodo{*}nodo{red}nodo{*}nodo{set}}nodo{+}nodo{34}}} | {nodo{printf}nodo{"un número: "}} | {nodo{scanf}nodo{"%d"}nodo{num}}nodo{num>=0}{nodo{num}nodo{>=}nodo{0}}} | {nodo{printf}nodo{"suma es: %d"}nodo{suma}} | {nodo{0}} |