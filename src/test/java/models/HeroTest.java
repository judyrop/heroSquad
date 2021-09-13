package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    public void tearDown() {
        Hero.clearAllHeros();
    }
    @Test
    public void newHero_instantiatesCorrectly_true()throws Exception {
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_String() throws Exception{
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("Alvin", newHero.getName());
    }

    @Test
    public void newHero_getAge_Int() throws Exception{
        Hero newHero =  new Hero("Alvin",18,"flying", "fire");
        assertEquals(18, newHero.getAge());
    }

    @Test
    public void newHero_getPower_String() throws Exception{
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("flying", newHero.getPower());
    }

    @Test
    public void newHero_getWeakness_String() throws Exception{
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("fire", newHero.getWeakness());
    }

    @Test
    public void getAll_returns_getAll_instancesOfHero()throws Exception {
        Hero newhero = new Hero("Alvin",18,"flying","fire");
        Hero anotherHero = new Hero("Alvin",18,"flying","fire");
        assertTrue(Hero.getAll().contains(newhero));
        assertTrue(Hero.getAll().contains(anotherHero));
    }
    @Test
    public void getId_herosInstantiateWithAnID_1() throws Exception{
        Hero.clearAllHeros();
        Hero newHero = new Hero("Alvin",18,"flying","fire");
        assertEquals(1, newHero.getId());
    }
    @Test
    public void findReturnsCorrectHero() throws Exception {
        Hero newHero = setupNewHero();
        assertEquals(1, Hero.findById(newHero.getId()).getId());
    }

    @Test
    public void findReturnsCorrectPostWhenMoreThanOnePostExists() throws Exception {
        Hero newHero = setupNewHero();
        Hero anotherHero = new Hero("Alvin",18,"flying","fire");
        assertEquals(2, Hero.findById(anotherHero.getId()).getId());
    }
    private Hero setupNewHero() {
        return new Hero("Alvin",18,"flying","fire");
    }
}