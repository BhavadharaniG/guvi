import java.util.*;

public class noofdigits {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        for(int a=0;n>0;a++){
            a=n%10;
            n=n/10;
        	count++;
        }
        System.out.println(count);
	}

}
