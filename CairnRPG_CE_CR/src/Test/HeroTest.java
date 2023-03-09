import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    @DisplayName("Checks if a basic attack is possible")
    public void fightBasicAttack() {
        var Starkiller1 = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 100, 10, true);
        double initialEnemyHealth = enemy.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack hitting
            attackHit = Starkiller1.fight(enemy);
            if (attackHit && (enemy.getHealth() == 90)) { // if the basic attack hits, break out of the loop
                break;
            }else{ //reset the enemy health so they can fight again
                enemy.setHealth(initialEnemyHealth);
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount
            assertEquals(initialEnemyHealth - Starkiller1.getAttackPower(), enemy.getHealth());
        } else { // if the attack missed every time, fail the test
            fail("Attack missed every time due to probability, run test again.");
        }
    }

    @Test
    @DisplayName("Checks if a 2x damage attack is possible")
    public void fight2xDamageAttack() {
        var Starkiller1 = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 100, 10, true);
        double initialEnemyHealth = enemy.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack hitting
            attackHit = Starkiller1.fight(enemy);
            if (attackHit && (enemy.getHealth() == 80)) { // if the 2x damage attack hits, break out of the loop
                break;
            }else{ //reset the enemy health so they can fight again
                enemy.setHealth(initialEnemyHealth);
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount (*2)
            assertEquals(initialEnemyHealth - Starkiller1.getAttackPower() * 2, enemy.getHealth());
        } else { // if the attack missed every time, fail the test
            fail("Attack missed every time due to probability, run test again.");
        }

    }

    @Test
    @DisplayName("Checks if a 3x damage attack is possible")
    public void fight3xDamageAttack() {
        var Starkiller1 = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 100, 10, true);
        double initialEnemyHealth = enemy.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack hitting
            attackHit = Starkiller1.fight(enemy);
            if (attackHit && (enemy.getHealth() == 70)) { // if the 3x damage attack hits, break out of the loop
                break;
            }else{ //reset the enemy health so they can fight again
                enemy.setHealth(initialEnemyHealth);
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount (*3)
            assertEquals(initialEnemyHealth - Starkiller1.getAttackPower() * 3, enemy.getHealth());
        } else { // if the attack missed every time, fail the test
            fail("Attack missed every time due to probability, run test again.");
        }

    }

    @Test
    @DisplayName("Checks if a missed attack is possible")
    public void fightMisses() {
        var Starkiller1 = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 100, 10, true);
        double initialEnemyHealth = enemy.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack missing
            attackHit = Starkiller1.fight(enemy);
            if (!attackHit) { // if the basic attack MISSES, break out of the loop
                break;
            }
        }
        if (!attackHit) {
            assertEquals(attackHit, false);
        } else { // if the attack hit every time, fail the test
            fail("Attack Hit every time due to probability . Run test again to see if it will miss");
        }

    }


    @Test
    void useItem() {
        var item = new Hero(100, 10, true);
        assertEquals(20,item.useItem(1));
    }

    @Test
    void levelUp1() {
        var level = new Hero(100, 30, true);
        assertEquals(false,level.levelUp());
    }

    @Test
    void levelUp2() {
        var level = new Hero(0, 0, false);
        assertEquals(false,level.levelUp());
    }

    @Test
    void addToInventory1() {
        var add = new Hero(100, 20, true);
        Item item = new Item("Potion", 15);
        assertEquals(true, add.addToInventory(item));
    }

    @Test
    void addToInventory2() {
        var add = new Hero(100, 20, true);
        Item item = new Item(null, 0);
        assertEquals(true, add.addToInventory(item));
    }

    @Test
    void showInventory() {
        var show = new Hero(100, 10, true);
        assertEquals("Potion (20), ",show.showInventory());
    }

    @Test
    void Info1() {
        var intel = new Hero(20, 2, true);
        assertEquals("Name: Starkiller, Health: 20.0, Attack Power: 2.0, Is Alive: true, Level: 1, " +
                "Experiance: 0, Money: 0.0, Inventory: Potion (20), ", intel.info());
    }

    @Test
    void Info2() {
        var intel = new Hero(0, 0, false);
        assertEquals("Name: Starkiller, Health: 0.0, Attack Power: 0.0, Is Alive: false, Level: 1, " +
                "Experiance: 0, Money: 0.0, Inventory: Potion (20), ", intel.info());
    }
}
