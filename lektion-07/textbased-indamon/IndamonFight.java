public class IndamonFight {
    Indamon playerIndamon;
    Indamon opponent;
    
    public IndamonFight(Indamon playerIndamon, Indamon opponent) {
        this.playerIndamon = playerIndamon;
        this.opponent = opponent;
    }

    public boolean fight() {
        System.out.println("We just started a fight with " + opponent.getName());
        while(!playerIndamon.isFainted() && !opponent.isFainted()) {
            playerIndamon.attack(opponent);
            if (opponent.isFainted()) {
                break;
            }
            opponent.attack(playerIndamon);
        }

        return opponent.isFainted();
    }
}
