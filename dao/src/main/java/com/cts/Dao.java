package com.cts;




public class Dao {

    public int daoSum(int a, int b) {
        return a + b;  
 }
 
 public int daoSubtraction(int a, int b) {
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
