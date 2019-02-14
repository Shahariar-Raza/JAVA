/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

/**
 *
 * @author Shaha
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.printf("I am %d years old.\n", 23);
     /* Task 1: Declear two integer variable x and y. Put the minimum of those two variable in a third variable z.
     Print the value of z.*/
     int x = 10, y = 20, z;
     if(x<y)
         z = x;
     else z = y;
     System.out.printf("%d\n",z);
     
    /*Task 2: Solve the same problem using Math.min method. Math.min (x,y) should return the minimum value */
    
    z = Math.min(x, y);
    System.out.printf("%d\n",z);
    
    /*Task 3: There are many useful methods in the Math class. you can search for "Java Math API" to look at the documentation 
    https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-
    Look at the documentation to see how you can compute
    a) Exponential
    b) Square root
    calculate and print the value of 2^10 and square root of 450. Also, print the value of x where in x=2^10 */
    
    double power = Math.pow(2, 10);
    double squareRoot = Math.sqrt(450);
    System.out.printf("Power: %.0f\n", power);
    System.out.printf("Square Root: %f\n", squareRoot);
    x = 2^10;
    /*
    2 = 0010 (In Binary)
    10= 1010 (In Binary)
    ----------------------(XOR Operation)
    2^10 = 1000 =8
    */
    System.out.printf("Power : %d\n", x);
    
    /*Task 4: Find the smallest element from an arry */
    
    int data[]= {5,1,5,2,3,6,7,2};
    /*
    min= 10000;
    i | data[] | min
    ...........................
    0 |5
    1 |1
    2 |5
    3 |2
    ........
    data.length gives you the number of elements in the
        array
        
        for (int i = 0; i < data.length; i++)
        ...
        
        What should we really use for the initial minimum?
    */
    
    }
    
}
