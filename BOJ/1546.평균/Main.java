import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] subjectScores = new Integer[n];
        Float[] lieSubjectScores = new Float[n];
        Float sum = 0F;
        Integer maxScore = 0;
        for(int i=0; i<n; i++) {
            int score = Integer.parseInt(st.nextToken());
            subjectScores[i] = score;
            maxScore = score > maxScore ? score : maxScore;
        }
        for(int j=0; j<n; j++) {
            lieSubjectScores[j] = getLieScore(maxScore, subjectScores[j]);
            sum += lieSubjectScores[j];
        }
        System.out.println(sum / n);
    }

    public static Float getLieScore(Integer maxScore, Integer subjectScore) {
        return (subjectScore.floatValue() / maxScore.floatValue()) * 100;
    }
}
