package mx.mixteco.javatest.util.play;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low(){
        //Dice dice = new Dice(6);
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 5);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_too_big(){
        //Dice dice = new Dice(6);
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);
        Player player = new Player(dice, 5);
        assertTrue(player.play());
    }

    @Test
    public void losses_when_dice_number_is_equal(){
        //Dice dice = new Dice(6);
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player = new Player(dice, 5);
        assertFalse(player.play());
    }
}