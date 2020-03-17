import org.junit.Test;

import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {



    WaterBottle bottle;
    @Before
    public void before(){
        bottle = new WaterBottle (100);
    }


    @Test
    public void hasWater(){
        assertEquals(100, bottle.checkWater());
    }

    @Test
    public void canEmpty(){
        bottle.emptyDrink();
        assertEquals(0, bottle.checkWater());
    }

    @Test
    public void canDrink(){
        bottle.takeDrink();
        assertEquals(90, bottle.checkWater());
    }

     @Test
    public void fillDrink(){
        bottle.takeDrink();
        bottle.fillDrink();
        assertEquals(100,bottle.checkWater());
     }


}
