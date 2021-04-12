
public class Fechaa {

	int dia;
	int mes;
	int ano;
	
	
	Fechaa(){
		
		this.dia=1;
		this.mes=1;
		this.ano=1;
	}
	
	Fechaa(String f){
		String [] separar=f.split("/");
		this.dia=Integer.parseInt(separar[0]);
		this.mes=Integer.parseInt(separar[1]);
		this.ano=Integer.parseInt(separar[2]);
		
		
	}
}
