import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {	
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		int first = Integer.parseInt(nums[0]);
		int second = Integer.parseInt(nums[1]);
		System.out.println(first + second);
		System.out.println(first - second);
		System.out.println(first * second);
		System.out.println(first / second);
		System.out.println(first % second);
    }
}
