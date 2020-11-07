
interface Shape {

    public void abstractFunction();
}

class TwoD implements Shape {

    @Override
    public void abstractFunction() {
        System.out.println("You are in 2D segment with abstract fuction");
    }

    public void twoD() {
        System.out.println("You are in 2d segment with own function");
    }

}

class ThreeD implements Shape {

    @Override
    public void abstractFunction() {
        System.out.println("You are in 3D segment with abstraction function");
    }

    public void threeD() {
        System.out.println("You are in 3d segment with own function");
    }
}

class Rectangle extends TwoD implements Shape {

}

class Square extends TwoD implements Shape {

}

class Circle extends TwoD implements Shape {

}

class Sphere extends ThreeD implements Shape {

}

class Cube extends ThreeD implements Shape {

}

class MainClass {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        rectangle.abstractFunction();
        rectangle.twoD();
         
        square.abstractFunction();
        square.twoD();
        
        circle.abstractFunction();
        circle.twoD();
        
        sphere.abstractFunction();
        sphere.threeD();
        
        cube.abstractFunction();
        cube.threeD();
    }
}
