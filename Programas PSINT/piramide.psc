SubProceso piramide ( matriz, ancho, alto )
	definir i, j, izq, der, k Como Entero;
	j <- (ancho-1)/2;
	izq <- j;
	der <- (ancho-1)/2;
	Para i<-0 hasta alto-1 Hacer
		
		//-para j <- 0 hasta (ancho)/2 hacer
		//FinPara
		//Mientras j < (ancho-1)/2 Hacer
		//	j <- j +1;
		//FinMientras
		//matriz[i,j] <- 1;
		Para j<- izq Hasta der Con Paso 1 Hacer
			matriz[i,j] <- 1;
		FinPara
		izq <- izq -1;
		der <- der +1;
		
	FinPara
	
FinSubProceso

SubProceso piramide_inversa ( matriz, ancho, alto )
	definir i, j, izq, der, k Como Entero;
	j <- 0;
	izq <- j;
	der <- ancho-1;
	Para i<-0 hasta alto-1 Hacer
		
		//-para j <- 0 hasta (ancho)/2 hacer
		//FinPara
		//Mientras j < (ancho-1)/2 Hacer
		//	j <- j +1;
		//FinMientras
		//matriz[i,j] <- 1;
		Para j<- izq Hasta der Con Paso 1 Hacer
			matriz[i,j] <- 1;
		FinPara
		izq <- izq +1;
		der <- der -1;
		
	FinPara
	
FinSubProceso

SubProceso contorno ( matriz, ancho, alto )
    definir i, j Como Entero;
	Para i<- 0 hasta alto-1 hacer 
		
		para j <- 0 hasta ancho-1 hacer
			matriz[i,j] <- 0;
			
		FinPara
		
	Finpara
	
FinSubProceso


SubProceso  x ( matriz, ancho, alto )
    definir i, j Como Entero;
    Para i<- 0 hasta alto-1 hacer 
        para j <- 0 hasta ancho-1 Hacer
            Escribir matriz[i,j], " " sin saltar;
        FinPara
        Escribir "  "; 
    FinPara
	
FinSubProceso

Proceso sin_titulo
    Dimension matriz[20, 20];
    Definir matriz Como Entero;
	
    contorno(matriz, 11, 6);
	
	piramide_inversa(matriz, 11, 6);
	
    x(matriz, 11, 6);
FinProceso
// i j
//0,0   0,1  0,2  0,3  0,4  0,5  0,6
//1,0   1,1  1,2  1,3  1,4  1,5  1,6
//2,0   2,1  2,2  2,3  2,4  2,5  2,6
//3,0  3,1   3,2  3,3  3,4  3,5  3,6