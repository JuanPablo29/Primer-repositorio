import java.io.File;
import java.util.Scanner;
public class Practica {

	public static void buscar(String ruta, String nombre) {
		
		File carpeta = new File(ruta);
		
		if(carpeta.exists() && carpeta.isDirectory()) {
			
			String [] archivos = carpeta.list();
			
			for(int i=0; i<archivos.length; i++) {
				
				File arch = new File(ruta+"\\"+archivos[i]);
				
				if(!arch.isDirectory() && archivos[i].contains(nombre)) {
					
					System.out.println(archivos[i]+"\t"+arch.getAbsolutePath());
					
				}
				
				else if(arch.isDirectory()){
					
					buscar(ruta+"\\"+archivos[i],nombre);
					
				}
			}
		}
		
		else {
			
			System.out.println("La carpeta no existe.");
			
		}
	}
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la ruta a buscar:");
		
		String ruta = teclado.nextLine();
		
		System.out.println("Introduce el nombre del archivo:");
		
		String nombre = teclado.nextLine();
		
		buscar(ruta,nombre);
		
	}
}

//un programa que nos pide una ruta y el nombre de un archivo y nos dice el archivo y la ruta en la que esta ubicado//