class A{
	int a=10;
	int b=30;
	void display(){
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}

class Amain{
	public static void main(String args[]){
		String A[]={"hello","World"};
		A obj=new A();
		Amain Am =new Amain();
		obj.display();
		main(A);
		System.out.println(args[0]);
	}
}