import java.io.*;
import java.io.File;
class Product{

	public static void main(String[] args){
		try{
		System.out.println("start of program");
		//throw new ArrayIndexOutOfBoundsException();
		//System.out.println(args[0]);
		File nf = new File("/Users/aakingbehin/Documents/aakingbehin/Research/Java/cmdfiles/Books.java");
		nf.createNewFile();
		
		System.out.println("after the exception is thrown");
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("executing the ArrayIndexOutOfBoundsException catch block");
		}
		catch(IOException e){
			System.out.println("executing the ArrayIndexOutOfBoundsException catch block");
		}
		System.out.println("after the catch block");
	}
	
}
