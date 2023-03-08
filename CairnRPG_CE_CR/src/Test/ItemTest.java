import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void info() {
        var intel = new Item("Starkiller", 25);
        assertEquals("Item name: Starkiller, Healing Power: 25",intel.Info());
    }
}