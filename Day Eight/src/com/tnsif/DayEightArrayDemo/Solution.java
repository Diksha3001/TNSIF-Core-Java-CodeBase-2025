package com.tnsif.DayEightArrayDemo;
class Solution {
    public static int[] computeOperations(int x, int y) {
        // code here
        
       int res=(x+y);
       int res1=(x-y);
       int res2=(x*y);
       int res3=(x/y);
       int res4=(x%y);
       
       int result[]={res,res1,res3,res3,res4};
       return result; 
        
    }
    
    public static void main(String args[])
    {
        int r[]=computeOperations(10,5);
        System.out.println(r[0]+" "+r[1]+" "+r[2]+" "+r[3]+" "+r[4]);
    }
}
