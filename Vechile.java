public class Vechile {
    public int numberOfTyres(){
        return 4;
    }
    public static void main(String[] args){
        Driver dr = new Driver();
        System.out.println(dr.numberOfTyres());
        System.out.println(dr.driver());
    }
}
class Logistic extends Vechile{
    
    public void logistic(){
        System.out.println("I'm in Logistic");
    }
    
}
class Private extends Vechile{
    
    public void pri(){
        System.out.println("I'm in Private");
    }
    
}
class Driver extends Vechile{
    
    public String driver(){
        System.out.println("I'm in driver");
        return null;
    }
}
class Taxi extends Vechile{ 
    
    public void taxi(){
        System.out.println("I'm in taxi");
    }
}
