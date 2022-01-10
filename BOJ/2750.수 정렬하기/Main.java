import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
        
        for(int i=0; i<N; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                int tmpSeq = 0;
                if(seq[i] > seq[j]) { 
                    tmpSeq = seq[i];
                    seq[i] = seq[j];
                    seq[j] = tmpSeq;
                 }
            }
        }
		
        for(int i=0; i<N; i++) {
            System.out.println(seq[i]);
        }
	}
}
