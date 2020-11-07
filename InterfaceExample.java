
class Interface implements i{
    
    public void function() {
        System.out.println("value: "+value);
    }
   
}

interface i {
    
    void function();
    int value = 3;
    
    static void function2(int val){
        System.out.println("value of val: "+val);
    }
       
}

class Main {

    public static void main(String[] args) {
        
        Interface in = new Interface();
        in.function();
        i.function2(3);
           
    }
}
