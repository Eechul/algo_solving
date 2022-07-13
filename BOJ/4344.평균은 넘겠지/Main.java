import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			String score = br.readLine();
			String[] scoreArr = score.split(" ");
			int N = Integer.parseInt(scoreArr[0]);
			Integer caseSum = 0;
			Integer exceedN = 0;
			Float caseAvg = 0f;
			Float exceedAvg = 0f;
			for(int j=1; j<scoreArr.length; j++) {
				int _score = Integer.parseInt(scoreArr[j]);
				caseSum += _score;
			}
			caseAvg = caseSum.floatValue() / N;
			for(int k=1; k<scoreArr.length; k++) {
				int _score = Integer.parseInt(scoreArr[k]);
				if(_score > caseAvg) { exceedN++; }
			}
			exceedAvg = exceedN.floatValue() / N * 100;
			sb.append(String.format("%.3f",exceedAvg)+"%");
			if(i != C-1) { sb.append('\n'); }
		}
        System.out.println(sb.toString());
    }
}
