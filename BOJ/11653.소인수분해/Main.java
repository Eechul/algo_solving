import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i;
        
        if(N == 1) { System.exit(0); }
        for(i=2; i<=N; i++) {
            while(true) {
                if(N % i == 0) { 
                    N = N / i; 
                    System.out.println(i); 
                } else { 
                    break;
                }
            }
        }
	}
}
