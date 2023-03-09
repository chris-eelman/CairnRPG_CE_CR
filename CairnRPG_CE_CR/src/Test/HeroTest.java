import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    public void fight1() {
        var Starkiller1 = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 100, 10, true);
//        assertEquals(true, hit.fight(enemy));
        double initialEnemyHealth = enemy.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 10; i++) { // run the test 10 times to increase chance of attack hitting
            attackHit = Starkiller1.fight(enemy);
            if (attackHit) { // if the attack hits, break out of the loop
                break;
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount
            assertEquals(initialEnemyHealth - Starkiller1.getAttackPower(), enemy.getHealth(), 0.01);
        } else { // if the attack missed every time, fail the test
            fail("Attack missed every time.");
        }
    }

//    @Test
//    public void fight2() {
//        var hit = new Hero(100, 10, true);
//        Enemy enemy = new Enemy("Stormtrooper", 10, 10, true);
//        assertEquals(false, hit.fight(enemy));

//    }

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
                "Experiance: 0, Money: 0.0, Inventory: Potion (20), ", intel.Info());
    }

    @Test
    void Info2() {
        var intel = new Hero(0, 0, false);
        assertEquals("Name: Starkiller, Health: 0.0, Attack Power: 0.0, Is Alive: false, Level: 1, " +
                "Experiance: 0, Money: 0.0, Inventory: Potion (20), ", intel.Info());
    }
}
