package Aula;

import java.util.Scanner;

public class Alumno {
private String nombre;
private int edad;

 public Alumno() {
	 this.nombre="Juan";
	 this.edad=15;
}

//
//public String getNombre() {
//	return nombre;
//}
//public void setNombre(String nombre) {
//	this.nombre = nombre;
//}
//public int getEdad() {
//	return edad;
//}
//public void setEdad(int edad) {
//	this.edad = edad;
//}
 public String DarNombre() {
	Scanner teclado = new Scanner(System.in);
	return nombre=teclado.next();
 }
 public int DarEdad() {
	 return edad=(int) (Math.random()*13+8);
 }
}
