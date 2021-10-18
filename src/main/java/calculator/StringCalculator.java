package calculator;

class StringCalculator {

    public int add(String input) {
        String[] str=input.split(", ");
        int[] arr=new int[str.length];
        for(int i=0; i<arr.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        if(input.length()==0){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        else{
            return arr[0]+arr[1];
        }
    }

}