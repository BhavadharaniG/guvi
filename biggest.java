import java.util.*;

public class biggest {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int a,b,c;
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b && a>c){
			System.out.println("A is largest "+a);
		}
		else if(b>c){
			System.out.println("B is largest "+b);
		}
		else{
			System.out.println("C is largest "+c);
		}
	}

}
