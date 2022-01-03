import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int H;
		int W;
		int N;
		int[] result = new int[T];
		for(int t=0; t<T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());

			int[][] hotel = new int[H+1][W+1];
			for(int i=1; i<H+1; i++) {
				for(int j=1; j<W+1; j++) {
					hotel[i][j] = (i*100)+j;
				}
			}
			int nowW = (N / H)+1;
			int nowH = (N % H) == 0 ? H : (N % H);
			result[t] = hotel[nowH][nowW];
		}
		for(int r : result) {
			System.out.println(r);
		}
	}
}