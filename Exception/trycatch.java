import java.io.*;

public class Trycatch{
	
	public static void main(String[] args)throws NumberFormatException
	{	
		int num;
		while(true){
		try{	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			num=Integer.parseInt(br.readLine());
			System.out.println(num);
			break;		
		}
		catch(IOException e)
		{
			System.out.println("Error in input");
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("Incorrect");
		}
		}
	}	
}