import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
	
	System.out.println("Enter the second number:");
	int num2=sc.nextInt();

	System.out.println("perform any operation(+,-,/,%):");
	int operation=sc.next().charAt(0);
	
	int result;
	
	switch(operation){
	case'+':
	result=num1+num2;
	System.out.println("result is:"+result);
	break;

	case'-':
	result=num1+num2;
	System.out.println("result is:"+result);
	break;


	case'*':
	result=num1+num2;
	System.out.println("result is:"+result);
	break;

	case'/':
	result=num1+num2;
	System.out.println("result is:"+result);
	break;
	default:
	System.out.println("Invalid input");
	break;
}
sc.close();
}
}

