

import java.util.*;

public class Program_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the input numbrer");
    int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	if(n%2!=0) {
		System.out.print((2*i-1)+"");
	}
	else
    {
		int a=(2*(i-1)-1);
		if(a>0) {
		System.out.println(a+" ");
        }
    }
}
}