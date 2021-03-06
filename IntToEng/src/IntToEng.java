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
			e ="ちょっと待ってね";
			return e;
		}
		
		//1万から99999まで
		if(10000<=n && n<100000){
			s += b[n/10000] + c[1];
			n = n%10000;
		}
		//1000から1万の時
		if(1000<=n && n<10000){
			s += a[n/1000] + c[1];
			n = n%1000;
		}
		//101〜999まで
		if(100<n && n<1000){
			s += a[n/100]+c[0];
			n = n%100;
		}
		//20から100まで
		if(20<=n && n<=100){
			s += b[n/10];
			n= n%10;
		}
		if(n<20){s+= a[n];} //0〜19まで		

		return s;
	}
}
