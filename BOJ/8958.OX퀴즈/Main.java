import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int inc = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String ox = br.readLine();
            String[] oxList = ox.split("");
            for(int j=0; j<oxList.length; j++) {
                if(oxList[j].equals("O")) {
                    inc++;
                } else {
                    inc = 0;
                }
                sum += inc;
            }
            sb.append(sum);
            if(i != n-1) { sb.append("\n"); }
            sum = 0;
            inc = 0;
        }
        System.out.println(sb.toString());
    }
}
