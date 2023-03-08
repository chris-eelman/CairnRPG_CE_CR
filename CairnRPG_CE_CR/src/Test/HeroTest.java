import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    public void fight1() {
        var hit = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Stormtrooper", 10, 10, true);
        assertEquals(true, hit.fight(enemy));

    }

    @Test
    void useItem() {
        var item = new Hero(100, 20, true);
        assertEquals(20,item.useItem(1));
    }

    @Test
    void levelUp() {
        var level = new Hero(100, 30, true);
        assertEquals(false,level.levelUp());
    }

    @Test
    void addToInventory() {
        var add = new Hero(100, 20, true);
        Item item = new Item("Potion", 15);
        assertEquals(true, add.addToInventory(item));
    }

    @Test
    void showInventory() {
        var show = new Hero(100, 10, true);
        assertEquals("Potion (20), ",show.showInventory());
    }

    @Test
    void Info() {
        var intel = new Hero(20, 2, true);
        assertEquals("Name: Starkiller, Health: 20.0, Attack Power: 2.0, Is Alive: true, Level: 1, " +
                "Experiance: 0, Money: 0.0, Inventory: Potion (20), ", intel.Info());
    }
}
