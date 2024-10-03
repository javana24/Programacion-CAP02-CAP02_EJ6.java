Proceso Factorial
	Escribir "Introduzca un numero";
	Definir num1 Como Entero;
	Leer num1;
	Definir operacion Como Entero;
	operacion <- num1;
	Definir contador Como Entero;
	Para contador <- num1-1 hasta 2 Con Paso -1 Hacer
		operacion <- operacion * contador;
	FinPara
	Escribir "El factorial de ", num1, " es ", operacion;
FinProceso
