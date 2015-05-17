import java.io.DataInputStream;
import java.io.IOException;


public class ErrorDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];

		try
		{
			
			System.out.println("Normal try catch");
			arr[3] = 10;
		System.out.println("After line execcuted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Not expected!");
		}

		System.out.println("Arithmetic try catch");	
		
		
		try
		{
			int ans = 100/0;
			arr[1] = 15;
			int aws = ans/arr[1];
		System.out.println(aws);	 
					}
				catch(ArithmeticException e)
		{
			System.out.println("Some arithmetic logic wrong");			
		}
		

		
		DataInputStream dis = new DataInputStream(System.in); 
		try {
			String str = dis.readLine();
		} catch (IOException e) {
					e.printStackTrace();
		}
		
		try{
					Calculate();	
		}
				catch(IOException e)
		{
					System.out.println("In IO exception");
		e.printStackTrace();	
		}
		finally{
			System.out.println("Finally. this got executed without any error trace");
				}
		//main ends
	}

	public static void Calculate() throws IOException{
		System.out.println("Code reading calculate method");
		int ans = 100/0;	
	System.out.println(ans);
	}
		
//class ends
}
