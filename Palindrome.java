
public class Palindrome {

	public static void main(String[] args) {
	 int num=454;
	 int rem;
	 int reverse=0;
	 int temp;
	 temp=num;
	 while(num>0)
	 {
		 rem=num%10;
		 reverse=rem+(reverse*10);
		 num=num/10;
	 }
	 if(reverse==temp)
	 {
		 System.out.println( temp +" is a palidrome");
		
	 }
	 else
		 System.out.println( temp + " is not a palindrome");
	}
	

}
