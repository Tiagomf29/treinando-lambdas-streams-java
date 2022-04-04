import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupClass {
	
	public static void main(String[] args) {
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(new Cliente(1, "Tiago Martins Ferreira", 35,'M'));
		lista.add(new Cliente(2, "Lucilene de Fátima Ferreira Martins", 37,'F'));
		lista.add(new Cliente(3, "Sarah Martins Ferreira", 13,'F'));
		lista.add(new Cliente(4, "Lucas Martins Ferreira", 6,'M'));
		lista.add(new Cliente(5, "Helena Martins Ferreira", 0,'F'));
		lista.add(new Cliente(6, "Lidia Maria Martins Ferreira", 62, 'F'));
		lista.add(new Cliente(7, "Fatima Flauzina das Graças", 60, 'F'));

		Map<Object, Long> grupo = lista.stream().map(a -> a.getIdade())
				.collect(Collectors.groupingBy(a -> a.toString(), Collectors.counting()));
		
		System.out.println(grupo);
		
		List<Integer> numeros = Arrays.asList(1,3,3,3,4,5,6,5,4,3,5,6,7,4,2,1,2,3,5,4,3,2,5,67,7,3,2,2,3,45,64,3,21,3,4,5);
		
		Map<Integer, Long> grupoNumeros = numeros.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		
		System.out.println(grupoNumeros);
	}
	

}
