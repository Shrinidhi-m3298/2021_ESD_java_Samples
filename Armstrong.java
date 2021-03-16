//Check the Armstrong number

class Armstrong{
   public static void  main(String args[])
   { 
		int num = 153, rem, res = 0, number;
		number = num;
		
		while(number!=0)
		{
			rem = number % 10;
			res += rem * rem * rem;
			number /= 10;
		}
		
		if(res == num)
		{
			System.out.println(num +" is an Armstrong Number");
		}
		else
		{
			System.out.println(num +" is not an Armstrong Number");
		}
	}
}