import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class matrixHelper {
	public static void main(String[] args) throws IOException 
	{
        FileInputStream in = new FileInputStream("input.txt");//open the input file 
        
        Scanner inputfile = new Scanner(in);//scanner read file 
        
		
       try{
           System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")))); 

int size;
while(((size =inputfile.nextInt() )> 0))
{
	matrix test = new matrix(size); 
	for(int i = 0; i < size; i++)
	{
		for(int j = 0; j < size; j++)
		{
			test.mymatrix[i][j] = inputfile.nextInt(); 
		}
	}
	System.out.println("M =");
	
	for(int i = 0; i < size; i++)
	{
		for(int j = 0; j < size; j++)
		{
			System.out.print(test.mymatrix[i][j]+" "); 
		}
		System.out.println();
	}
	
	double deter = test.determinant(); 
	System.out.print("det(M) = ");
	System.out.println(deter); 
	
	if (deter != 0)
	{
		matrix inter = test.inverse(); 
		System.out.println("Minv =");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.println(inter.mymatrix[i][j]); 
			}
			System.out.println();
		}
	}
	
}
System.out.println("Done!"); 
inputfile.close();

System.out.close();
	}
       catch(IOException e)
       {
           System.out.println("The file cannot be written.");

       }
	}
}
