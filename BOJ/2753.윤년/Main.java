import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());

        System.out.println(isLeapYear(year));
    }

    public static String isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "1" : "0";
    }
}
