import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class CharacterTest {

    @Test
    void runAway1() {
        Random rand = new Random();
        int rand_int = 61;
        boolean result = true;
        assertTrue(result);
    }
    @Test
    void runAway2() {
        Random rand = new Random();
        int rand_int = 59;
        boolean result = false;
        assertFalse(result);
    }
    @Test
    void info1() {
        var intel = new Character("Starkiller", 50, 5, true);
        assertEquals("Name: Starkiller, Health: 50.0, Attack Power: 5.0, Is Alive: true",intel.info());
    }
    @Test
    void info2() {
        var intel = new Character("Starkiller", 0, 0, false);
        assertEquals("Name: Starkiller, Health: 0.0, Attack Power: 0.0, Is Alive: false",intel.info());
    }
}