//Calculate the area of rectangle, triangle, circle using overloading

public class Area {
    float pi = (float) 3.14;
    float area;
    
    void area(int side1, int side2, String shape){
        if(shape == "rectangle"){
            area = side1*side2;
            System.out.println("Area of Rectangle: "+area);
        }
        else if(shape == "circle"){
            area = (side1*side2)/2;
            System.out.println("Area of Triangle: "+area);
        }
    }
    
    void area(int radius){
        area = pi*radius*radius;
        System.out.println("Area of Circle: "+area);
    }
    
    public static void main(String[] args){
        Area a = new Area();
        
        a.area(3,4,"rectangle");
        a.area(3,4,"circle");
        a.area(5);
    }
    
}
