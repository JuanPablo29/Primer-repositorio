import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Videojuego {
	
	private String Nombre;
	private String Genero;
	private int A�o;
	
	Videojuego(){
		
	this.Nombre = "";
	this.Genero = "";
	this.A�o = 1;
		
	}
	
	 Videojuego (String nombre_archivo) {

			File archivo = new File(nombre_archivo);
			
			try {
				Scanner leer = new Scanner(archivo);
				this.Nombre = leer.nextLine();
				this.Genero= leer.nextLine();
				this.A�o = leer.nextInt();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	 
	    void guardar() {

	    	try {
	    		File carpeta = new File("Videojuegos");
	    		if (carpeta.exists() == false) {
	    			carpeta.mkdir();
	    		}
	    		FileWriter archivo = new FileWriter("Juegos\\" + this.Nombre + ".txt");
	    		archivo.write(this.Nombre + "\r\n");
	    		archivo.flush();
	    		archivo.close();
	    	} catch (IOException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}

	    }
	    
	    void info() {
	    	
	    	System.out.println("Nombre del juego: "+this.Nombre);
	    	System.out.println("Genero: "+this.Genero);
	    	System.out.println("A�o de Lanzamiento: "+this.A�o);
	    
	    }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
	}
}