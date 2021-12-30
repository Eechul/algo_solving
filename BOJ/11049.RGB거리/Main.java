import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, R, G, B;	// 집의 수, R, G, B 비용
	static int[][] rgbMap; // RBG 거리
	static int[] selectIndexMap; // RBG 거리 결과
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		rgbMap = new int[N][3];
		selectIndexMap = new int[N];
		for(int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(st.nextToken());
			G = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			rgbMap[n][0] = R;
			rgbMap[n][1] = G;
			rgbMap[n][2] = B;
			if(n == 0) { continue; } 
			else {
				rgbMap[n][0] += Math.min(rgbMap[n - 1][1], rgbMap[n - 1][2]);
				rgbMap[n][1] += Math.min(rgbMap[n - 1][0], rgbMap[n - 1][2]);
				rgbMap[n][2] += Math.min(rgbMap[n - 1][0], rgbMap[n - 1][1]);
			}
		}
		System.out.println(Math.min(Math.min(rgbMap[N-1][0], rgbMap[N-1][1]), rgbMap[N-1][2])); 
	}
}
