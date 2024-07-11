import java.util.*;
public class Product1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st  no.");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd  no.");
		int b=sc.nextInt();

		
		System.out.println("Enter 3rd  no.");
		int c=sc.nextInt();
		
		int l1=a%10;
		int l2=b%10;
		int l3=c%10;
		
		int p=l1*l2*l3;
		System.out.println("PRODUCT:" +p);
				


	}

}
