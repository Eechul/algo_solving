import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int result = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			int j;
			for(j=2; j<num; j++) {
				if(num % j == 0) {
					break; 
				}
			}
			if(num == j) { result++; }
		}
		System.out.println(result);
	}
}
