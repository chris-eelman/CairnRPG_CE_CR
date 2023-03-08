public class Enemy {
    public class Enemy extends Character{

        private int magicPower;


    public Enemy (float health, float attackPower, boolean isAlive) {
        super("Stormtrooper",health, attackPower, isAlive);
        this.magicPower = 30;
    }

    public Enemy (String name, float health, float attackPower, boolean isAlive) {
        super(name, health, attackPower, isAlive);
    }
}
