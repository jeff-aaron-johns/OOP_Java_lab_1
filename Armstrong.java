
public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int rem;
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+ " is an armstrong ");
		}
		else 
			System.out.println(sum+ " is not an armstrong ");
	}

}
