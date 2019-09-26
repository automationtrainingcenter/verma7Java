package basic_concepts;
/*
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean
* 		char which will store single character - Character
*		byte store integer values - Byte
*		short store integer values - Short
*		int store integer values -Integer
*		long store integer values - Long
*		float store floating point number -Float
*		double store floating point number - Double
* 	
* 2. reference
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/

public class DataTypesDemo {
	
	public static void main(String[] args) {
		// boolean
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		
		
		// character 
		char ch = 'j';
		System.out.println("character value is "+ch);
		System.out.println("charcter size in bits is"+Character.SIZE);
		System.out.println("Character size is bytes is "+Character.BYTES);
		System.out.println("min value of Character data type is "+Character.MIN_VALUE);
		System.out.println("max value of Character data type is "+Character.MAX_VALUE);
		
		
		// byte
		byte by = 120;
		System.out.println("byte value is "+by);
		System.out.println("byte size in bits is"+Byte.SIZE);
		System.out.println("byte size is bytes is "+Byte.BYTES);
		System.out.println("min value of byte data type is "+Byte.MIN_VALUE);
		System.out.println("max value of byte data type is "+Byte.MAX_VALUE);
		
		
		// short
		short sh = 23456;
		System.out.println("short value is "+sh);
		System.out.println("short size in bits is"+Short.SIZE);
		System.out.println("short size is bytes is "+Short.BYTES);
		System.out.println("min value of short data type is "+Short.MIN_VALUE);
		System.out.println("max value of short data type is "+Short.MAX_VALUE);
		
		// int
		int i = 1234567;
		System.out.println("int value is "+i);
		System.out.println("int size in bits is"+Integer.SIZE);
		System.out.println("int size is bytes is "+Integer.BYTES);
		System.out.println("min value of int data type is "+Integer.MIN_VALUE);
		System.out.println("max value of int data type is "+Integer.MAX_VALUE);
		
		
		// long 
		long l = 9876543210l;
		System.out.println("long value is "+l);
		System.out.println("long size in bits is"+Long.SIZE);
		System.out.println("long size is bytes is "+Long.BYTES);
		System.out.println("min value of long data type is "+Long.MIN_VALUE);
		System.out.println("max value of long data type is "+Long.MAX_VALUE);
		
		// float
		float f = 12.321f;
		System.out.println("float value is "+f);
		System.out.println("float size in bits is"+Float.SIZE);
		System.out.println("float size is bytes is "+Float.BYTES);
		System.out.println("min value of float data type is "+Float.MIN_VALUE);
		System.out.println("max value of float data type is "+Float.MAX_VALUE);		
		
		//double 
		double d = 123.455;
		System.out.println("double value is "+d);
		System.out.println("double size in bits is"+Double.SIZE);
		System.out.println("double size is bytes is "+Double.BYTES);
		System.out.println("min value of double data type is "+Double.MIN_VALUE);
		System.out.println("max value of double data type is "+Double.MAX_VALUE);
		
		
		Integer iObj = new Integer(1234);
		System.out.println(iObj);
		
		// type casting : converting one primitive type to another primitive type
		// up casting : converting lower memory type to higher memory type
		short shLow = 1234;
		int iHigh;
		iHigh = shLow;
		System.out.println("iHigh = "+iHigh);
		
		// down casting : converting higher memory type to lower memory type
		// lower_data_type_var_name = (lower_data_type) higher_data_type_var_name;
		short shHigh = 128;
		byte byLow;
		byLow = (byte) shHigh;
		System.out.println("byLow = "+byLow);
		
		
		
	}

}
