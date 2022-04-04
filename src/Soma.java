import java.util.Arrays;
import java.util.List;

public class Soma {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,4,5,6);
		System.out.println(lista.stream().reduce((a,b) -> a +b).get());
		System.out.println(lista.stream().mapToInt(a -> a).sum());
		
		
	}

}


