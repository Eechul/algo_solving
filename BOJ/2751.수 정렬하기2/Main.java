import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
        
        for(int i=0; i<N; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }
        Arrays.parallelSort(seq);
        for(int i=0; i<N; i++) {
            System.out.println(seq[i]);
        }
	}
}
