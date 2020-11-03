//Question 2: WAP to initialize 4 elements int array. Calculate and display the average of its value

class Average{
    public int value[] = new int[4]; 
    
    public Average(){
        for(int i=0; i<4; i++){
            value[i] = i+3;
        }
    }
    
    void display(){
       for(int i=0; i<4; i++){
        System.out.println("value of value: "+value[i]);
      }
    }
    
    void findAverage(){
        int sum = 0;
        float averageValue;
        
        for(int i=0; i<4; i++){
            sum += value[i];
        }
        averageValue = sum/4;
        System.out.println("Average Value : "+averageValue); 
    }
    
    public static void main(String[] args){
        Average average = new Average();
        average.display();
        average.findAverage();
    }
}