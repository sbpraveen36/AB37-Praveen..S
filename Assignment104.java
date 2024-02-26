package assignment1;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assignment104 {
	public static void main(String[] args) {
	
		LinkedHashSet t1 = new LinkedHashSet();
		t1.add("praveen");
		t1.add("ram");
		t1.add("java");
		t1.add(123);
		t1.add(23.05);
		t1.add('a');
		t1.add(null);
		t1.add(true);
		
		System.out.println(t1);

	}
}
