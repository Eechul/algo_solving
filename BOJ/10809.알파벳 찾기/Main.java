import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {		
		String word;
		HashMap<Character, Integer> alphaMap = new HashMap<>();
		alphaMap.put('a', -1);
		alphaMap.put('b', -1);
		alphaMap.put('c', -1);
		alphaMap.put('d', -1);
		alphaMap.put('e', -1);
		alphaMap.put('f', -1);
		alphaMap.put('g', -1);
		alphaMap.put('h', -1);
		alphaMap.put('i', -1);
		alphaMap.put('j', -1);
		alphaMap.put('k', -1);
		alphaMap.put('l', -1);
		alphaMap.put('m', -1);
		alphaMap.put('n', -1);
		alphaMap.put('o', -1);
		alphaMap.put('p', -1);
		alphaMap.put('q', -1);
		alphaMap.put('r', -1);
		alphaMap.put('s', -1);
		alphaMap.put('t', -1);
		alphaMap.put('u', -1);
		alphaMap.put('v', -1);
		alphaMap.put('w', -1);
		alphaMap.put('x', -1);
		alphaMap.put('y', -1);
		alphaMap.put('z', -1);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine();
		Iterator<Character> iter = alphaMap.keySet().iterator();
		while(iter.hasNext()) {
			Character alpha = iter.next();
			alphaMap.put(alpha, word.indexOf(alpha));
		}
		iter = alphaMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.print(alphaMap.get(iter.next()));
			System.out.print(" ");
		}
		 
	}
}
