package lambda_project;

interface IC_2{
	void IC_method(String s);
}
public class lambda_1_arg {

	public static void main(String[] args) {
		IC_2 obj=(String s)->{
			System.out.println("this is your String : "+s);
		};
		String str="my name is -------";
		obj.IC_method(str);
	}

}
