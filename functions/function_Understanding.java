public class function_Understanding {

    //sum of two numbers
    int sum(int a, int b){
        return a+b;
    }

    //min of two numbers
    int min(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[]args){

        function_Understanding obj = new function_Understanding();
        int result = obj.sum(10,20);
        int minimum = obj.min(10, 20);
        System.out.println("\n"+result);
        System.out.println(minimum);
    }
    
}
