import java.util.Scanner;

public class FourInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		
		
		for (int i=0; i< tc;i++) {
			int len = sc.nextInt();
			sc.nextLine();
			
			String arr = sc.nextLine();
			
			int iArr[] = new int[len];
			
			for (int j=0; j < len; j++) {
				iArr[j]=Integer.parseInt(arr.split(" ")[j]);
			}
			
			int target = sc.nextInt();
			sc.nextLine();
			
			//anagram(words.split(" ")[0],words.split(" ")[1]);@
			FourIntegerCheck2(iArr, target , len);
		}
		
		//FourIntegerCheck2(new int[] {1,2,3,4,5,6}, 9, 6);
		
		
	}
	
	public static void FourIntegerCheck(int[] arr, int target, int length) {
		
		int sum=0;
		
		for (int j=0; j < length-3 ; j++) {
			sum=0;
			
			for(int i = j; i <= j+3; i++) {
				sum+=arr[i];	
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			if(sum==target)
			{
				System.out.println("1");
				return;
			}
			
		}
		System.out.println("0");
		return;
	}
	
	public static void FourIntegerCheck2(int[] A, int X, int n) {
		 
		
		
		// Fix the first element and find other three 
        for (int i = 0; i < n - 3; i++)  
        { 
            // Fix the second element and find other two 
            for (int j = i + 1; j < n - 2; j++)  
            { 
                // Fix the third element and find the fourth 
                for (int k = j + 1; k < n - 1; k++)  
                { 
                    // find the fourth 
                    for (int l = k + 1; l < n; l++)  
                    { 
                    		//System.out.println(A[i]+" "+A[j]+" "+A[k]+" "+A[l]); 
                        if (A[i] + A[j] + A[k] + A[l] == X)  {
                            System.out.println("1"); 
                            return;
                        }
                    } 
                } 
            } 
        } 
        
        System.out.println("0");
        return;
		
	}
}


