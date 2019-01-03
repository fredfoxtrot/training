import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		
		
		for (int i=0; i< tc;i++) {
			String words = sc.nextLine();
			//anagram(words.split(" ")[0],words.split(" ")[1]);
			longestString(words.split(" ")[0],words.split(" ")[1]);
		}
		
		
		
		
			
	}
	
	public static void longestString(String str1, String str2) {
		
		
		int pos = 0;
		int max = 0;
		
		for(int i=0; i < str1.length(); i ++)
		{
				for(int j=0; j<str2.length();j++) {
					
					String comp = str2.substring(pos, j-pos);
					System.out.println(comp);
					//if(str1.contains(str2))
					//	System.out.println(str2.length());
				}
				pos++;
			
		}
		
		
	}
	
	public static void anagram(String str1, String str2) {
		if(str1.length() != str2.length())
		{	
			System.out.println("NO");
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i< str1.length(); i++)
		{			
			int val1 = !map.containsKey(str1.charAt(i))?0:map.get(str1.charAt(i));
			map.put(str1.charAt(i), ++val1);
			
			int val2 = !map.containsKey(str2.charAt(i))?0:map.get(str2.charAt(i));
			map.put(str2.charAt(i), --val2);					
		}
		
		for (Character c  : map.keySet()) {
			if((map.get(c)!=0))
			{
					System.out.println("NO");
					return;
			}

		}
		
		System.out.println("YES");
		
	}

}

