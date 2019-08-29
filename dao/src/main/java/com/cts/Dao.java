package com.cts;




public class Dao {

    public int daoSum(int a, int b) {
    	 
        return a + b;  
 }
 
 public int daoSubtraction(int a, int b) {
	 System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
     return a - b;
 }
 
 public int daoMultiplication(int a, int b) {
        
        return a * b;
 }

 public int daoDivison(int a, int b)  {
        return a / b;
 }
 
 public boolean daoEqualIntegers(int a, int b) {
        boolean result = false;
        if (a == b) {
               result = true;
        }

        return result;
 }

	
}
