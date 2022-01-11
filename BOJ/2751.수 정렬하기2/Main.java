import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
		List<Integer> seq = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            seq.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(seq);
        for(int item : seq) {
            sb.append(item).append('\n');
        }
        System.out.println(sb);
	}
}
