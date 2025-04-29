package org.example;

/**
 * Clase que representa al Empleado del banco, quien se encarga de gestionar las citas de las oficinas bancarias,
 * así como dar de alta o de baja a usuarios.
 *@author Samuel Fiffe
 *@version 1.0
 */
public class EmpleadoBanco {
    private String nombre;
    private String dni;

    /**
     * Constructor para crear el EmpleadoBanco.
     * @param nombre es el nombre del empleado.
     * @param dni es el identificador personal del empleado.
     */
    public EmpleadoBanco(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Método para confirmar la Cita en la oficina.
     * @param detalleCita indica cuales son los detalles de la cita establecidos.
     */
    public void confirmarCita(String detalleCita){
    }

    /**
     * Método para dar de alta al usuario en el sistema del banco.
     * @param usuario es el usuario al que se le va a dar de alta.
     */
    public void darAltaUsuario(Usuario usuario) {
    }

    /**
     * Método para dar de baja al cliente del banco
     * @param usuario es el usuario a quien se le da de baja.
     */
    public void darBajaUsuario(Usuario usuario){
    }

    /**
     *Método para obtener el Dni del empleado
     * @return devuelve el DNI del empleado
     */
    public String getDni(){

        return dni;
    }

    /**
     *Método para obtener el nombre del empleado
     * @return devuelve el nombre del empleado.
     */
    public String getNombre(){
        return nombre;
    }
}
