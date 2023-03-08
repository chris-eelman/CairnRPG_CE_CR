import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void runAway() {
        var
    }

    @Test
    void info() {
        var intel = new Character("Starkiller", 100, 100, true);
        assertEquals("Character name: Starkiller, Health: 100, Attack Power: 100, Is Alive: True",intel.info());
    }
}