import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void info() {
        var intel = new Item("Potion", 20);
        assertEquals("Item name: Potion, Healing Power: 20",intel.Info());
    }
}