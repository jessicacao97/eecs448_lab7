import static org.junit.Assert.*;

import org.junit.Test;


public class matrixTest {

	@Test
	public void test1() {
		matrix matrix = new matrix(3);
		//double[][] matrix = new double [3][3];
		
		matrix.mymatrix[0][0] = 5;
		matrix.mymatrix[0][1] = 4;
		matrix.mymatrix[0][2] = 3;
		matrix.mymatrix[1][0] = 6;
		matrix.mymatrix[1][1] = 9;
		matrix.mymatrix[1][2] = 1;
		matrix.mymatrix[2][0] = 2;
		matrix.mymatrix[2][1] = 5;
		matrix.mymatrix[2][2] = 3;
		
		assertEquals(82.0, matrix.determinant(), 0.001);

	}

	@Test
	public void testD() {
		matrix matrix = new matrix(3);
		//double[][] matrix = new double [3][3];
		
		matrix.mymatrix[0][0] = 5;
		matrix.mymatrix[0][1] = 4;
		matrix.mymatrix[0][2] = 3;
		matrix.mymatrix[1][0] = 6;
		matrix.mymatrix[1][1] = 9;
		matrix.mymatrix[1][2] = 1;
		matrix.mymatrix[2][0] = 2;
		matrix.mymatrix[2][1] = 5;
		matrix.mymatrix[2][2] = 3;


		assertEquals(82.0, matrix.determinant(), 0.001);
	}
	@Test
	public final void testSub() {
		matrix matrix = new matrix(2);
		matrix.mymatrix[0][0] = 1;
		matrix.mymatrix[0][1] = 2;
		matrix.mymatrix[1][0] = 3;
		matrix.mymatrix[1][1] = 4;
		
		matrix tester = new matrix(1);
		tester.mymatrix[0][0] = 4;
		
		assertArrayEquals(tester.mymatrix, matrix.subMatrix(0,0).mymatrix);
	}
}
