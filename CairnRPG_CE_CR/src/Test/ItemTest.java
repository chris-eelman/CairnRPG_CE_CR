import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {


    @Test
    void getName() {
        var get = new Item("jofnfjg", 24);
        assertEquals("John",get.getName());
    }

    @Test
    void setName() {
        var get = new Item("John", 2);
        get.setName("Bobby");
        assertEquals("Bobby",get.getName());
    }

    @Test
    void getHealingPower() {
        var get = new Item("John", 25);
        assertEquals(25,get.getHealingPower());
    }

    @Test
    void setHealingPower() {
        var get = new Item("John", 25);
        get.setHealingPower(24);
        assertEquals(24,get.getHealingPower());
    }

    @Test
    void info() {
        var get = new Item("John", 25);
        assertEquals("Item name: name Healing Power: healingPower",get.Info());
    }
}