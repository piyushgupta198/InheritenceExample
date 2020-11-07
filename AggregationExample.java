class PcConfig{
    int ram;
    String processor;
    String storage;

    public PcConfig(int ram, String processor, String storage) {
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
    }
}

class User{
    
    PcConfig config;
    int budget;

    public User(PcConfig config, int budget) {
        this.config = config;
        this.budget = budget;
    }
    
    public static void main(String[] args){
        
        PcConfig co = new PcConfig(4, "i5", "1tb");
        User user = new User(co, 40000);
        
        System.out.println("Ram: "+user.config.ram);
        System.out.println("Processor: "+user.config.processor);
        System.out.println("Storage: "+user.config.storage);
        
        System.out.println("Budget :"+user.budget);
        
    }
}