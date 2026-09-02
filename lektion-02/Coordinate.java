public class Coordinate {
    int x;
    int y;

    public Coordinate (int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isZero(){
        if (x == 0 && y == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}