
class Staticex{
	static int a;
	
	void display()
	{
		System.out.println("A value :"+ a);
		
	}
	
	Staticex(){
		a++;
	}
	
	
	public static void main(String args[])
	{
		Staticex es1 =new Staticex();
		es1.display();
		Staticex es2 =new Staticex();
		es2.display();
		
	}
}
