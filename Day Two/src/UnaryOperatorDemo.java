

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		int a =10;
		int b =11;
		int c =12;
		
		System.out.println("Value of a = "+a+" , Value of b = "+b+" , Value of c ="+c);
		
		a++;
		int res = (a++)-(--b)-(c--);
		System.out.println("(a++)-(--b)-(c--) ="+res);
		
		int res1= (--a)-(a++)+(++c);
		System.out.println("(--a)-(a++)+(++c) ="+res1);
	}

}
