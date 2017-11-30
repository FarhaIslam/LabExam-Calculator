import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		while(true)
		{
			System.out.println(">");
			a = sc.next();
			double first = Double.parseDouble(a);
			if(first == 0)
				break;
			a = sc.next();
			if(a.charAt(0) == '+')
			{
					a = sc.next();
					double second = Double.parseDouble(a);
					System.out.println(second + first);
			}
			else if(a.charAt(0) == '-')
			{
				a = sc.next();
				double second = Double.parseDouble(a);
				System.out.println(first - second);
			}
			else if(a.charAt(0) == '*')
			{
				a = sc.next();
				double second = Double.parseDouble(a);
				System.out.println(first * second);
			}
			else if(a.charAt(0) == '/')
			{
				a = sc.next();
				double second = Double.parseDouble(a);
				System.out.println(first / second);
			}
			else if(a.charAt(0) == '^')
			{
				a = sc.next();
				double second = Double.parseDouble(a);
				System.out.println(Math.pow(first , second));
			}
			else {
				a = sc.next();
				System.out.println("Typing operator is beyond the scope of this calculator.");
			}
		}
		
		System.out.println("Bye, now!");
	  
	}

}
