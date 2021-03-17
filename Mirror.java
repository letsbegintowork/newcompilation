import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the length of array");
		int n=sc.nextInt();
		String s[]=new String[n];
		String snew[]=new String[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			String s1=s[i];
			String s2="";
			for(int j=s1.length()-1;j>=0;j--) {
			
				 s2=s2+s1.charAt(j);
				
			}
			snew[i]=s2;
		}
		for(int i=0;i<n;i++) {
			System.out.print(snew[i]+" ");
			System.out.println("hello");
		}
		
	}

}
