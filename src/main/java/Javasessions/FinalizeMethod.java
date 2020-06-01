package Javasessions;

public class FinalizeMethod {
	public static void main(String[] args) {
		Test t = new Test();
		t = null;
		System.gc();
		System.out.println("GC is done ...");
	}
	@Override
	public void finalize()
	{
		System.out.println("this is finalize method ....");
	}
}
class Test{
	@Override
	public void finalize()
	{
		System.out.println("this is Test finalize method ....");
	}
}
