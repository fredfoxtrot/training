import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		
		
		for (int i=0; i< tc;i++) {
		String str = sc.nextLine();
		
		palindromeCheck(str);
		
		}
	}
	
	public static void palindromeCheck(String str) {
		
		int len = str.length();
		
		String[] split = str.split("");
		
		String[] newStr = new String[len];
		
		int idx = 0;
		//get the valid string
		for (int i = 0; i < len; i++) {
			if(split[i].matches("^[a-zA-Z0-9]$"))
			{
				newStr[idx++]=split[i];				
			}				
		}
		//newStr[idx]="\0";
		
		//System.out.println();
		//check if palindrome
		int j=idx-1;
		for (int i = 0; i < idx; i++) {
			if(! newStr[i].equalsIgnoreCase(newStr[j-i])) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
		return;
	}

}
