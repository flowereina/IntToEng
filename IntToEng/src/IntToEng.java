import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	
	
		
	System.out.println(translateEng(input));
	}
	
	static String translateEng(int n){
		String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine",
				"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigthteen","nineteen"};
		String[] b = {" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one hundred"};
		String[] c = {"hundred ", "thousand "};		
		String s;
		if(n<20){return a[n];}
		else if(20<=n && n<=100){
			s = b[n/10];
			if(n%10!=0) s+=a[n%10];
			return s;
		}
		else if(100<n && n<1000){
			s = a[n/100]+c[0];
			if(n%100!=0){
				n = n%100;
				s+= b[n/10];
			}
			if(n%10!=0) s+= a[n%10];
			return s;
		}
		else return "ちょっと待ってね";
	}
}
