import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_string() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        assertEquals("Alvin",newHero.getName());
    }
    @Test
    public void newHero_getAge_int() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        assertEquals(12,newHero.getAge());
    }
    @Test
    public void newHero_getPower_string() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        assertEquals("flying",newHero.getPower());
    }
    @Test
    public void newHero_getWeakness_string() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        assertEquals("fire",newHero.getWeakness());
    }
    @Test
    public void newHero_getmId_string() {
        Hero newHero = new Hero("Alvin",12,"flying","fire");
        Hero anotherHero = new Hero("Alvin",12,"flying","fire");
        assertEquals(1,newHero.getmId());
    }
}