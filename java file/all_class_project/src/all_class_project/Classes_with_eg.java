package all_class_project;
import java.io.*;
import java.util.*;

class simple_class{
	int int_v;
	float float_v;
	String str_v;
	double double_v;
	char[] arr;
	void SC_fun() 
	{
		System.out.println(" IC_fun is calling ");
	}
}

interface Interface_class0{
	void IC_fun01();
	void IC_fun02();
}

interface Interface_class1 extends Interface_class0{//cannot implement other interface but can extends
	void IC_fun11();
	void IC_fun12();
}

interface Interface_class2 {
	void IC_fun21();
	void IC_fun22();
}

class Extended_class extends simple_class implements Interface_class1,Interface_class2{
	{//can extends only one class but implements many interface
		this.int_v=12;
		this.float_v=12.34f;
	}
	void set() 
	{
		System.out.println("float_v : "+this.float_v);
		System.out.println("int_v : "+this.int_v);
		this.str_v=" this is simple class string ";
	}
	@Override //just a notation thats going to override the method
	public void IC_fun11() {
		System.out.println("IC_fun11 called in class Extended_class ");	
	}
	//its on you,use it or not 
	public void IC_fun12() {
		System.out.println("IC_fun12 called in class Extended_class ");
	}
	@Override
	public void IC_fun01() {
		System.out.println("IC_fun01 called in class Extended_class ");
	}
	@Override
	public void IC_fun02() {
		System.out.println("IC_fun02 called in class Extended_class ");
	}
	@Override
	public void IC_fun21() {
		System.out.println("IC_fun21 called in class Extended_class ");
	}
	@Override 
	public void IC_fun22() {
		System.out.println("IC_fun22 called in class Extended_class ");	
	}

}

interface IC_lambda_use{
	void IC_lambda01();
}

interface IC_lambda_use_para{
	void IC_lambda01(int a,float b, String str);
}

interface IC_lambda_user_inp_para{
	void IC_lambda01(int a1,float b1, String str1);
}

abstract class Abs_class{
	int abs_class_int;
	abstract void Abs_class_fun();
	 void Abs_class_Norm_fun() {
		System.out.println(" Abs_class_Norm_fun() calling from abstract class ");
	}
}

public class Classes_with_eg {

	public static void main(String[] args) {
		simple_class obj1=new simple_class();
		Extended_class obj2=new Extended_class();
		//Abs_class obj3=new Abs_class(); //cannot initiate(make object) of abstract class
		obj1.SC_fun();
		System.out.println("using obj of SC_class printing value "+obj1.int_v);
		obj2.IC_fun01();
		obj2.IC_fun02();
		obj2.IC_fun11();
		obj2.IC_fun12();
		obj2.IC_fun21();
		obj2.IC_fun22();
		obj2.set();
		
		IC_lambda_use obj3=()->{
		System.out.println(" calling fun SC_lambda01() from lambda ");
		};
			obj3.IC_lambda01();
			
		IC_lambda_use_para obj4 =(int a,float b,String str)->{
			System.out.println("your values are : int "+a+" float "+b+" String :"+str);
		};
		    obj4.IC_lambda01(12, 12.22f," this String of lambda class");
		    IC_lambda_user_inp_para obj5 =(int a1,float b1,String str1)->{
		    	System.out.println("your values that u had entered are : int "+a1+" float "+b1+" String :"+str1);
		    };
		Scanner SC= new Scanner(System.in);
		System.out.println("enter int value");
		int a11=SC.nextInt();
		System.out.println("enter float value");
		float f11=SC.nextFloat();
		System.out.println("enter string value");
		String s11=SC.next();
		obj5.IC_lambda01(a11, f11, s11);
		
//		BufferInput bin =new 
	}

}
