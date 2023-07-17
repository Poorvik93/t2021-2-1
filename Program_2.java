import java.util.*;

public class Program_2 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");

	int n=sc.nextInt();
	int p=0;
	int s=1; 
	while(p<n){
		if(s%2!=0) {
		System.out.println(s + "\t");
		p++;
		}
		s++;
	}
}
 }
