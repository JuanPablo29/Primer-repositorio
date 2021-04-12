import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio2_Pablo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <String, Integer> notas = new TreeMap <String, Integer>();
		
		int opcion;
		
		Scanner t=new Scanner (System.in);
		
		File archivo = new File("notas.text");
		
		try {
			
			Scanner a = new Scanner (archivo);
			
			while(a.hasNext()) {
				
				notas.put(a.next(), a.nextInt());
				
			}
		
		} catch (FileNotFoundException e) {
			
		}
		
		do {
			
		System.out.println("1. Introducir nueva nota. \n"
				+"2. Calcular media. \n"
				+"3. Ver lista. \n"
				+"4. Ver alumnos que iran a recuperacion. \n"
				+"0. Salir.");
		opcion=t.nextInt();
		
		switch(opcion) {
		
		case 1:
			
			System.out.println("Introduce el nombre y nota del alumno");
			notas.put(t.next(), t.nextInt());
			
			System.out.println("Nota agragada.");
			
			try {
				
				FileWriter escribir = new FileWriter("notas.txt");
				
				for(String i: notas.keySet()) {
					
					escribir.write(i+" "+notas.get(i)+"\r\n");
				
				}
				
				escribir.flush();
				
				escribir.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se ha podido escribir en el archivo.");
				
			}
			
			break;
			
		case 2:
			
			float media=0;
			
			for(String i: notas.keySet()) {
			
				media = media + notas.get(i);
			
			}
			
			System.out.println("La media es: "+ media/notas.size());
			
			break;
			
		case 3:
			
			System.out.println("Estos son los alumnos y sus notas:");
			
			System.out.println(notas);
			
			break;
		
		case 4:
			
			System.out.println("Los alumnos que iran a recuperacion son: ");
			
			for(String i : notas.keySet()) {
				
				if(notas.get(i)<5) {
					
					System.out.println(i);
				
				}
			}
			
			break;
			
		case 0:

			System.out.println("Espero que hayas disfrutado de este programa.");
			
			break;
			
		default:
			
			System.out.println("Opcion incorrecta.");
			
		}
		
	}while(opcion!=0);

	}
}