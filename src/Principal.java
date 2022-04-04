import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Principal {	
	
	public static void main(String[] args) {
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(new Cliente(1, "Tiago Martins Ferreira", 35,'M'));
		lista.add(new Cliente(2, "Lucilene de Fátima Ferreira Martins", 37,'F'));
		lista.add(new Cliente(3, "Sarah Martins Ferreira", 13,'F'));
		lista.add(new Cliente(4, "Lucas Martins Ferreira", 6,'M'));
		lista.add(new Cliente(5, "Helena Martins Ferreira", 0,'F'));
		lista.add(new Cliente(6, "Lidia Maria Martins Ferreira", 62, 'F'));
		lista.add(new Cliente(7, "Fatima Flauzina das Graças", 60, 'F'));

		Map<Object, Long> total = lista.stream().map(a -> a.getSexo()).
				 collect(Collectors.groupingBy(a -> a.toString(),Collectors.counting()));
		
		System.out.println(total);
		
		System.out.println("Médica de idade da lista");
		System.out.println(lista.stream().mapToInt(a -> a.getIdade()).average().getAsDouble());
		
		System.out.println("//Soma das idades"); 
		System.out.println(lista.stream().mapToInt(a -> a.getIdade()).sum());
		
		System.out.println("//Soma das idades 2");
	    System.out.println(lista.stream().mapToInt(a -> a.getIdade()).reduce((a,b) -> a + b).getAsInt()); 
		
		System.out.println("// Menor idade");
		System.out.println(lista.stream().mapToInt(a -> a.getIdade()).min().getAsInt());
		
		System.out.println("// Maior idade");
		System.out.println(lista.stream().mapToInt(a -> a.getIdade()).max().getAsInt());
		
		System.out.println("//Listar Nomes");
		lista.stream().map(a -> a.getNome()).forEach(System.out::println);
		
		System.out.println("//listar somente nome sem os sobrenomes");
		lista.stream().map(a -> a.getNome().substring(0, a.getNome().indexOf(" "))).forEach(a -> System.out.println(a));
		
		System.out.println("//listar somente nomes com sobrenomes Martins Ferreira"); 
		lista.stream().filter(a -> a.getNome().contains("Martins Ferreira")).map(a -> a.getNome()).forEach(System.out::println);
		
		System.out.println("//listar somente o nome com maior numero de caracteres");
		System.out.println(lista.stream().mapToInt(a -> a.getNome().length()).max().getAsInt());

		
		// exemplo de programaçao funcional
		SomaNumeros sn = (a, b)->a + b;
		System.out.println(sn.somaNumeros(10, 30));
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,10);
		SomaMuitosNumeros smn = (a)-> a.stream().mapToInt(o -> o).sum();
		System.out.println(smn.somar(listaNumeros));
		
		System.out.println("soma valores da lista");
		System.out.println(listaNumeros.stream().reduce(0,(a,b)-> (a + b)));
		System.out.println(listaNumeros.stream().mapToInt(a -> a).sum());
		listaNumeros.stream().map(a -> String.valueOf(a)+ "******").forEach(a -> System.out.println(a));
		
		
		
		
		
	
	}
}
