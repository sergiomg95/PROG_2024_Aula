package Aula;

import java.util.Arrays;

public class Aula {

private int capacidad;
private Alumno alumnos[];

	public Aula(int capacidad) {
alumnos = new Alumno[capacidad];
	}
	
	
	
	
	
	
	
	
	
	
	
 public String toString() {
	 return "Alumnos: "+Arrays.toString(alumnos);
 }
 
}
