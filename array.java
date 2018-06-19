import java.util.*;

public class array {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("No.of array elements: ");
		int n=obj.nextInt();
		System.out.println("No.of position upto: ");
		int k=obj.nextInt();
		int sum=0;
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=obj.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Output:"+sum);	
		
	}

}
