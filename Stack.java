//Stack program

public class Stack {
    
    final int max = 5;
    int stack[] = new int[max];
    int top = -1;
    
    void push(int value){
        
        if(top == max-1){
            System.out.println("Stack is overflow");
        }
        else{
            top++;
            stack[top] = value;
        }
    }
    
    void pop(){
        
        if(top == -1){
            System.out.println("Stack is underflow");
        }
        else{
            top--;
        }
    }
    
    void display(){
        
        if(top == -1){
            System.out.println("Stack is underflow");
        }
        else{
            for(int i=0; i<5; i++){
                System.out.println(stack[i]);
            }
        }
    }
    
    public static void main(String[] args){
        
        Stack st = new Stack();
        st.pop();
        st.display();
        st.push(4);
        st.push(4);
        st.pop();
        st.display();
    }
}
