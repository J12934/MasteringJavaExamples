package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NissanGTRTest {

    // some constants
    private static final Integer HORSE_POWER_DEFAULT = 570;
    private static final Integer HORSE_POWER_NISMO = 600;
    private static final Integer TORQUE_DEFAULT = 637;
    private static final Integer TORQUE_NISMO = 652;


    @Test
    void getHorsepowerBlack() {
        var gtr = new NissanGTR(new GTR_Edition_Black());
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerDefault() {
        var gtr = new NissanGTR(new GTR_Edition_Default());
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerNismo() {
        var gtr = new NissanGTR(new GTR_Edition_Nismo());
        assertEquals(HORSE_POWER_NISMO, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerPrestige() {
        var gtr = new NissanGTR(new GTR_Edition_Prestige());
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerTrack() {
        var gtr = new NissanGTR(new GTR_Edition_Track());
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getTorqueBlack() {
        var gtr = new NissanGTR(new GTR_Edition_Black());
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueDefault() {
        var gtr = new NissanGTR(new GTR_Edition_Default());
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueNismo() {
        var gtr = new NissanGTR(new GTR_Edition_Nismo());
        assertEquals(TORQUE_NISMO, gtr.getTorque());
    }

    @Test
    void getTorquePrestige() {
        var gtr = new NissanGTR(new GTR_Edition_Prestige());
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueTrack() {
        var gtr = new NissanGTR(new GTR_Edition_Track());
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getColorBlack() {
        var gtr = new NissanGTR(new GTR_Edition_Black());
        assertEquals("Black", gtr.getColor());
    }

    @Test
    void getColorDefault() {
        var gtr = new NissanGTR(new GTR_Edition_Default());
        assertEquals("Orange", gtr.getColor());
    }

    @Test
    void getColorNismo() {
        var gtr = new NissanGTR(new GTR_Edition_Nismo());
        assertEquals("White", gtr.getColor());
    }

    @Test
    void getColorPrestige() {
        var gtr = new NissanGTR(new GTR_Edition_Prestige());
        assertEquals("Dark Orange", gtr.getColor());
    }

    @Test
    void getColor() {
        var gtr = new NissanGTR(new GTR_Edition_Track());
        assertEquals("Blue", gtr.getColor());
    }

}