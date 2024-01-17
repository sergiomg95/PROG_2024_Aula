package Aula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula aula=new Aula(4);
		Alumno a1=new Alumno();
		a1.setNombre("Juan");
		a1.setEdad(15);
		
		Alumno a2=new Alumno();
		a2.setNombre("Maria");
		a2.setEdad(15);

		Alumno a3=new Alumno();
		a3.setNombre("Pedro");
		a3.setEdad(15);
		
		Alumno a4=new Alumno();
		a4.setNombre("Antonio");
		a4.setEdad(15);
		
		Alumno a5=new Alumno();
		a5.setNombre("Pablo");
		a5.setEdad(15);
		
		aula.add(a1);
		aula.add(a2);
		aula.add(a3);
		aula.add(a4);
		aula.add(a5);
		
		System.out.println(aula);
	}

}
