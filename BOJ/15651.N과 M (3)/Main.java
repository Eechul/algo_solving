import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int[] arr;

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		dfs(0);
		System.out.println(sb.toString());
	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val); sb.append(" ");
			}
			sb.append("\n");
			return ;
		}

		for(int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
	}
}