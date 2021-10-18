package calculator;

import java.util.Scanner;

class StringCalculator {

    public int add(String input) {
    	
        String[] str=input.split("\n,");
        
        // String to int
        
        int[] arr=new int[str.length];
        for(int i=0; i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        
        //sum ==================
        int sum=0;
        if(input.length()==0){
            return 0;
        }
        else{
            for(int i=0; i<arr.length;i++){
                sum+=arr[i];
            }
        }
        return sum;
    }



}