package grup.dis;

public class Calificacion {
    private double nota;
    private String asignatura;

    public boolean MismaAsig(Calificacion calif){
        if (this.getAsignatura().equals(calif.getAsignatura())) {
            return true;
        }else{
            return false;
        }
    }
    public String DescripcionNota(){
        String s =new String();
        if (this.getNota()<5){
            s="No aprobado";
        }
        else{
            s="Aprobado";
        }
        return s;
    }
    public Calificacion(double nota){
        this.nota=nota;
    }
    public Calificacion(double nota, String asignatura){
        this.nota=nota;
        this.asignatura=asignatura;
    }

    public double getNota() {
        return nota;
    }

    public String getAsignatura() {
        return asignatura;
    }
    @Override
    public String toString(){
        return "calificacion{"+
                "notas="+ nota +
                "Asignaturas="+asignatura;
    }
}
