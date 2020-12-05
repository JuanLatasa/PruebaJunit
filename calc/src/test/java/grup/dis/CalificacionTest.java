package grup.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {
    Calificacion calif1;
    Calificacion calif2;
    private double nota;
    private String asignatura;
    @BeforeEach
    public void init(){
        Calificacion calif1=new Calificacion(8, "DIS");
        Calificacion calif2=new Calificacion(5, "DIS");
    }
    @Test
    public void testMismaAsig(){
        boolean coinciden = calif1.MismaAsig(calif2);
        //assertTrue(true, calif1.MismaAsig(calif2));
    }
    @Test
    void testgetNota(){

    }
    @Test
    void testgetAsignatura(){

    }
}
