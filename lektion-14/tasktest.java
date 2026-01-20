
public class tasktest {
    public static void main(String[] args) {
       Device dev = new Printer("Skrivare");
       dev.getName(); 
    }
}

class Device {
    String name;

    public Device(String aName) {
       this.name = aName; 
    }    
    
    public String getName() {
        return name;
    }
}

class Printer extends Device {
    public Printer(String aName) {
        super(aName);
    }
}
