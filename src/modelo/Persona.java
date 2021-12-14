package modelo;

/**
 * @author Natalia Salazar
 * @author Sebastián Arriagada
 * @author Luciano Castañeda
 * @author Julián Iturra
 */
public class Persona {

    //Atributos Persona
    private String nombre;
    private int edad;
    private String apellido;
    private String correo;
    private String hora;
    private String asistencia;

    //Constructor lleno
    public Persona(String nombre, int edad, String apellido, String correo, String hora, String asistencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.correo = correo;
        this.hora = hora;
        this.asistencia = asistencia;
    }

    //Constructor vacio
    public Persona() {
    }

    //Setters and Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

}
