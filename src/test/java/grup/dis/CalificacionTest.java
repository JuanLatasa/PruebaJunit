package grup.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {
    Calificacion calif1;
    Calificacion calif2;
    private double nota;
    private String asignatura;
    private double nota2;
    private String asignatura2;

    @BeforeEach
    public void init(){
        nota=8;
        asignatura="DIS";
        nota2=5;
        asignatura2="DIS";
    }
    @Test
    public void testMismaAsig(){
        Calificacion calif1=new Calificacion(nota, asignatura);
        Calificacion calif2=new Calificacion(nota2,asignatura2);
        boolean coinciden = calif1.MismaAsig(calif2);
        assertEquals(true, coinciden);
    }


    @Test
    void testgetNota(){
        Calificacion calif1=new Calificacion(nota, asignatura);
        assertEquals(nota, calif1.getNota());
    }
    @Test
    void testgetAsignatura(){
        Calificacion calif1=new Calificacion(nota, asignatura);
        assertEquals(asignatura, calif1.getAsignatura());
    }
}
