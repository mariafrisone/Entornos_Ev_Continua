import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String dni;
    private String telefono;
    private String mail;


    public Cliente(String nombre, String dni, String telefono, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
    }

    /**
     * Función para obtener el nombre del cliente
     * @return - Nombre cliente
     */
    public String getNombre() {return nombre;}

    /**
     * Función para obtener el DNI del cliente
     * @return - DNI cliente
     */
    public String getDni() {return dni;}

    /**
     * Función para obtener el teléfono del cliente
     * @return - Teléfono del cliente
     */
    public String getTelefono() {return telefono;}

    /**
     * Función para obtener el email del cliente
     * @return - Email del cliente
     */

    public String getMail() {return mail;}

    public void setDni(String dni) {this.dni = dni;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void setMail(String mail) {this.mail = mail;}

    /**
     * Función que me imprime la información de cada cliente que se encuentra cargado
     * en mi base.
     */

    public void verInfo (){
        System.out.println("\n Nombre: " + this.nombre + "\n DNI: " + this.dni + "\n Teléfono: " + this.telefono +
                "\n Mail: " + this.mail);
    }
}