package Exceptionhandling;

public class Testmultiplecatchblock1 {

	public static void main(String[] args) {
		try{
		
			int a[]=new int[5];
			a[5]=30/0;
			
		}
		
		catch(ArithmeticException e){System.out.println("Task 1 completed");}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("Task2 completed");}
		catch(Exception e){System.out.println("common task complited");}
		System.out.println("Reset of the code");
			
		}

	}


