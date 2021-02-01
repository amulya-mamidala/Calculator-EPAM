package epam.claculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int operand1,operand2;
		System.out.println("Enter the two operands:");
		operand1=sc.nextInt();
		operand2=sc.nextInt();
		System.out.println("Enter thr operator:");
		char operator=sc.next().charAt(0);
		if(operator=='+')
			System.out.println(operand1+operand2);
		else if(operator=='-')
			System.out.println(operand1-operand2);
		else if(operator=='*')
			System.out.println(operand1*operand2);
		else if(operator=='/')
			try
			{System.out.println(operand1/operand2);}
				catch(ArithmeticException e) {
					System.out.println("Divide by zero error!");
				}
		else
			System.out.println("Invalid operator");
	}

}
