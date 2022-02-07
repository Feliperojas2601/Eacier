grammar Arbol;

arbol: CorIzq raiz+ CorDer;

raiz: 'nodo' CorIzq Expresion CorDer (CorIzq raiz+ CorDer)?;

Expresion: ~['{''}']*;
CorIzq: '{';
CorDer: '}';

//{nodo{0}} | {nodo{23*45/4}{nodo{23}nodo{*}nodo{45}nodo{/}nodo{4}}nodo{0}} | {nodo{23*45+4}{nodo{23*45}{nodo{23}nodo{*}nodo{45}}nodo{+}nodo{4}}} | { | {nodo{(suma+set)*num*red*set+34}{nodo{(suma+set)*num*red*set}{nodo{suma+set}{nodo{suma}nodo{+}nodo{set}}nodo{*}nodo{num}nodo{*}nodo{red}nodo{*}nodo{set}}nodo{+}nodo{34}}} | {nodo{printf}nodo{"un número: "}} | {nodo{scanf}nodo{"%d"}nodo{num}}nodo{num>=0}{nodo{num}nodo{>=}nodo{0}}} | {nodo{printf}nodo{"suma es: %d"}nodo{suma}} | {nodo{0}} |