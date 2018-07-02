import java.util.*;
public class no_palindrome {
public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int rev,sum=0,temp;
	temp=n;
	while(n>0) {
		rev=n%10;   
		sum=(sum*10)+rev;    
		n=n/10;    
	}
	if(temp==sum) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}
