import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(N >= 1) {
            sb.append(N);
            sb.append(System.getProperty("line.separator"));
            N--;
        }
        System.out.println(sb.toString());
    }
}
