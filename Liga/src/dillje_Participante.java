import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class dillje_Participante {
	
	String nombre;
	String apellido;
	dillje_Fecha fecha;
    String dni;
    int telefono;

    dillje_Participante() {

	this.nombre = "";
	this.apellido = "";
	this.fecha = new dillje_Fecha();
	this.dni = "";
	this.telefono = 1;
}

    dillje_Participante(String nombre_archivo) {

	File archivo = new File(nombre_archivo);
	
	try {
		Scanner leer = new Scanner(archivo);
		this.nombre = leer.nextLine();
		this.apellido = leer.nextLine();
		this.fecha = new dillje_Fecha(leer.nextLine());
		this.dni = leer.nextLine();
		this.telefono = leer.nextInt();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

    void guardar() {

	try {
		File carpeta = new File("Participantes");
		if (carpeta.exists() == false) {
			carpeta.mkdir();
		}
		
		FileWriter archivo = new FileWriter("Participantes\\" + this.dni + ".txt");
		archivo.write(this.nombre + "\r\n" + this.dni);
		archivo.flush();
		archivo.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

    void info() {
	System.out.println();
	System.out.println("Nombre del participante: "+this.nombre);
	System.out.println("Telefono del participante: "+this.telefono);
	System.out.println("DNI del participante: "+this.dni);
	System.out.println();
}
}