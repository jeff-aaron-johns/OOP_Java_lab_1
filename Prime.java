
public class Prime {

	public static void main(String[] args) {
	 int i;
	 int n=21;
	 int flag=0;
	 for(i=2;i<=n/2;i++)
		 if(n%i==0)
		 {
			 
		       flag=1;
		       break;
		 }
	       if(n==1)
	    	   System.out.println("1 is neither prime nor composite");
	       else
	       {
	    	   if(flag==0)
	    		   System.out.println("The number is prime");
	    	   else
	    		   System.out.println("The number is not prime");
	       }
	       
	}

}
