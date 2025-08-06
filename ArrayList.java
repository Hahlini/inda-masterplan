public class ArrayList <T extends Object> {
    Object[] array;
    int length;

    public ArrayList() {
        length = 0;
    }

    public ArrayList(Object[] array){
        this.array = array;
    }

    public void add(T object){
        if (length == 0) {
            length++;
            array = new Object[1];
            array[1] = object;
        } else {
            length++;
            Object[] array = new Object[length];
            array[length - 1] = object;
        }
    }
}
