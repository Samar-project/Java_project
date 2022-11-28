package lambda_project;

interface IC_3{
	void IC_method(int i,float f,String s);
}
public class lambda_multi_args {

	public static void main(String[] args) {
		IC_3 obj=(int i,float f,String s)->{
			System.out.println("int value = "+i+"\n float value : "+f+"\n String value :"+s);
		};
		obj.IC_method(123, 12.43f, " this is args String.");
	}
}
