package lab;

 class Pattern implements Runnable {
	/*
	 * Observe the result in the Output window. 
Output Window 
ACBACBACBACBACABCABCABCABCABCB
	 */
	
	public void run() {
		for(int i=1;i<=4;i++)
		System.out.print("ACB");
		System.out.print("ACA");
		
		for(int i=1;i<=4;i++)
			System.out.print("BCA");
			System.out.print("BCB");
	}}
	public class PatternPrint{
public static void main(String[] args) {
	Pattern r=new Pattern();
		r.run();
	}
}


