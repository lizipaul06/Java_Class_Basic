import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before(){ printer = new Printer(30, 10); }

    @Test
    public void canSheets(){
    assertEquals(30, printer.checkSheets());}

    @Test
    public void canToner(){
        assertEquals(10, printer.checkToner());
    }
    @Test
    public void canPrint(){
        printer.printPage(3,5);
        assertEquals(15,  printer.checkSheets());
        assertEquals(7, printer.checkToner());
    }

    @Test
    public void wontPrintTooMuch(){
        printer.printPage(10,4);
        assertEquals(30, printer.checkSheets());

    }
}





