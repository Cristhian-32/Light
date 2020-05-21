//Este Algoritmo calcula una la respuesta de 5 operaciones fundamentales
Algoritmo Realizar_OperacionCERC
	//Datos de Entrada y Definicion de Variables
	Definir V1, V2 Como Real
	Definir SG Como Caracter
	Escribir "Primera Variable"
	Leer V1
	Escribir "Segunda Variable"
	Leer V2
	Escribir "Que desea operacion desea realizar"
	Leer SG
	//Proceso Y Datos de Salida
	segun SG hacer
		"+" : RP<-V1+V2
			Escribir "RESPUESTA: " RP
		"-" : RP<-V1-V2
			Escribir "RESPUESTA: " RP
		"*" : RP<-V1*V2
			Escribir "RESPUESTA: " RP
		"/" : RP<-V1/V2
			Escribir "RESPUESTA: " RP
		"^" : RP<-V1^V2
			Escribir "RESPUESTA: " RP
		De Otro Modo:
			Escribir "ERROR"
	FinSegun
FinAlgoritmo