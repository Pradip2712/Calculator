package Calculator;

import java.util.Scanner;

import Operation.Operations;

public class Calculator {
	public void cal() {
		int ans = 1, y;
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		do {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.multiplication");
			System.out.println("4.Division");
			System.out.println("5. Find num is odd or even");
			

			System.out.println();
			System.out.println("enter your choice which operation you have perform");
			int choice = sc.nextInt();

			

			switch (choice) {
			case 1: {
				System.out.println("enter two num");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int add = op.addition(n1, n2);
				System.out.println("addition of two num is " + add);
				break;
			}
			case 2: {
				System.out.println("enter two num");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int sub = op.subtraction(n1, n2);
				System.out.println("subtraction of two num is " + sub);
				break;
			}
			case 3: {
				System.out.println("enter two num");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int mul = op.multiplication(n1, n2);
				System.out.println("multiplicatiion of two num is " + mul);
				break;
			}
			case 4: {
				System.out.println("enter two num");
				double n1 = sc.nextInt();
				double n2 = sc.nextInt();
				double div = op.division(n1, n2);
				System.out.println("division of two num is " + div);
				break;
			}
			case 5: {
				System.out.println("enter one num");
				int num=sc.nextInt();
				String res=op.findevenodd(num);
				System.out.println(res);
				break;
			}
			
			default: {
				System.out.println("please enter valid input");
				break;
			}

			}

			System.out.println("----------------------------------------------");
			System.out.println("Do you want to perform again any operation  \nyes to type 1 ");

			y = sc.nextInt();

		} while (y == 1);

		System.out.println("End of the all operations");
	}

}
