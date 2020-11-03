import java.util.Scanner;

public class JavaArray {
    
    int array[] = new int[5];
    public int sum;
    
    JavaArray(){
        for(int i=0; i<5; i++){
            array[i] = i+1;
        }
    }
    void sum(int value){
        if(value <= 5){
           sum= array[value+1] + array[value-1];
        }
        System.out.println("Sum: "+sum);
    }
  
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        
        JavaArray obj = new JavaArray();
        obj.sum(value);
    }
    
}
