// TODO: make the item class
//  add the item to the players inventory
//  finish the methods
public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory;

    public Hero(float health, float attackPower, boolean isAlive) {
        super("Starkiller", health, attackPower, isAlive);
        this.inventory = new Item[5];
    }

    // getter and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }



    // methods specific to the hero class
    public boolean fight(Enemy enemy) {
        // Decide whether to use a basic attack or a special attack
        float attackPower;
        String attackType;
        double randomValue = Math.random();
        if (randomValue < 0.2) {
            // 20% chance of using special attack that does double damage
            attackPower = this.getAttackPower() * 2;
            attackType = "Force Lightning";
        } else if (randomValue < 0.4) {
            // 20% chance of using special attack that does triple damage
            attackPower = this.getAttackPower() * 3;
            attackType = "Force Push";
        } else {
            // 60% chance of using basic attack
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
            System.out.println("You hit " + enemy.getName() + " with a " + attackType + " attack, dealing " + damage + " damage.");
        } else {
            System.out.println("You missed " + enemy.getName() + ".");
        }

        // Return true if the attack landed, false otherwise
        return hitSuccess;
    }


    public int useItem(int itemIndex) {
        // code to use an item from the inventory
    }

    public boolean levelUp() {
        // code to check if the hero can level up based on experience and perform the level up if possible
    }

    public boolean addToInventory(Item item) {
        // code to add an item to the inventory
    }

    public String showInventory() {
        // code to display the contents of the inventory
    }

    public String info() {
        // code to display the hero's current level, experience, money, and other relevant information
    }
}

