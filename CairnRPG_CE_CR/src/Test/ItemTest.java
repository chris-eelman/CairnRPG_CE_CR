import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void info1() {
        var intel = new Item("Potion", 20);
        assertEquals("Item name: Potion, Healing Power: 20",intel.info());
    }

    @Test
    void info2() {
        var intel = new Item(null, 0);
        assertEquals("Item name: null, Healing Power: 0",intel.info());
    }
}