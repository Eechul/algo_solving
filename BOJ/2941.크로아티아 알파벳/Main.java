import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		String[] croatiaToAlpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String I = br.readLine();
		for(String alpha : croatiaToAlpha) {
			I = I.replace(alpha, "*");
		}
		System.out.println(I.length());
	}
}