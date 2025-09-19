public class Indamon{
	
	//Defining fields
	private String name;
	private int hp;
	private int attack;
	private int defense;
	private boolean fainted;

	//Print info method
	public void printInfo(){
		System.out.println("INFO");
		System.out.println("Name:" + name);
		System.out.println("Hp:" + hp);
		System.out.println("Attack:" + attack);
		System.out.println("Defense:" + defense);
		System.out.println("Is fainted:" + fainted);
	}
	
	//Attack method
	public void attack(Indamon indamon){
		indamon.setHp(indamon.getHp() - attack / indamon.getDefense());
		System.out.println(name + " attacked " + indamon.getName() +  " for " + ((double)attack / indamon.getDefense()));
		System.out.println(indamon.getName() +" has " + indamon.getHp() + " hp left!");
        if (indamon.fainted) {
            System.out.println(indamon.name + " fainted!");
        }
        System.out.println();
	}		
	//Getters
	public String getName(){
		return name;
	}
	public int getHp(){
		return hp;
	}
	public int getAttack(){
		return attack;
	}
	public int getDefense(){
		return defense;
	}
	public boolean isFainted(){
		return fainted;
	}

	//Setters
	public void setName(String newName){
		name = newName;
	}
	public void setHp(int newHp){
        if (newHp <= 0) {
            fainted = true;
            hp = 0;
        } else {
            hp = newHp;
        }
	}
	public void setAttack(int newAttack){
		attack = newAttack;
	}
	public void setDefense(int newDefense){
		defense = newDefense;
	}
	public void setFainted(boolean newFainted){
		fainted = newFainted;
	}

	//Constructor
	public Indamon(String newName, int newHp, int newAttack, int newDefense){
		name = newName;
		hp = newHp;
		attack = newAttack;
		defense = newDefense;
	}
}