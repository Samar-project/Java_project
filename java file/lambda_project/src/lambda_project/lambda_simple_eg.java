package lambda_project;

interface IC_1{
	void IC_method();
}


public class lambda_simple_eg {

	public static void main(String[] args) {
		IC_1 obj= ()->{
			System.out.println("this is the IC fun calling using lambda");
		};
			obj.IC_method();
	}
}
