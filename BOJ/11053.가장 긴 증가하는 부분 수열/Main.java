import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	static int N;	// 수열 크기
	static int[] inputSeq; // 입력된 seq arr
	static int[] dp; // 
	static int maxLength = 1; // 결과 length
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		inputSeq = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			inputSeq[i] = Integer.parseInt(st.nextToken());
		}
		for(int n = 0; n < inputSeq.length; n++) {
			dp[n] = 1;
			for(int j = 0; j < n; j++) {
				if(inputSeq[j] < inputSeq[n] && dp[n] < dp[j] +1) { 
					dp[n] = dp[j] + 1;
				}
			}
		}
		
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}
}
