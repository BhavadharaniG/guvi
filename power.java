import java.util.*;
public class power {
    
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
        long c = 1;
         while(b!=0) {
        	 c*=a;
        	 --b;
         }
        System.out.println(c);
	}

}

