import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        int fiveK = 5;
        int threeK = 3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        // 계속해서 3씩 깍아주다가 
        // 5로 나눌 시, 나머지가 0일때 결과 출력.
        // 3씩 깍다가 음수가 되면, 딱 담아지지 않는다고 판단.
        while(true) {
            if(N % fiveK == 0) {
                result = (N / fiveK) + result;
                System.out.println(result);
                break;
            } else if(N < 0) { // 와일문 탈출 조건
                System.out.println(-1);
                break;
            }
            
            N = N - threeK;
            result++;
        }
    }
}