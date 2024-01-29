package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary binary3=new Binary("1111");
		Binary binary4=new Binary("1010");
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());

		Binary OR= Binary.LogicalOR(binary1,binary2);
		System.out.println("The Logical OR is "+OR.getValue());

		Binary AND= Binary.LogicalAND(binary1,binary2);
		System.out.println("The Logical AND is "+AND.getValue());

        Binary MULTIPLY = Binary.multiply(binary1, binary2);
        System.out.println("Result of the multiplication: " + MULTIPLY.getValue());

    }
}
