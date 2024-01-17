package Aula;

import java.util.Arrays;
import java.util.Scanner;

public class Aula {

private int cuantos;
private Alumno alumnos[];

	public Aula(int capacidad) {
		alumnos = new Alumno[capacidad];
		cuantos=0;
	}
	
	public void add(Alumno Alumno) {
		if(cuantos<alumnos.length) {
		alumnos[cuantos]=Alumno;
		cuantos++;
		}
	}
	
	
 public String toString() {
	 return "Alumnos: "+Arrays.toString(alumnos);
 }
 
}
