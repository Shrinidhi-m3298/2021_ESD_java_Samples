class LogicGates{
	int or_gates(int in1,int in2)
	{
		int a,b;
		a=in1;
		b=in2;
		int or_ans;
		or_ans=a | b;
		return or_ans;
	}


int nor_gates(int in1,int in2)
{
	int nor_ans;
	int a=in1;
	int b=in2;
	//boolean x,y;
	
	if(a==0 && b== 0)
		nor_ans=1;
	else
		nor_ans=0;
	
	return nor_ans;
}

public static void main(String agrs[]){
	int inp1=0;
	int inp2=1;
	LogicGates lg=new LogicGates();
	int result_or=lg.or_gates(inp1,inp2);
	int result_nor=lg.nor_gates(inp1,inp2);
	System.out.println("Result of or gate is "+ result_or);
	System.out.println("Result of nor gate is "+ result_nor);
	
	
}
}