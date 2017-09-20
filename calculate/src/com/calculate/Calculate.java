package com.calculate;
import java.math.*; 

public class Calculate {
	
	//Addition
	public static int Add(int a, int b) { return (a+b);}
	public static long Add(long a, long b) { return (a+b);}
	public static float Add(float a, float b) { return (a+b);}
	public static double Add(double a, double b) { return (a+b);}
	
	//Subtraction
	public static int Subtract(int a, int b) { return (a-b);}
	public static long Subtract(long a, long b) { return (a-b);}
	public static float Subtract(float a, float b) { return (a-b);}
	public static double Subtract(double a, double b) { return (a-b);}
	
	
	//Multiplication
	public static int Product(int a, int b) { return (a*b);}
	public static long Product(long a, long b) { return (a*b);}
	public static float Product(float a, float b) { return (a*b);}
	public static double Product(double a, double b) { return (a*b);}

	//Division
	public static int Quotient(int a, int b) { return (a/b);}
	public static long Quotient(long a, long b) { return (a/b);}
	public static float Quotient(float a, float b) { return (a/b);}
	public static double Quotient(double a, double b) { return (a/b);}

	//Square root
	public static int Sqrt(int a) { return (int) Math.sqrt(a);}
	public static long Sqrt(long a) { return (long) Math.sqrt(a);}
	public static float Sqrt(float a) { return (float) Math.sqrt(a);}
	public static double Sqrt(double a) { return Math.sqrt(a);}

	//Logarithmic
	public static int Exp(int a, int b) { return (int) Math.pow(a, b);}
	public static long Exp(long a, long b) { return (long) Math.pow(a, b);}
	public static float Exp(float a, float b) { return (float) Math.pow(a, b);}
	public static double Exp(double a, double b) { return Math.pow(a, b);}

	//Base Conversion
	public static int ConvertToBinary(int val)
	{
		String bin = Integer.toBinaryString(val);
		int ret_val = Integer.parseInt(bin, 2);
		return ret_val;
	}
	public static int ConvertToHexadecimal(int val) 
	{
		
		String bin = Integer.toString(val, 16);
		int ret_val = Integer.parseInt(bin, 16);
		return ret_val;
	}
	public static int ConvertToOctal(int val) 
	{
		String bin = Integer.toOctalString(val);
		int ret_val = Integer.parseInt(bin, 8);
		return ret_val;
	}
	public static int ConvertToDecimal(String val) 
	{
		//String bin = Integer.toString(val, 10);
		int ret_val = Integer.parseInt(val, 10);
		return ret_val;
	}

}
