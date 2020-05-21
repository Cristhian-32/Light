//Este Algoritmo calcula el promedio de Fundamentos de Programacion
Algoritmo Promedio_FinalCERC
	//Datos de Entrada y Definicion de Variables
	Definir N1, N2, N3, N4 Como Entero
	Escribir "NOTA, Primera Unidad"
	Leer N1
	Escribir "NOTA, Segunda Unidad"
	Leer N2
	Escribir "NOTA, Tercera Unidad"
	Leer N3
	Escribir "NOTA, Trabajo Final"
	Leer N4
	//Proceso 
	P1<- (N1*10)/100
	BR1<- redon(P1)
	P2<- (N2*15)/100
	BR2<- redon(P2)
	P3<- (N3*25)/100
	BR3<- redon(P3)
	P4<- (N4*50)/100
	BR4<- redon(P4)
	PP<- BR1+BR2+BR3+BR4
	//Datos de Salida
	Escribir  "PROMEDIO FINAL: " PP
FinAlgoritmo

