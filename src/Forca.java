import java.util.ArrayList;
import java.util.Scanner;

public class Forca {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		final String TEXTO = "cavalo";
		ArrayList<String> lista = new ArrayList<>();
		for(int i=0; i < TEXTO.length();i++) lista.add("_ ");
		lista.stream().forEach(a -> System.out.print(a));
		
		 sc = new Scanner(System.in);
		 var QTDE_MAX_ERROS= 1; 
		 var achou = false;
		 var valor = "";
		 
		 while(QTDE_MAX_ERROS < 6) {
			 
			 System.out.println("\nDigite uma letra");
			 valor = sc.next();
			 
			 for(int i=0; i < TEXTO.length(); i++) {
				var vlr = String.valueOf(TEXTO.charAt(i));
				if(valor.equals(vlr)) {
					 lista.remove(i);
					 lista.add(i, String.valueOf(TEXTO.charAt(i)));
					 achou = true;
				 }
			 }
			 
			 lista.stream().forEach(a -> System.out.print(a));
			 
			 if(!achou) {
				 QTDE_MAX_ERROS += 1;
				 if(QTDE_MAX_ERROS == 6)
					 System.out.println("Vc perdeu!!!!");
				 else
					 System.out.println("Você errou. ainda existe "+ (6 - QTDE_MAX_ERROS)+ " chances");
			 }
			 achou = false;
		 }
		
	}

}
