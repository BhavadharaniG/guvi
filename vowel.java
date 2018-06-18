import java.util.*;

public class vowel {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		char a=obj.next().charAt(0);
		if(a =='a' || a == 'e' || a == 'i' || a == 'o'|| a == 'u'){
			System.out.println("vowel");
		}
		else if(a>='a' && a<='z')
			System.out.println("consonent");
		else{
			System.out.println("Invalid");
		}
		

	}

}
