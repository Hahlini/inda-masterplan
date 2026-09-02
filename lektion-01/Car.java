public class Car {
    public String regNummer;
    public int speed;

    //Vad är en konstruktor?
    
    public String getRegNummer() {
        return regNummer;
    }
    public int getSpeed() {
        return speed;
    }
    public void setRegNummer(String regNummer) {
        //Vad är this.that? Variable shadowing
        this.regNummer = regNummer;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String makeCarGo () {
        return "Vroooom... \nThe car: " + regNummer + " went at " + speed +  "km/h";
    }

    public void accelerate () {
        speed++;
    }

    public static void main(String[] args) {
        //new Car??
        Car car = new Car();
        car.speed = 30;
        car.setRegNummer("TVG001");

        System.out.println(car.makeCarGo());
    }
}
