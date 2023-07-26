package trycatchfinally;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("muttai muttai......" + e);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException......" + ae);
		}catch(Exception e) {
			System.out.println("Remaining Exceptions... " + e);
		}
		finally {
			System.out.println("finally called....");
		}
		System.out.println("Executed Successfully...");
		System.out.println("After exception...");
	}
}