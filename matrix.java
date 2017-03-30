import java.lang.Math;

public class matrix {
	int size = 0; //initilize the size of array(n)

	double[][] mymatrix = new double[0][0]; // create the matrix for use (mdata)
	
	matrix(int num) // create the matrix(_n)
	{
		size = num;//give the martix size
		mymatrix = new double[num][num];//acctually create the martix with the size 
	}
	
	
	public matrix inverse() // public method to caculate inverse of matrix
	{
		matrix mm = new matrix(size);//create the new martix
		double deter = determinant(); 
		
		for (int i = 0; i < size; i++)// use two loops to get matrix
		{
			for (int j = 0; j < size; j++) 
			{
				mm.mymatrix[i][j] = pow(-1, (double)i + (double)j) * subMatrix(j, i).determinant() / deter;
				if(mm.mymatrix[i][j] == -0)
				{
					mm.mymatrix[i][j] = 0; 
				}
			}
		}
		
		return mm;//return the value
	}
	
	
	
	public double determinant() // caculate geterminant value
	{
		double deter = 0;
		if(size == 0)// the size of matrix is 0
		{
			
		}
		else if (size == 1) //the size of matrix is 1
		{
			deter = mymatrix[0][0];
		}
		else if (size == 2) // the size of matrix is 2
		{
			deter = mymatrix[0][0] * mymatrix[1][1] - mymatrix[0][1] * mymatrix[1][0];
		}
		else 
		{
			for (int i = 0; i < size; i++)//for loop to calculate the deter
			{
				deter += (pow(-1.0, (double)i)) * mymatrix[0][i] * subMatrix(0, i).determinant();
			}
		}
		
		return deter;//return value
	}
	

	

	private static double pow(double x, double y) //pow function
	{
		return Math.pow(x, y);
	}

	public matrix subMatrix(int r, int c)//method of the subMatrix
	{
		matrix sub = new matrix(size - 1);
		
		int row = 0; 
		for (int i = 0; i < size; i++)
		{
			if (i == r) continue; 
			
			int col = 0;
			for (int j = 0; j < size; j++)
			{
				if (j == c) continue; 
				sub.mymatrix[row][col] = mymatrix[i][j];  
				col++;
			}
			
			row++;
		}
		
		return sub;
	}
	

}
