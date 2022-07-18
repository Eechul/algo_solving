import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int ALPHA_RANG = 26;
		int nums[] = new int[ALPHA_RANG];
		String alphas = br.readLine();
		alphas = alphas.toLowerCase();
		for(int i=0; i<alphas.length(); i++) {
			int idx = alphas.charAt(i) - 97;
			nums[idx]++;
		}

		int max = 0;
		int maxIdx = 0;
		boolean isDuplicated = false;
		for(int i=0; i<ALPHA_RANG; i++) {
			if(max < nums[i]) {
				maxIdx = i;
				max = nums[i];
				isDuplicated = false;
			} else if(max == nums[i]) {
				isDuplicated = true;
			}
		}
		if(isDuplicated) {
			System.out.println("?");
		} else {
			System.out.println((char) (maxIdx + 97-32));
		}
		
    }
}
