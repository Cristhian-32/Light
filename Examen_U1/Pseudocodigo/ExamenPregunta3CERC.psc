//Este algoritmo calcula el ti pode vacuna segun la edad y el sexo
Algoritmo Definir_tipo_de_VacunaCERC
	//Datos de Entrada y Definicion de Variables
	Definir ED Como real
	Definir SX Como Caracter
	Escribir "Ingrese Sexo"
	Leer SX
	Escribir "EDAD"
	Leer ED
	//Proceso y Datos de Salida
	si ED>=70 entonces
		Escribir "VACUNA, tipo C"
	sino si ED<16 entonces
			Escribir "VACUNA, tipo A"
		sino si ED>=16 Y ED<=69 Y SX="f" o SX="F" entonces
				Escribir "VACUNA, tipo B"
			sino
				Escribir "VACUNA, tipo A"
			finsi
		fin si
	FinSi
FinAlgoritmo
