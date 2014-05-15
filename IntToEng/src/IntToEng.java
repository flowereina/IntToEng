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
		else if(1000<=	n && n<=10000){
			s = a[n/1000] + c[1];
			if(n%1000!=0 && n%1000/100!=0){
				s += a[n%1000/100] + c[0];
			}
			if(n%100!=0){
				n = n%100;
				if(n<20){
					s+=a[n];
				}
				else{
					s+= b[n/10];
					if(n%10!=0) s+= a[n%10];
				}
			}
			return s;
		}
		else if(10000<n && n<100000){
			s = b[n/10000] + c[1];
			n = n - (n/10000)*10000;
			
			if(1000<=n && n<10000)s = a[n/1000] + c[1];
			if(n%1000!=0 && n%1000/100!=0){
				s += a[n%1000/100] + c[0];
			}
			if(n%100!=0){
				n = n%100;
				if(n<20){
					s+=a[n];
				}
				else{
					s+= b[n/10];
					if(n%10!=0) s+= a[n%10];
				}
			}
			return s;
			
		}
		else return "‚¿‚å‚Á‚Æ‘Ò‚Á‚Ä‚Ë";
	}
}
