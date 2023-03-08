import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {


    @Test
    void getName() {
        var get = new Item();
        assertEquals("John",get.getName());
    }

    @Test
    void setName() {
        var get = new Item();
        assertEquals("Bobby",get.setName("Bobby"));
    }

    @Test
    void getHealingPower() {
        var get = new Item();
        assertEquals(,get.getHealingPower());
    }

    @Test
    void setHealingPower() {
        var get = new Item();
        assertEquals(2,get.setHealingPower(2));
    }

    @Test
    void info() {
        var get = new Item();
        assertEquals("Item name: name Healing Power: healingPower",get.Info());
    }
}