import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {
    @Test
    @DisplayName("Checks if a basic attack is possible")

    void testBasicAttack () {
        Hero Luke1 = new Hero(100, 10, true);
        Boss vader1 = new Boss(100, 10, true);

        double initialHeroHealth = Luke1.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack hitting
            attackHit = vader1.fight(Luke1);
            if (attackHit && (Luke1.getHealth() == initialHeroHealth - vader1.getAttackPower())) { // if the attack hits, break out of the loop
                break;
            }else{
                Luke1.setHealth(initialHeroHealth);
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount
            assertEquals(initialHeroHealth - vader1.getAttackPower(), Luke1.getHealth(), 0.01);
        } else { // if the attack missed every time, fail the test
            fail("Attack missed every time.");
        }
    }

    @Test
    @DisplayName("Checks if an ULTRA attack is possible")
    void testUltraAttack() {
        Hero Luke2 = new Hero(100, 10, true);
        Boss vader2 = new Boss(100, 10, true);

        double initialHeroHealth = Luke2.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack hitting
            attackHit = vader2.fight(Luke2);
            if (attackHit && (Luke2.getHealth() == initialHeroHealth - vader2.getAttackPower() * 4)) { // if the Ultra attack hits, break out of the loop
                break;
            }else{
                Luke2.setHealth(initialHeroHealth);
            }
        }
        if (attackHit) { // if the attack hit, check that the hero's health has decreased by the expected amount (4X)
            assertEquals(initialHeroHealth - vader2.getAttackPower() * 4, Luke2.getHealth(), 0.01);
        } else { // if the attack missed every time, fail the test
            fail("No attacks were ULTRA attacks, run test again ");
        }
    }

    @Test
    @DisplayName("Checks if an attack miss is possible")
    void testFightAttackMiss() {
        Hero Luke1 = new Hero(100, 10, true);
        Boss vader3 = new Boss(100, 10, true);

        double initialHeroHealth = Luke1.getHealth();
        boolean attackHit = false;
        for (int i = 0; i < 50; i++) { // run the test 50 times to increase chance of attack missing
            attackHit = vader3.fight(Luke1);
            if (!attackHit) { // if the attack misses, break out of the loop
                break;
            }
        }
        if (!attackHit) {
            assertEquals(attackHit, false);
        } else { // if the attack missed every time, fail the test
            fail("Attack Hit every time. Run test again to see if it will miss");
        }
    }

    @Test
    void infoTest1() {
        var info1TestBoss = new Boss(100, 100, true);
        assertEquals("Boss Name: Darth Vader, Health: 100.0, Attack Power: 100.0, Is Alive: true, Ultras left: 3",info1TestBoss.info());
    }

    @Test
    void infoTest2() {
        var info1TestBoss = new Boss(1000, 100, true);
        assertEquals("Boss Name: Darth Vader, Health: 1000.0, Attack Power: 100.0, Is Alive: true, Ultras left: 3",info1TestBoss.info());
    }


}
