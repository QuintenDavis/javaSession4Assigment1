import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSession4Assignment1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
