import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	
		
	System.out.println(translateEng(input));
	}
	
	static String translateEng(int n){
		String[] a = {"zero","one","two","three","four","five","six","seven","eigjt","nine",
				"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigthteen","nineteen"};
		
		String[] b = {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","one hundred"};
		
		return "";
	}
}
