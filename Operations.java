package Operation;

public class Operations {

	public int addition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;

	}

	public int subtraction(int n1, int n2) {

		int sub = n1 - n2;
		return sub;
	}

	public int multiplication(int n1, int n2) {
		int mul = n1 * n2;
		return mul;

	}

	public double division(double n1, double n2) {
		// TODO Auto-generated method stub
		double div = n1 / n2;
		return div;

	}

	public String findevenodd(int n)
	{
		if(n%2==0)
			return "num is even";
		else
			return "num is odd";
		
		
	}

}
