// Java Program to show Deep Cloning

// Importing java input/output libraries
import java.io.*;

// Class
public class cloning implements Cloneable {

// Defining a method as clone method is protected 
// Defining within the class called cloneable interface 
public Object clone() throws CloneNotSupportedException
{
return (cloning)super.clone(); 
}

	// Main driver method
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// Creating first object of GFG class
		cloning t1 = new cloning();

		// Using clone() method to create duplicate object
		// of t1 reference variable
		// else for every object manually object needs
		// to be copied in deep copying
		// clone() ease this manual effort
		cloning t2 = (cloning)t1.clone();

		// Comparing two objects just after deep copying
		// Returning true for shallow(by default) copying
		// Returning false for deep copying
		System.out.println(t1 == t2);
	}
}
