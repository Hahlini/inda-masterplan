public class Human {

    int langd;
    private String namn;
    int alder;
    
    public void spring() {
        System.out.println("Nu springer " + namn);
    }
    public void sova() {
        System.out.println(namn + " sover");
    }
    public void hoppa() {
        System.out.println(namn + " hoppar");
    }
    

    public Human(String namn, int langd) {
        this.namn = namn;
        this.langd = langd;
        this.alder = 20;
    }
    

    public static void main(String[] args) {
        Human bob = new Human("Bob", 180);
        
        bob.spring();
    }
}