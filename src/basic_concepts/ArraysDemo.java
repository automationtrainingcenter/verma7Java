package basic_concepts;
/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */

public class ArraysDemo {
	public static void main(String[] args) {
		// 1D array
		// declaration
		int[] numbers = new int[6];

		// assign some values to the declared array
		numbers[0] = 12;
		numbers[1] = 14;
		numbers[2] = 13;
		numbers[3] = 17;
		numbers[4] = 18;
		numbers[5] = 15;

//		numbers[6] = 16;

		// retrieving data from the array
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);

		System.out.println("number of items in numbers array is " + numbers.length);

		// initialization of 1D array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// find the number of items in an array we can use 'length' property
		System.out.println("number of vowels = " + vowels.length);

		// retrieve the data from an initialized array
		System.out.println(vowels[0]);
		System.out.println(vowels[1]);
		System.out.println(vowels[2]);
		System.out.println(vowels[3]);
		System.out.println(vowels[4]);

		// 2D arrays
		// declaration
		int[][] matrix1 = new int[2][3];

		// storing the data
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 3;
//		*******************************
		matrix1[1][0] = 4;
		matrix1[1][1] = 5;
		matrix1[1][2] = 6;

		// retrieve the data from 2d array
		System.out.print(matrix1[0][0] + "\t");
		System.out.print(matrix1[0][1] + "\t");
		System.out.print(matrix1[0][2] + "\n");
		// ***************************************
		System.out.print(matrix1[1][0] + "\t");
		System.out.print(matrix1[1][1] + "\t");
		System.out.print(matrix1[1][2] + "\n");

		// initialization of 2D array
		int[][] matrix2 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		// retrieving data from the 2d array
		System.out.print(matrix2[0][0] + "\t");
		System.out.print(matrix2[0][1] + "\t");
		System.out.print(matrix2[0][2] + "\n");
		// **********************************
		System.out.print(matrix2[1][0] + "\t");
		System.out.print(matrix2[1][1] + "\t");
		System.out.print(matrix2[1][2] + "\n");
		// ***********************************
		System.out.print(matrix2[2][0] + "\t");
		System.out.print(matrix2[2][1] + "\t");
		System.out.print(matrix2[2][2] + "\n");

		// 2D array is nothing but an array of multiple 1D arrays and every 1D array in 
		// 2D array represents 1 row and these can have unequal number of columns also
		// unequal number of columns in 2D array
		int[][] m3 = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

		// find the number of rows in m3 array
		System.out.println("number of rows in m3 is " + m3.length);

		// find the number of columns in first row of m3
		System.out.println("number of columns in 1st row of m3 is " + m3[0].length);

		// find the number of columns in second row of m3
		System.out.println("number of columns in 2nd row of m3 is " + m3[1].length);

		// find the number of columns in third row of m3
		System.out.println("number of columns in 3rd row of m3 is " + m3[2].length);
		
		// retrieving the data
		System.out.print(m3[0][0] + "\t");
		System.out.print(m3[0][1] + "\n");
		// **********************************
		System.out.print(m3[1][0] + "\t");
		System.out.print(m3[1][1] + "\t");
		System.out.print(m3[1][2] + "\t");
		System.out.print(m3[1][3] + "\n");
		// ***********************************
		System.out.print(m3[2][0] + "\t");
		System.out.print(m3[2][1] + "\t");
		System.out.print(m3[2][2] + "\n");

	}

}
