public class Armour implements Item {
    private String name;
    private String description;
    private int defense;

    @Override
    public void inspect(){
        System.out.printf("%s\nIt has a defensive strength of %d !", description, defense);
    }
    @Override
    public boolean use(){
        System.out.printf("You eqiupped the armour: %s", name);
        return true;
    };
}
