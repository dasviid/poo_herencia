package ar.davidbarre.pooherencia;

public class Alumno extends Persona{
    private String colegio;
    private double notaMatematica;
    private double notaCastellano;
    private double notaFisica;


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
}