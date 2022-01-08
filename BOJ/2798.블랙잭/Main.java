import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        
		int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] cards = new int[N];
        int maxSum = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int v = Integer.parseInt(st2.nextToken());
            cards[i] = v;
        }
        for(int i=0; i<cards.length; i++) {
            for(int j=i+1; j<cards.length; j++) {
                for(int k=j+1; k<cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M && maxSum < sum) { maxSum = sum; }
                }
            }
        }
        System.out.println(maxSum);
	}
}
