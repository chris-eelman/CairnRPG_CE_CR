public class Boss extends Enemy {
    private int ultrasLeft;
   public Boss (float health, float attackPower, boolean isAlive) {
       super("Darth Vader", health, attackPower, isAlive);
       this.ultrasLeft = 3;
   }

       //Getters and Setters
       public int getUltrasLeft () {
           return ultrasLeft;
       }

       public void setUltrasLeft (int ultrasLeft){
           this.ultrasLeft = ultrasLeft;
       }

    public boolean fight(Hero Hero) {
        float attackPower;
        String attackType;
        double randomValue = Math.random();
        if (randomValue < 0.2 && ultrasLeft > 0) {
            // 20% chance of using ultra attack
            attackPower = this.getAttackPower() * 2;
            attackType = "Force Choke";
            ultrasLeft --;
        } else {
            // 80% chance of using basic attack
            attackPower = this.getAttackPower();
            attackType = "Lightsaber";
        }

        // Determine whether the attack misses the enemy
        double hitChance = 0.9; // assume 90% hit chance by default

        double hitRoll = Math.random();
        boolean hitSuccess = hitRoll < hitChance;

        // Calculate the damage and print a message to the console
        int damage = 0;
        if (hitSuccess) {
            damage = attackPower;
            if (damage < 0) {
                damage = 0; // damage cannot be negative
            }
            System.out.println("You hit " + hero.getName() + " with a " + attackType + " attack, dealing " + damage + " damage.");
        } else {
            System.out.println("You missed " + hero.getName() + ".");
        }

        // Return true if the attack landed, false otherwise
        return hitSuccess;
    }

    public String info() {
        //code to display the Boss's statistics
    }
}