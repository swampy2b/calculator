package com.calculate;
import java.math.*; 

public class Calculate {
	
	//Operations
	private static int _getRadix(Base base)
	{
		int radix = 0; // default to decimal
		switch (base)
		{
		case BINARY:
			radix = 2;
			break;
		case OCTAL:
			radix = 8;
			break;
		case HEX:
			radix = 16;
			break;
		default:
			radix = 10;
		}
		
		return radix;
	}
	
	private static String _getNumberString(int num, Base base)
	{
		String str = "";
		switch (base)
		{
		case BINARY:
			str = Integer.toBinaryString(num);
			break;
		case OCTAL:
			str = Integer.toOctalString(num);
			break;
		case HEX:
			str = Integer.toHexString(num);
			break;
		default:
			str = Integer.toString(num);
		}
		return str;
	}
	
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
	public static String ConvertToBinary(int val, Base base)
	{
//		String bin = Integer.toBinaryString(val);
//		int ret_val = Integer.parseInt(bin, 2);
		return Integer.toString(Integer.parseInt(_getNumberString(val, base), _getRadix(base)), 2);
	}
	public static String ConvertToBinary(String val, Base base)
	{
//		String bin = Integer.toBinaryString(val);
//		int ret_val = Integer.parseInt(bin, 2);
		return Integer.toString(Integer.parseInt(val, _getRadix(base)), 2);
	}
	public static String ConvertToHexadecimal(int val, Base base) 
	{
		
//		String bin = Integer.toString(val, 16);
//		int ret_val = Integer.parseInt(bin, 16);
		return Integer.toString(Integer.parseInt(_getNumberString(val, base), _getRadix(base)), 16).toUpperCase();
	}
	public static String ConvertToHexadecimal(String val, Base base) 
	{
		
//		String bin = Integer.toString(val, 16);
//		int ret_val = Integer.parseInt(bin, 16);
		return Integer.toString(Integer.parseInt(val, _getRadix(base)), 16).toUpperCase();
	}
	public static String ConvertToOctal(int val, Base base) 
	{
//		String bin = Integer.toOctalString(val);
//		int ret_val = Integer.parseInt(bin, 8);
		return Integer.toString(Integer.parseInt(_getNumberString(val, base), _getRadix(base)), 8);
	}
	public static String ConvertToOctal(String val, Base base) 
	{
//		String bin = Integer.toOctalString(val);
//		int ret_val = Integer.parseInt(bin, 8);
		return Integer.toString(Integer.parseInt(val, _getRadix(base)), 8);
	}
	public static int ConvertToDecimal(int val) 
	{
		String bin = Integer.toString(val, 10);
		int ret_val = Integer.parseInt(bin, 10);
		return ret_val;
	}
	

}
