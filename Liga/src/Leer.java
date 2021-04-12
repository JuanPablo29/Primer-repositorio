import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leer {
	
public static String recorta (String frase, char a) {
		
		String b="";
		
		frase=frase.toLowerCase();
		
		for(int i = 0; i<frase.length(); i++) {
			
			if(frase.charAt(i) != a) {
				
				b = b+frase.charAt(i);
				
			}
		}
		
		return b;
	}
	
	public static String recortamas (String frase, char [] array) {
		
		for(int i = 0; i<array.length;i++) {
			
			frase = recorta(frase, array[i]);
			
		}
		
		return frase;
		
	}

	public static void main(String[] args) {
		
		File archivo = new File("leer.txt");
	
		char [] eliminar = {'.', ',', '?', '¿', '!', '¡', ':' };
		
		try {
		
			Scanner a = new Scanner(archivo);
		
		HashMap <String, Integer> palabras = new HashMap <String, Integer>();
		
		while(a.hasNext()) {
			
			String p = recortamas(a.next(), eliminar);
			
			if(palabras.containsKey(p)) {
				
				palabras.put(p, palabras.get(p)+1);
			}
			
			else {
				
				palabras.put(p, 1);
			
			}
		}
		
		String m = "";
		
		int max = 0;
		
		for(String i : palabras.keySet()) {
			
			if(palabras.get(i) > max) {
				
				m = i;
				
				max = palabras.get(i);
			}
		}
		
		System.out.println("Las palabras que mas se repite es: " + m + ",que se repite " + max + "veces.");
		
		}catch(FileNotFoundException e) {
			
			System.out.println("Archivo no encontrado.");

		}
	}
}

//Hacer un subprograma y programa que en nuestra frase recorta los parametros que quiero antes de guardar//