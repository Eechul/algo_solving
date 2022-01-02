import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		int[] alphaArr = new int[123];
		int result = 0;
		for(int n=0; n<N; n++) {
			words[n] = br.readLine();
		}
		for(int i=0; i<words.length; i++) {
			boolean chkWords = true;
			for(int j=0; j<words[i].length(); j++) {
				alphaArr[words[i].charAt(j)]++;
				if(alphaArr[words[i].charAt(j)] >= 2) {
					if(alphaArr[words[i].charAt(j)] != alphaArr[words[i].charAt(j-1)]) {
						chkWords = false; 
						break;
					}
				}
			}
			alphaArr = new int[123];
			if(chkWords) { result++; }
		}
		System.out.println(result);

	}
}
