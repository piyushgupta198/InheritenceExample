//Queue program

public class Queue {
    
    final int max = 5;
    int queue[] = new int[max];
    int front = -1, rear = -1;
    
    void insertion(int value){
        
        if(rear == max-1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            queue[rear] = value;
        }
        if(front == -1){
            front++;
        }
    }
    
    void deletion(){
        
        if(front == rear){
            
            System.out.println(queue[front]+" deleted successfully");
            front = -1;
            rear = -1;
        }
        else if(front == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[front]+" deleted successfully");
            front++;
        }
    }
    
    void display(){
        
        if(front == -1){
            System.out.println("Queue is empty");
        
        }
        else{
            System.out.println("Queue is: ");
            for(int i=front; i<=rear; i++){
                System.out.println(queue[i]);
            }
        }
    }
    
    public static void main(String[] args){
        Queue q = new Queue();
        
        q.display();
        q.insertion(2);
        q.insertion(5);
        q.deletion();
        q.display();
        
    }
}
