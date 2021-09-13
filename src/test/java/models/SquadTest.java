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
//    @Test
////    public void newSquad_instantiatesCorrectly_true()throws Exception {
////        Squad newSquad = new Squad("Lions",5,"fueling");
////        assertEquals(newSquad instanceof Squad);
////    }
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
    @Test
    public void getAll_returns_getAll_instancesOfSquad()throws Exception {
        Squad newSquad = new Squad("lions", 5, "fueling");
        Squad anotherSquad = new Squad("lions",5, "fueling");
        assertTrue(Squad.getAll().contains(newSquad));
        assertTrue(Squad.getAll().contains(anotherSquad));
    }
    @Test
    public void newSquad_allArraySquadMembers_Array() {
        Hero newHero = Hero.setUpNewHero();
        Squad newSquad = Squad.setUpNewSquad("lions",5,"fueling");
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Alvin",newSquad.getSquadMembers().get(0).getName());
    }
    @Test
    public void addMember_addsMemberToSquad_Hero(){
        Hero newHero = Hero.setUpNewHero();
        Squad arraySquad = Squad.setUpNewSquad("lions",5,"fueling");
        Squad newSquad = Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals(2,newSquad.getSquadMembers().size());
    }

}