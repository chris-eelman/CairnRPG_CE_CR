import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    //    Enemy EnemyTest = new Enemy {}
    @Test
    public void fight() {
        var something = new Hero();
        assertEquals(5, something.fight())

    }

    void useItem() {
    }

    void levelUp() {
    }

    void addToInventory() {
    }

    void showInventory() {
    }

    void Info() {
        var intel = new Hero(20, 2, true);
        assertEquals("Name: Starkiller, Health: 20, Attack Power: 2, Is Alive: true, Level: 1, Experiance: 0, Money: 0.0, Inventory:", intel.Info());
    }
}
