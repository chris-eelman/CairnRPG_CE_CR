import java.util.Random;
public class Character {

    String name;
    float health;
    float attackPower;
    boolean isAlive;

    public boolean runAway(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);

        if (rand_int < 60){
            return false;
        }
        else{
            return true;
        }
    }
    public String info() {
        return "Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower + ", Is Alive: "+ isAlive;
    }

    public Character(String name, float health, float attackPower, boolean isAlive){
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

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getAttackPower() {
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
