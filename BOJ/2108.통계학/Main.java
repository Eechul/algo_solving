import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
    
        int sum = 0;
        int avg = 0;
        int middle = 0;
        int max = 0;
        int rang = 0;
        List<Integer> A = new ArrayList<>();
        int[] cnt = new int[8000];
        StringBuilder resultSb = new StringBuilder();

        for(int i=0; i<N; i++) {
            int val = Integer.parseInt(br.readLine());
            A.add(val);
            sum += val;
            cnt[getMinusIdx(val)]++;
        }
        
        Collections.sort(A);

        avg = (int) Math.round(sum /  (double) N);
        middle = A.get((int) (N%2)+1);
        
        int maxCnt = 0;
        int maxVal = 0;
        for(int i=0; i<8000; i++) {
            if(maxCnt < cnt[i]) {
                maxCnt = cnt[i];
                maxVal = transformMinusIdx(i);
            }
        }
        System.out.println(maxVal);
	}

    public static int getMinusIdx(int num) {
        return num < 0 ?  4000 - ((num % 4000) + 1) : num;
    }

    public static int transformMinusIdx(int num) {
        return num > 3999 ?  4000 - num : num;
    }
}
