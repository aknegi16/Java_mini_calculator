
public class MiniCalculator {

	public static void main(String[] args) {
		
		double num1=Double.parseDouble(args[0]);
		double num2=Double.parseDouble(args[1]);
		char ch=args[2].charAt(0);
		
		 System.out.println(calculate(num1,num2,ch));
	}

	
	
public static double calculate(double num1,double num2,char ch) {

       
        
        char operator =ch;

       
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

          
            default:
                System.out.printf("You have entered wrong operator");
                return Double.MIN_VALUE;
        }

        return output;
    }
}
