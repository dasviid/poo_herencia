package ar.davidbarre.ejemplo;

import ar.davidbarre.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de objeto alumno =======");
        Alumno alumno = new Alumno();
        alumno.setNombre("Pepe");
        alumno.setApellido("Gonzalez");
        alumno.setColegio("Insituto nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaFisica(3.3);
        alumno.setNotaMatematica(5.2);

        System.out.println("======= Creando la instancia de objeto alumno internacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Jake");
        alumnoInt.setApellido("Paul");
        alumnoInt.setPais("Francia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Nacional");
        alumnoInt.setNotaIdiomas(6.2);
        alumnoInt.setNotaCastellano(5.2);
        alumnoInt.setNotaFisica(6.2);
        alumnoInt.setNotaMatematica(7.2);

        System.out.println("======= Creando la instancia de objeto profesor =======");
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Vidal");
        profesor.setAsignatura("Matematicas");

        System.out.println("=========");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + ", " + ((Alumno) alumno).getColegio());
        System.out.println(alumnoInt.getNombre()
        + " " + alumnoInt.getApellido()
        + " " + alumnoInt.getColegio()
        + " " + alumnoInt.getPais());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "es una clase hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }

    }
}
