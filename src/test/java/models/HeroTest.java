package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_String() {
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("Alvin", newHero.getName());
    }

    @Test
    public void newHero_getAge_Int() {
        Hero newHero =  new Hero("Alvin",18,"flying", "fire");
        assertEquals(18, newHero.getAge());
    }

    @Test
    public void newHero_getPower_String() {
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("flying", newHero.getPower());
    }

    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = new Hero("Alvin",18,"flying", "fire");
        assertEquals("fire", newHero.getWeakness());
    }

    @Test
    public void getAll_returns_getAll_instancesOfHero()
    {
        Hero hero = new Hero("Alvin",18,"flying","fire");
        Hero anotherHero = new Hero("Alvin",18,"flying","fire");
        assertTrue(Hero.getAll().contains(hero));
        assertTrue(Hero.getAll().contains(anotherHero));
    }
}