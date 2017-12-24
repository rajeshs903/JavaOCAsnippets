public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
new ExceptionHandlingDemo1().go();
	}

	public void go() {
		System.out.print("A");
		try {
			stop();
			String s=null;
			s.toString();
		} catch (NullPointerException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public void stop() {
		System.out.print("E");	
		Object x = null;
		try{
		x.toString();
		}
		catch (NullPointerException e) {

		}
		System.out.print("F");
	}
}
