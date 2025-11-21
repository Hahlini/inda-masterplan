public class Weapon implements Item {
    public String name;
    public String description;
    public int damage;

    @Override
    public void inspect(){
        System.out.printf("%s\nIt does %d damage!", description, damage);
    }
    @Override
    public boolean use(){
        return false;
    };

    public void attack(Enemy enemy) {
        System.out.println("You attacked an enemy with %s for %d damage");
    }
}
