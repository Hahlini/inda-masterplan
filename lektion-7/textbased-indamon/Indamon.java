  class Indamon {

    // Put your fields here!
    private String name;
    private int hp;
    private int attack;
    private int defense;
    boolean fainted;

    public Indamon(){
      // :)
    }

    public Indamon(String name, int hp, int attack, int defense) {
       this.name = name;
       this.hp = hp;
       this.attack = attack;
       this.defense = defense;
       this.fainted = false;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getHp() {
      return hp;
    }

    public void setHp(int hp) {
      this.hp = hp;
      if (this.hp <= 0) {
        setFainted(true);
      }
    }

    public int getAttack() {
      return attack;
    }

    public void setAttack(int attack) {
      this.attack = attack;
    }

    public int getDefense() {
      return defense;
    }

    public void setDefense(int defense) {
      this.defense = defense;
    }

    public boolean isFainted() {
      return fainted;
    }

    public void setFainted(boolean fainted) {
      this.fainted = fainted;
    }

    public void attack(Indamon foe){
      int attackDamage = this.attack / foe.getDefense();
      foe.setHp(foe.getHp()-attackDamage);
      System.out.println(this.name + " attacked " + foe.getName() + " for a total of " + attackDamage + "! " + foe.getName() + " has " + foe.getHp() + " left!");
      if (foe.isFainted()) {
        System.out.println(foe.getName() + " fainted!");
      }
    }
  } // end class