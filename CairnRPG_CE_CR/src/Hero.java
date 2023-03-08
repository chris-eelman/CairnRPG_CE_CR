// TODO:
//  finish the methods
public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory;

    public Hero(float health, float attackPower, boolean isAlive) {
        super("Starkiller", health, attackPower, isAlive);
        Item firstPotion = new Item("Potion", 20);
        this.inventory = new Item[5];
        this.inventory[0] = firstPotion;
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
        int amountHealed = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                this.health += inventory[i].getHealingPower();
                System.out.println("A " + inventory[i].getName() +" healed Johnny by "+ inventory[i].getHealingPower() +" HP");
                amountHealed += inventory[i].getHealingPower();
                break;
            }
        }
        return amountHealed;

    }

    public boolean levelUp() {
        // code to check if the hero can level up based on experience and perform the level up if possible
        if (this.experience > 100) {
            this.level++;
            System.out.println(this.getName() + " Leveled Up to Level " + this.getLevel());
            this.health *= 1.1;
            System.out.println(this.getName() + "'s health increased to " + this.getHealth());
            this.attackPower += 1.1;
            System.out.println(this.getName() + "'s attack power increased to " + this.getAttackPower());
            this.experience = 0;

            return true;
        }
        return false;
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

