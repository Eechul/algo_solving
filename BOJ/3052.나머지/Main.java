import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 10;
        Set<Integer> remainderSet = new HashSet<Integer>();
        for(int i=0; i<n; i++) {
            Integer num = Integer.parseInt(br.readLine());
            remainderSet.add(num % 42);
        }
        System.out.println(remainderSet.size());   
    }
}
