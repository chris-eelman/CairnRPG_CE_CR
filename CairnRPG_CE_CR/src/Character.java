import java.util.Random;
public class Character {

    String name;
    double health;
    double attackPower;
    boolean isAlive;

    public boolean runAway(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);

        if (rand_int < 60){
            System.out.println("Failed to run away!");
            return false;
        }
        else{
            System.out.println("Successfully ran away");
            return true;
        }
    }
    public String info() {
        return "Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower + ", Is Alive: "+ isAlive;
    }

    public Character(String name, double health, double attackPower, boolean isAlive){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
