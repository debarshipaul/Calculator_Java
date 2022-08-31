package calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char operator = 0;
		float num1, num2, result=0;
		System.out.println("Enter any one operator like +, -, *, /");
		System.out.println("Enter the values of the operands, num1 and num2 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		switch (operator) {
		case '+': result= num1+num2;
		break;
		switch (operator) 
		case '-': result= num1-num2;
		break;
		switch (operator) 
		case '*': result= num1*num2;
		break;
		switch (operator) 
		case '/': result= num1/num2;
		break;
		default: System.out.println("Invalid Operator");
		
		}
		System.out.println("The value:" + result);
	}
}

