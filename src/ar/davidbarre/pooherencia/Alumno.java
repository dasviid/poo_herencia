package ar.davidbarre.pooherencia;

public class Alumno extends Persona {
    private String colegio;
    private double notaMatematica;
    private double notaCastellano;
    private double notaFisica;

    public Alumno(){
    }

    public Alumno(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String colegio){
        super(nombre,apellido,edad);
        this.colegio = colegio;
    }
    public Alumno(String nombre, String apellido, int edad, String colegio,
                  double notaMatematica,double notaCastellano,double notaFisica){
        this(nombre,apellido,edad,colegio);
        this.notaCastellano = notaCastellano;
        this.notaFisica = notaFisica;
        this.notaMatematica = notaMatematica;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaFisica() {
        return notaFisica;
    }

    public void setNotaFisica(double notaFisica) {
        this.notaFisica = notaFisica;
    }

    @Override
    public String saludar(){
        return super.saludar() + " mi nombre es " + getNombre() +" "+ getApellido();
    }

    public double calcularPromedio(){
      //  System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (notaMatematica + notaFisica + notaCastellano )/3;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolegio='" + colegio + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaFisica=" + notaFisica +
                ", promedio= " + this.calcularPromedio();
    }
}
