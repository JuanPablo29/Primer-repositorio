import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class dillje_Sorteo {
	
	String nombre;
	dillje_Fecha fecha;
	dillje_Participante participante;
	String premio;
	boolean celebrado=true;
	dillje_Participante dni; 
	
	dillje_Sorteo() {

		this.nombre = new String();
		this.fecha = new dillje_Fecha();
		this.participante = new dillje_Participante();
		this.premio = new String();
		this.dni = new dillje_Participante();

	}

	dillje_Sorteo(String nombre_archivo) {

		File archivo = new File(nombre_archivo);
		try {
			Scanner leer = new Scanner(archivo);
			this.nombre = new String();
			this.participante.nombre = leer.nextLine();
			this.participante.dni = leer.nextLine();
			this.fecha = new dillje_Fecha(leer.nextLine());
			this.premio = new String();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void guardar() {

		try {
			File carpeta = new File("Sorteos");
			if (carpeta.exists() == false) {
				carpeta.mkdir();
			}
			FileWriter archivo = new FileWriter("Participante\\Participantes " + this.nombre + ".txt");
			archivo.write(this.participante.nombre + "\r\n" + this.participante.dni + "\r\n" + this.fecha.dia + "/"
					+ this.fecha.mes + "/" + this.fecha.ano);
			archivo.flush();
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void info() {
		System.out.println();
		System.out.println("Nombre del sorteo " + this.nombre);
		System.out.println("Nombre de los participante: " + this.participante.nombre);
		System.out.println("DNI del ganador: " + this.participante.dni);
		System.out.println("Fecha de sorteo: " + this.fecha.dia+"/"+this.fecha.mes+"/"+this.fecha.ano);
		System.out.println();
	}

}






//Guarda un String con el nombre del sorteo y su fecha. También guarda todos los participantes que tiene.//
//Además, guarda otro String con el premio, un boolean diciendo si ya se ha celebrado y, en ese caso, un String con el dni del ganador.//