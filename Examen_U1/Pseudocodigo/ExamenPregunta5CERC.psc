//Este algoritmo calcula el salario de una persona durante los años
Algoritmo Calculo_SalarioCERC
	//Definicion de Variables
    Definir A Como Entero
    Definir SL Como Real
	Escribir "Ingrese su Salario"
	Leer SL
	//Proceso y Datos de Salida
    Para A<-1 Hasta 6 Con Paso 1 Hacer
        Escribir "Año: " A "  Salario: " trunc(SL*100)/100
        SL <- SL*1.1
    FinPara
FinAlgoritmo
