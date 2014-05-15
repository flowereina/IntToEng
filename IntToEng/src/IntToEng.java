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
		String[] b = {" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one hundred"};
		String[] c = {"hundred ", "thousand "};		
		String s="";
		String e;
		if(1000000<=n){
			e ="‚¿‚å‚Á‚Æ‘Ò‚Á‚Ä‚Ë";
			return e;
		}
		
		//1–œ‚©‚ç99999‚Ü‚Å
		if(10000<=n && n<100000){
			s += b[n/10000] + c[1];
			n = n%10000;
		}
		//1000‚©‚ç1–œ‚ÌŽž
		if(1000<=n && n<10000){
			s += a[n/1000] + c[1];
			n = n%1000;
		}
		//101`999‚Ü‚Å
		if(100<n && n<1000){
			s += a[n/100]+c[0];
			n = n%100;
		}
		//20‚©‚ç100‚Ü‚Å
		if(20<=n && n<=100){
			s += b[n/10];
			n= n%10;
		}
		if(n<20){s+= a[n];} //0`19‚Ü‚Å		

		return s;
	}
}
