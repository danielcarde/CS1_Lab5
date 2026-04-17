import java.util.Scanner;
import java.util.InputMismatchException;


public class Lab5{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		int firstNum = 0;
		int secNum = 0;
		int factNum = 0;

		while(!exit){
			try{
				mainMenu();
				int choice = input.nextInt();
				if (choice > 0 && choice <= 5){
						System.out.println("Enter the first number");
						firstNum = input.nextInt();
						System.out.println("Enter the second number");
						secNum = input.nextInt();
					}
					else if(choice == 6){
						System.out.println("Enter the number you want to find the factorial of");
						factNum = input.nextInt();
					}
					else if(choice == 7){
						exit=true;
						System.out.println("Exiting Program! Thank You!");
						break;
					}
				switch(choice){
					case 1:
						int sum = addition(firstNum,secNum);
						System.out.println("The sum is: " + sum);
						break;
					case 2:
						int difference = subtraction(firstNum,secNum);
						System.out.println("The difference is: " + difference);
						break;
					case 3:
						int product = multiplication(firstNum,secNum);
						System.out.println("The product is: " + product);
						break;
					case 4:
						if(secNum == 0){
							System.out.println("You cannot divide by zero!");
						}
						else{
							int quotient = division(firstNum,secNum);
							System.out.println("The quotient is: " + quotient);
						}
						break;
					case 5:
						int remainder = modulus(firstNum,secNum);
						System.out.println("The remainder is: " + remainder);
						break;
					case 6:
						int factorialProduct = factorial(factNum);
						System.out.println("The product of the factorial is: " + factorialProduct);
						break;
					default:
						System.out.println("Invalid Input! Please Try Again!");
					}
			}
			catch (InputMismatchException e){
					System.out.println("Invalid Input! Please Try Again!");
					input.next();
				}
		}
	}

	public static void mainMenu(){
		System.out.println("Choose an option:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Modulus");
		System.out.println("6. Factorial");
		System.out.println("7. Exit");
	}

	public static int addition(int x, int y){
		int result = x+y;
		return result;
	}
	public static int subtraction(int x, int y){
		int result = x-y;
		return result;
	}
	public static int multiplication(int x, int y){
		int result = x*y;
		return result;
	}
	public static int division(int x, int y){
		int result = x/y;
		return result;
	}
	public static int modulus(int x, int y){
		int result = x%y;
		return result;
	}
	public static int factorial(int x){
		int factProduct = 1;
		for(int i=1;i<=x;i++){
			factProduct = i *factProduct;
		}
		int result = factProduct;
		return result;
	}

}