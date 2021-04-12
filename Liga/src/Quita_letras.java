
public class Quita_letras {
	
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
		
		char [] letras = {'a', 'b', 't'};
	
		// Seleccionar que letras quieres que sean recortadas, no hace falta poner si haces la de abajo solo//
		
		System.out.println(recorta("Patata",'t'));

	}
}