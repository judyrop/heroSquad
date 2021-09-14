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
//    testing if it can stores instance of squad
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = new Squad("Lions","Masculinity","5");
        assertTrue(newSquad instanceof Squad);
    }
//    testing to check if name is being held
    @Test
    public void newSquad_getName_string() {
        Squad newSquad = new Squad("Lions","Masculinity","5");
        assertEquals("Lions",newSquad.getName());
    }
//    testing if Cause is being kept
    @Test
    public void newSquad_getCause_string() {
        Squad newSquad = new Squad("Lions","Masculinity","5");
        assertEquals("Masculinity",newSquad.getCause());
    }
    //testing if size is being kept
    @Test
    public void newSquad_getSize_string() {
        Squad newSquad = new Squad("Lions","Masculinity","5");
        assertEquals("5",newSquad.getSize());
    }
    //test to get by id
//    @Test
//    public void newSquad_getmId_string() {
//        Squad newSquad = new Squad("Lions","Masculinity","5");
//        Squad anotherSquad = new Squad("Lions","Masculinity","5");
//        assertEquals(1,newSquad.getmId());
//    }

}