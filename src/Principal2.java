import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Principal2 {
	
	@FunctionalInterface
	public interface Soma{
		public void Somar(int num1, int num2);
	}
	
	public static void main(String[] args) {
		
		List<String> primos = Arrays.asList("Tiago","Andre","Diego","Geovane","Luan","Bruno");
		
		System.out.println("Listar todos os nomes"); 
		primos.forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Listar somente nomes que terminam com a letra o");
		primos.stream().filter(a -> a.endsWith("o")).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Somente nome com mais de 5 caracteres");
		primos.stream().filter(a -> a.length() > 5).forEach(System.out::println);
		System.out.println("------------");
		System.out.println("Somente nome com a terceira letro do nome iniciada com a letra a");
		primos.stream().filter(a -> a.substring(2,3).equals("a")).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Todos os nomes com letras minusculas");
		primos.stream().map(a -> a.toLowerCase()).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Todos os nomes com letras maiúsculas");
		primos.stream().map(a -> a.toUpperCase()).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Todos os nomes que contém a letra a no nome");
		primos.stream().filter(a -> a.toLowerCase().contains("a")).forEach(System.out::println);
		System.out.println("------------");
		System.out.println("Todos os nomes ordenado em order crescente");
		primos.stream().sorted().forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Todos os nomes ordenado em order descrescente");
		primos.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Todos os nomes onde se tiver a letra \"a\" letra a(minusculo) vire \"A\"(maiúsculo)");
		primos.stream().map(a -> a.replace("a", "A")).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Quantos primos existem na lista");
		System.out.println(primos.stream().count());
		System.out.println("------------");
		System.out.println("Quantos caracteres possui o menor nome da lista de primos");
		System.out.println(primos.stream().mapToInt(a -> a.length()).min().getAsInt()); 
		System.out.println("------------");
		System.out.println("Quantos caracteres possui o maior nome da lista de primos");
		System.out.println(primos.stream().mapToInt(a -> a.length()).max().getAsInt()); 
		System.out.println("------------");
		System.out.println("Mostrar apenas os primeiros 3 primos da lista");
		primos.stream().limit(3).forEach(a -> System.out.println(a));
		System.out.println("Mostrar os primos a partir do quarto nome de primo da lista");
		primos.stream().skip(3).forEach(a -> System.out.println(a));
		System.out.println("------------");
		System.out.println("Somar quantidade de caracteres de todos os nomes da lista");
		System.out.println(primos.stream().map(a -> a.length()).reduce((a1,a2)-> a1+a2).get());
		System.out.println("------------");
		System.out.println("Exemplo de função lambda a partir de uma interface criada. Programação funcional");
		Soma soma = (a,b) -> System.out.println(a+b);
		soma.Somar(10, 20);
		
	}

}
