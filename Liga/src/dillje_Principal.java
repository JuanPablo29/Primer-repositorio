import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dillje_Principal {
	
	public static dillje_Sorteo[] cargaSorteos() {

		File dirSorteos = new File("Sorteos");
		if (dirSorteos.exists()) {
			String[] nomSorteo = dirSorteos.list();
			dillje_Sorteo[] sorteos = new dillje_Sorteo[nomSorteo.length];
			for (int i = 0; i < nomSorteo.length; i++) {
				sorteos[i] = new dillje_Sorteo("Sorteos\\" + nomSorteo[i]);

			}
			return sorteos;

		}

		else {
			return new dillje_Sorteo[0];

		}
	}

	public static dillje_Participante[] cargaParticipantes() {

		File dirParticipantes = new File("Participantes");
		if (dirParticipantes.exists()) {
			String[] nomParticipantes = dirParticipantes.list();
			dillje_Participante[] participantes = new dillje_Participante[nomParticipantes.length];
			for (int i = 0; i < nomParticipantes.length; i++) {
				participantes[i] = new dillje_Participante("Participantes\\" + nomParticipantes[i]);

			}
			return participantes;

		}

		else {
			return new dillje_Participante[0];

		}
	}

	
	public static void main(String[] args) {
		
		dillje_Sorteo[] sorteos = cargaSorteos();
		dillje_Participante[] participantes = cargaParticipantes();

		int opc = 0;
		do {
			
		System.out.println("1. Consultar datos de un participante");
		System.out.println("2. Consultar lista de todos los participantes.");
		System.out.println("3. Nuevo participante.");
		System.out.println("4. Consultar participantes de un sorteo.");
		System.out.println("5. Configurar nuevo sorteo.");
		System.out.println("6. Hacer sorteo.");
		System.out.println("7. Información sorteo.");
		System.out.println("0. Salir.");
		
		Scanner teclado = new Scanner(System.in);
		
		opc = teclado.nextInt();
		
		teclado.nextLine();
		
		boolean encontrado;
		
		switch (opc) {
		case 1:
			
			System.out.print("Introduce el telefono del participante: ");
			String telefonop = teclado.next();

			for (int i = 0; i < participantes.length; i++) {
				if (participantes[i].participantes.telefono.equals(telefonop)) {
					encontrado = true;
					participantes[i].info();
				}
			}

			if (!encontrado) {
				System.out.println("No hay participante con ese telefono.");

			}
			break;
			
		case 2:
			
			for (int i = 0; i < participantes.length; i++) {
				
					participantes[i].info();
			}
			break;
			
		case 3:
			
			dillje_Participante nuevo = new dillje_Participante();
			System.out.println("A continuación, introduzca los datos del nuevo participante.");
			System.out.print("Nombre: ");

			nuevo.nombre = teclado.nextLine();
			
			System.out.print("Apellido: ");
            nuevo.apellido = teclado.nextLine();
			
			System.out.print("DNI: ");
			nuevo.dni = teclado.nextLine();
			
			System.out.print("Telefono: ");
			nuevo.telefono = teclado.nextInt();

			for (int i = 0; i < participantes.length; i++) {
				if (participantes[i].dni.equals(nuevo.dni)) {
					encontrado = true;
				}
			}
			if (encontrado) {

				System.out.println("El participante ya esta registrado.");
			
			} 
			
			else {
				nuevo.guardar();

				ArrayList <dillje_Participante> listaParticipantes = new ArrayList(Arrays.asList(participantes));
				listaParticipantes.add(nuevo);
				participantes=listaParticipantes.toArray(participantes);
			}
			break;

			
		case 4:
		
		System.out.print("Dime el nombre del sorteo: ");
		String sorteoss = teclado.next();

		for (int i = 0; i < sorteos.length; i++) {
			if (sorteos[i].nombre.equals(sorteos)) {
				encontrado = true;
				participantes[i].info();
			}
		}

		if (!encontrado) {
			System.out.println("No hay participante con ese telefono.");

		}
		break;
		
		case 0:
			
			System.out.println("Adios.");
			break;
		
		default:
			
			System.out.println("Opción incorrecta.");
		}

	} while (opc != 0);
}
}