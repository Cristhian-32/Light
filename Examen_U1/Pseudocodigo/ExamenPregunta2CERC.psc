//Este algoritmo calcula el bono segun los puntos
Algoritmo Calcular_BonoCERC
	//Datos de Entrada y Definicion de Variables
	Definir PT Como real
	Escribir "Ingrese sus puntos"
	Leer PT
	SM<- 2500
	//Proceso y Datos de Salida
	si PT>=50 Y PT<=100 entonces
		BN<-(SM*10)/100
		Escribir "SU BONO ES: " BN
	sino si PT>=101 y PT<=150 entonces
			BN<-(SM*50)/100
			Escribir "SU BONO ES: " BN
		sino si PT>=151 entonces
				Escribir "SU BONO ES: " SM
			fin si
		finsi
	FinSi
FinAlgoritmo
