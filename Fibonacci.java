
public class Fibonacci {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int third;
		int n=20;
		System.out.println("The first " + n + " terms are ");
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println( first + "");
			third=first+second;
			first=second;
			second=third;
		}
		
	}

}
