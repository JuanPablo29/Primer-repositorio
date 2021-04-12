
public class dillje_Fecha {
	
	int dia;
	int mes;
	int ano;
	
	dillje_Fecha() {
		
		this.dia=1;
		this.mes=1;
		this.ano=1;
	}
	
	dillje_Fecha(String f){
		
		String [] separar=f.split("/");
		this.dia=Integer.parseInt(separar[0]);
		this.mes=Integer.parseInt(separar[1]);
		this.ano=Integer.parseInt(separar[2]);
			
	}	
}