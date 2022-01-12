import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int MAX_SIZE = 10001;
        int MAX_NUM = N+1;
		int[] question = new int[N+1];
        int[] count = new int[MAX_SIZE];
        
        int[] result = new int[N+1];
        String resultStr = "";

        for(int i=1; i<MAX_NUM; i++) {
            question[i] = Integer.parseInt(br.readLine());
            count[question[i]]++;
        }
        int beforeIdx = 0;
        for(int i=1; i<MAX_SIZE; i++) {
            if(count[i] != 0) { 
                if(beforeIdx != 0) {
                    count[i] = count[i] + count[beforeIdx];
                }
                beforeIdx = i;
            }
        }

        for(int j=N; j>0; j--) {
            result[count[question[j]]] = question[j];
            count[question[j]]--;
        }
        for(int i=1; i<N+1; i++) {
            resultStr += result[i]+"\n";
        }
        System.out.println(resultStr);
        
	}
}
