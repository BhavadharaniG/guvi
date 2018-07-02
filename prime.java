import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
         int n=obj.nextInt();
         boolean flag=false;
         for(int i=2;i<=n/2;++i) {
        	 if(n%i==0) {
        		 flag = true;
                 break;
        	 }
         }
         if(!flag) {
        	 System.out.println("yes");
         }
         else {
        	 System.out.println("No");
         }
       
	}

}
