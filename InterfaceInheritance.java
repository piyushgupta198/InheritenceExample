
public class InterfaceInheritance implements interface1, interface2 {

   
    public void function() {
        System.out.println("hey i am in interface 1");
    }

    public void fucntion2() {
        System.out.println("hey i am in interface 2");
    }

    public static void main(String[] args) {
        InterfaceInheritance i = new InterfaceInheritance();
        i.function();
        i.fucntion2();
    }
}

interface interface1 {

    void function();
}

interface interface2 {

    void fucntion2();
}
