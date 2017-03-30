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
           System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")))); //print the output file

int size;
while(((size =inputfile.nextInt() )> 0))//check conditions
{
	matrix test = new matrix(size); //for loop to get the matrix
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
		matrix inter = test.inverse(); //inverse the matrix
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
       catch(IOException e)//catch the exception 
       {
           System.out.println("The file cannot be written.");

       }
	}
}
