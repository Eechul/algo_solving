import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        
    public static int K;
    public static int N;
    public static int[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        answer = new int[T];
        for(int t=0; t<T; t++) {
            K = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());
            int[][] apt = getAPT();
            answer[t] = apt[K][N];
        }
        for(int t=0; t<T; t++) {
            System.out.println(answer[t]);
        }
    }
    public static int[][] getAPT() {
        int[][] result = new int[K+1][N+1];
        for(int i=0; i<=K; i++) {
            result[i][0] = 0;
            for(int j=1; j<=N; j++) {
                if(i == 0) { result[i][j] = j; }
                else {
                    result[i][j] = result[i-1][j] + result[i][j-1];
                }
            }
        }
        return result;
    }
}