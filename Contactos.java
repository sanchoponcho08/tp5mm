/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

public class Contacto {
    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto(String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCiudad() { return ciudad; }
    public String getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + " " + apellido + ", Ciudad: " + ciudad + ", Dirección: " + direccion;
    }
}
