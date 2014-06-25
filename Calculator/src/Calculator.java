
public class Calculator {

	public static void main(String[] args) {
		
		Addition addit = new Addition();		
		int myResult = addit.runAddition(4, 6);		
		System.out.println(    myResult    );

	
		Sub var = new Sub();		
		int result = var.Subtraction(5, 2);		
		System.out.println(result);
		
		Div divs = new Div();
		double rez = divs.rundiv(100, 3);
		System.out.println(rez);
		
		Mult res1 = new Mult();
		int multi1= res1.Multi(2, 5);
		System.out.println(multi1);
	}

}
