import java.util.Scanner;

public class Program_1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the Numbers");
	double a =sc.nextDouble();
	double b = sc.nextDouble();
		System.out.println("Enter the operation");
	String op=sc.next();
	calculatorOperation c= new calculatorOperation(a,b,op);
	if(op.equals("+")) {
		double result=c.Add();
		System.out.println(result);
	}
	else if(op.equals("-")){
		double result=c.sub();
		System.out.println(result);
	}
	else if(op.equals("*")){
		double result=c.mul();
		System.out.println(result);
	}
	else if(op.equals("/")){
		double result=c.div();
		System.out.println(result);
	}
	else {
		System.out.println("Please Enter valid input...");
	}
 }
}

 class calculatorOperation{
	double a;
	double b;
	String op;
	
	calculatorOperation(double a,double b,String op){
		this.a=a;
		this.b=b;
		this.op=op;
	}
	
	public double Add() {
		return a+b;
	}

	public double sub() {
		return a-b;
	}

	public double mul() {
		return a*b;
	}

	public double div() {
		return a/b;
	}
}