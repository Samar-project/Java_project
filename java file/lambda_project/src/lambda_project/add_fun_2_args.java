package lambda_project;
import java.util.*;
interface IC_5{
	public int add(int a,int b);
}


public class add_fun_2_args {

	public static void main(String[] args) {
		IC_5 obj=(a,b)->{
			System.out.println("first value "+a+" and second value "+b+"\n A+B = "+ (a+b));
			return 0;
	};
	//getting values from user to add int value and return it..
	int a1=4;
	int b1 =5;
	obj.add(a1,b1);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first int value  ");
	a1=sc.nextInt();
	System.out.println("enter second int value  ");
	b1=sc.nextInt();
	 
	IC_5 obj1=(a,b)->{
		return(a+b);
	};
	
	System.out.println("First val "+a1+ " ,second val " +b1+ "\n a+b = " + obj1.add(a1, b1));
	
	
}
}
