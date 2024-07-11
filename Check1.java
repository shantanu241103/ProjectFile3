public class Check1 {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);

		 int a=20;
		 
		 if(a>0)
		 {
			 a=-a;
		 }
		 else if(a<0)
		 {
			 a=-(a);
		 }
		 else
			 a=0;
		 
		 System.out.println("The new number will be:" +a);
		 

	}

}
