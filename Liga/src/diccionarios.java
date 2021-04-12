import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class diccionarios {

	public static void main(String[] args) {
	
		File archivo = new File("Prueba.txt");
		
		Scanner t;
		
		try {
			
			t = new Scanner (archivo);

		HashMap <Character, Integer> letras = new HashMap <Character, Integer>();
		
		while(t.hasNextLine()) {
			
			String frase = t.nextLine();
		
		for(int i=0; i<frase.length(); i++) {
			
			if(letras.containsKey(frase.charAt(i))) {
				
				letras.put(frase.charAt(i), letras.get(frase.charAt(i))+1);
				
			}
			
			else {
				
				letras.put(frase.charAt(i), 1);
				
			}
		}
		}
		
		System.out.println(letras);
		
		}catch (FileNotFoundException e) {
		
		System.out.println("Archivo no encontrado.");
		
	}
}
}

//Hacer un programa que lee archivo y nos cuenta cuantas a tiene o b etc..//