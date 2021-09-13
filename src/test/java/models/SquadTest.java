package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void newSquad_instantiatesCorrectly_true()throws Exception {
        Squad newSquad = new Squad("Lions",5,"fueling");
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String() throws Exception{
        Squad newSquad = new Squad("Lions",5,"fueling");
        assertEquals("Lions", newSquad.getName());
    }
    @Test
    public void newSquad_getSize_Int() throws Exception{
        Squad newSquad = new Squad("Lions",5,"fueling");
        assertEquals(5, newSquad.getSize());
    }
    @Test
    public void newSquad_getCause_String() throws Exception{
        Squad newSquad = new Squad("Lions",5,"fueling");
        assertEquals("fueling", newSquad.getCause());
    }
    @Test
    public void newSquad_getSquadMembers_Array() {
        Squad newSquad = Squad.setUpNewSquad("Lions",5,"fueling");
        Hero newHero = Hero.setUpNewHero();
        Hero anotherHero = Hero.setUpNewHero();
        newSquad.setSquadMembers(newHero);
        assertEquals("Alvin",newSquad.getSquadMembers().get(0).getName());
    }

}