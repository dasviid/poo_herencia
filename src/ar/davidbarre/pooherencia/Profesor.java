package ar.davidbarre.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){

    }

    public Profesor(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        return super.saludar() + " mi nombre es " + getNombre() +" "+ getApellido()
                + " y soy el profesor de " + getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura ;
    }
}
