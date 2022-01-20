import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
        System.out.println((int) (Math.pow(2, N)-1));
		h(N, 1, 3, 2);
		System.out.print(sb);
	}

	static void h(int n, int from_pos, int to_pos, int aux_pos) {
		
		if(n == 1) {
			sb.append(from_pos).append(" ").append(to_pos).append("\n"); return ;
		}

		h(n-1, from_pos, aux_pos, to_pos);
		sb.append(from_pos).append(" ").append(to_pos).append("\n");
		h(n-1, aux_pos, to_pos, from_pos);
	}
}