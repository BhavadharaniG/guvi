import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}

}
