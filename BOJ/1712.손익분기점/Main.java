import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 판매량 'sales'에 대한 식을 세우면 방정식이 도출된다. 그대로 코딩.
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        if(B >= C) { System.out.println("-1"); return ;}
		long sales = A / (C-B);
        
        if(sales+1 <= 0) { System.out.println("-1"); }
        else { System.out.println(sales+1); }
        
	}
}
