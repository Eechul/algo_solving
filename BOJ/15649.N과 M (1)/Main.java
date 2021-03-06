import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;
	static int[] arr;
	static boolean[] used;

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[10];
        used = new boolean[10];
		
		func(0);
		System.out.println(sb.toString());
	}
	public static void func(int k) {
		if(M == k) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return ;
		}

		for(int i=1; i<=N; i++) {
			if(!used[i]) {
				arr[k] = i;
				used[i] = true;
				func(k+1);
				used[i] = false;
			}
		}
	}
}