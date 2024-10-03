SubProceso ret <- multiplica (num1, num2)
	Definir contador Como Entero;
	Definir ret como entero;
	contador <- 1
	ret <- 0
	Mientras contador <= num2 hacer
		ret <- ret + num1;
		contador <- contador + 1;
	FinMientras

FinSubProceso

SubProceso ret <- cociente(dividendo, divisor)
	Definir ret Como Entero;
	ret <- 0;
	Mientras dividendo < divisor Hacer
		dividendo <- dividendo - divisor;
		ret <- ret + 1;
	FinMientras
FinSubProceso

Proceso funciones
    Escribir multiplica(3, 4);
	Escribir cociente(10, 9);
FinProceso