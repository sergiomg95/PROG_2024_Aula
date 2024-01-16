package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class Aula {

private int capacidad;
private Alumno alumnos[];

	public Aula(int capacidad) {
alumnos = new Alumno[capacidad];
	}
	
	public Alumno AddAlumno(Alumno Alumno) {
		Alumno.DarNombre();
		Alumno.DarEdad();
		 
		return Alumno;
	}
	
	
	
	
	
	
	
	
 public String toString() {
	 return "Alumnos: "+Arrays.toString(alumnos);
 }
 
}
