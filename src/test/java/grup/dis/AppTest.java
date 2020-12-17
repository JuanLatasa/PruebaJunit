package grup.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App cal;
    double a;
    double b;
    @BeforeEach
    public void init(){
        cal=new App();
        a=4;
        b=-2;
    }
    @Test
    public void testSumar() {
        double suma=cal.Sumar(a, b);
        assertEquals(2,suma);
        }

    @Test
    public void testRestar() {
        assertEquals
                (6,cal.Restar(a, b));
    }
    @Test
    public void testMultiplicar() {
        assertEquals(-8, cal.Multiplicar(a, b));
    }
    @Test
    public void tesDividir() {
        assertEquals(-2, cal.Dividir(a, b));
    }
}
