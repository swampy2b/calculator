/**
 * 
 */
package com.calculate.test;
import java.io.*;

import com.calculate.*;



/**
 * @author swampy
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Console console = System.console();
		/* 
        if (oconsole == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }
        //PrintWriter out = new PrintWriter(System.console().writer());
*/		
		System.out.println("Test functions of calculate library");
		
		// Declare variables
		Integer i0 = 9,
				i00 = 4096,
			i1 = 4;
		String	h3 = "0x01ae",
			h4 = "0xff01",
		    o5 = "0777",
			o6 = "0656",
		    b7 = "0b01000101",
			b8 = "0b00100101";
		Long l0 = 9l,
			l2 = 16l;
		
		Float f0 = 9.9f,
				f1 = 4.4f;
		
		Double d00 = 24.00,
				d11 = 48.00;
		
		
			
		//Test Integer operations
		//String method = Calculate.Add(a, b)
		String strAddFmt = "Adding %s\'s:  %d + %d = %d\n";
		String strSubFmt = "Subtracting %s\'s:  %d - %d = %d\n";
		String strProdFmt = "Multiplying %s\'s:  %d * %d = %d\n";
		String strDivFmt = "Dividing %s\'s:  %d / %d = %d\n";
		String strSqrtFmt = "Square Root of %s\'s:  sqrt(%d) = %d\n";
		String strLogFmt = "Exponential of %s\'s:  %d ^ %d = %d\n";
		
		String strFAddFmt = "Adding %s\'s:  %f + %f = %f\n";
		String strFSubFmt = "Subtracting %s\'s:  %f - %f = %f\n";
		String strFProdFmt = "Multiplying %s\'s:  %f * %f = %f\n";
		String strFDivFmt = "Dividing %s\'s:  %f / %f = %f\n";
		String strFSqrtFmt = "Square Root of %s\'s:  sqrt(%f) = %f\n";
		String strFLogFmt = "Exponential of %s\'s:  %f ^ %f = %g\n";
		
		System.out.format(strAddFmt, Integer.class.getTypeName() , i0, i1, Calculate.Add(i0, i1));
		System.out.format(strSubFmt, Integer.class.getTypeName() , i0, i1, Calculate.Subtract(i0, i1));
		System.out.format(strProdFmt, Integer.class.getTypeName() , i0, i1, Calculate.Product(i0, i1));
		System.out.format(strDivFmt, Integer.class.getTypeName() , i0, i1, Calculate.Quotient(i0, i1));
		System.out.format(strSqrtFmt, Integer.class.getTypeName() , i1, Calculate.Sqrt(i1));
		System.out.format(strLogFmt, Integer.class.getTypeName(), i0, i1, Calculate.Exp(i0,  i1));
		
		System.out.format(strAddFmt, Long.class.getTypeName() , l0, l2, Calculate.Add(l0, l2));
		System.out.format(strSubFmt, Long.class.getTypeName() , l0, l2, Calculate.Subtract(l0, l2));
		System.out.format(strProdFmt, Long.class.getTypeName() , l0, l2, Calculate.Product(l0, l2));
		System.out.format(strDivFmt, Long.class.getTypeName() , l0, l2, Calculate.Quotient(l0, l2));
		System.out.format(strSqrtFmt, Long.class.getTypeName() , l2, Calculate.Sqrt(l2));
		System.out.format(strLogFmt, Long.class.getTypeName(), l0, l2, Calculate.Exp(l0, l2));
		
		System.out.format(strFAddFmt, Float.class.getTypeName() , f0, f1, Calculate.Add(f0, f1));
		System.out.format(strFSubFmt, Float.class.getTypeName() , f0, f1, Calculate.Subtract(f0, f1));
		System.out.format(strFProdFmt, Float.class.getTypeName() , f0, f1, Calculate.Product(f0, f1));
		System.out.format(strFDivFmt, Float.class.getTypeName() , f0, f1, Calculate.Quotient(f0, f1));
		System.out.format(strFSqrtFmt, Float.class.getTypeName() , f1, Calculate.Sqrt(f1));
		System.out.format(strFLogFmt, Float.class.getTypeName(), f0, f1, Calculate.Exp(f0, f1));
		
		System.out.format(strFAddFmt, Double.class.getTypeName() , d00, d11, Calculate.Add(d00, d11));
		System.out.format(strFSubFmt, Double.class.getTypeName() , d00, d11, Calculate.Subtract(d00, d11));
		System.out.format(strFProdFmt, Double.class.getTypeName() , d00, d11, Calculate.Product(d00, d11));
		System.out.format(strFDivFmt, Double.class.getTypeName() , d00, d11, Calculate.Quotient(d00, d11));
		System.out.format(strFSqrtFmt, Double.class.getTypeName() , d11, Calculate.Sqrt(d11));
		System.out.format(strFLogFmt, Double.class.getTypeName(), d00, d11, Calculate.Exp(d00, d11));
		
		String str10Convert = "Converting, %s, to base 10: %d\n";
		String str01Convert = "Converting, %s, to base 2: %d\n";
		String str8Convert = "Converting, %s, to base 8: %d\n";
		String str16Convert = "Converting, %s, to base 16: %d\n";
		
		System.out.format(str10Convert, (h4).toUpperCase(), Calculate.ConvertToDecimal(h4));
		System.out.format(str10Convert, (o5), Calculate.ConvertToDecimal(o5));
		System.out.format(str10Convert, (b8), Calculate.ConvertToDecimal(b8));
		
		System.out.format(str16Convert, Integer.toString(i00), Calculate.ConvertToHexadecimal(i00));
//		System.out.format(str16Convert, b7, Calculate.ConvertToHexadecimal(b7));
		//System.out.flush();
				
				


	}

}
