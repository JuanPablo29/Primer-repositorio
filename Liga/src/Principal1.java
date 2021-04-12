import java.util.ArrayList;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {

		  Scanner teclado = new Scanner (System.in);
	    
		  ArrayList<Alumno> lista =new ArrayList <Alumno>();
	    
	      String nombre;
	      
	      float peso,estatura;
	      
	      do {
	    	  
	    	System.out.println("Dime el nombre del alumno");
	    	nombre=teclado.next();
	    	
	    	System.out.println("Dime la estatura del alumno");
	    	estatura=teclado.nextFloat();
	    	
	    	System.out.println("Dime el peso del alumno");
	    	peso=teclado.nextFloat();
	    	
	    	if (peso !=0 || estatura !=0) {
	    		
	    		lista.add(new Alumno(nombre,estatura,peso));
	    	
	    	}
	    	  
	      }while(peso !=0 || estatura !=0);
	      
	      Alumno [] array = new Alumno[0];
	      
	      array = lista.toArray(array);
	      
	      for(int i=0; i<array.length; i++) {
	    	  
	    	  System.out.println("—————————————————————————————————");
	    	  System.out.println();
	    	  System.out.println("Nombre: "+array[i].nombre);
	    	  System.out.println("Estatura: "+array[i].estatura);
	    	  System.out.println("Peso: "+array[i].peso);
	    	  System.out.println();
	      }
	      
	      System.out.println("—————————————————————————————————");
	      
	}
}