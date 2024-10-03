Proceso Primos
    
	Definir es_primo Como Logico;
	Definir i Como Entero;
	Definir  cant_a_mostrar  Como Entero;
	Definir  cant_mostrados  Como Entero;
	Definir n Como Entero;
	
    Escribir "Ingrese la cantidad de numeros primos a mostrar: "
	Leer cant_a_mostrar;
    
	Escribir "1: 2" 
    cant_mostrados <- 1
	
	n<-3 
	
    Mientras cant_mostrados<cant_a_mostrar Hacer
        
        es_primo <- Verdadero // pienso que es primo hasta que encuentre con que dividirlo
        
        Para i<-3 hasta rc(n) con paso 2 Hacer // ya sabemos que es impar
            Si n MOD i = 0 entonces // si la division da exacta...
                es_primo <- Falso  // ...ya no es primo
            FinSi
        FinPara
        
        Si es_primo Entonces
            cant_mostrados <- cant_mostrados + 1
            Escribir cant_mostrados, ": ",n
        FinSi
        
        n <- n + 2 
          
    FinMientras
    
FinProceso