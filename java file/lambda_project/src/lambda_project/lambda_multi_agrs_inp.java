package lambda_project;
import java.util.*;
interface IC_4{
	void IC_method1(int a,float b,double c,String d);
}
public class lambda_multi_agrs_inp {
	public static void main(String[] agrs) {
		IC_4 obj=(a,b,c,d)->{
			System.out.println("int value = "+a+"\n float value : "+b+"\n Double value : "+c+"\n String value :"+d);
		};
		int i;
		float f;
		double d;
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter int value  ");
		i=sc.nextInt();
		System.out.println("enter float value  ");
		f=sc.nextFloat();
		System.out.println("enter double value  ");
		d=sc.nextDouble();
		System.out.println("enter String value  ");
		s=sc.next();

		obj.IC_method1(i, f, d, s);
	}
}
