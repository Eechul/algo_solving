import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int MAX_SIZE = 10001;
        int MAX_NUM = N+1;
        int[] count = new int[MAX_SIZE];
        
        StringBuilder resultSb = new StringBuilder();

        for(int i=1; i<MAX_NUM; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int j=1; j<MAX_SIZE; j++) {
            while(count[j] > 0) {
                resultSb.append(j).append('\n');
                count[j]--;
            }
        }
        System.out.println(resultSb);
	}
}
