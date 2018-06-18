import java.util.*;

public class alpha {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		char a=obj.next().charAt(0);
		if(a>='a' && a<='z'|| a>='A' && a<='Z'){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}

	}

}
