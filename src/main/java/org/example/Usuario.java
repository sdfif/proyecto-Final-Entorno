package org.example;

/**
 * Clase Usuario que se encarga de describir los datos del cliente y qué puede realizar en el banco.
 */
public class Usuario {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    /**
     * Método que crea al Usuario con sus características.
     * @param nombre nombre del usuario.
     * @param dni identificador personal del usuario.
     * @param cuenta es la cuenta bancaria del usuario con el banco.
     */
    public Usuario(String nombre, String dni, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.dni = dni;
        this.cuenta = cuenta;
    }

    /**
     * Método que consulta el saldo disponible de la cuenta bancaria.
     * @return devuelve el saldo actual de la cuenta.
     */
    public double consultarSaldo(){
        return cuenta.consultarSaldo();
    }

    /**
     * Método para retirar dinero de la cuenta bancaria.
     * @param monto el monto es la cantidad a retirar del saldo.
     * @return devuelve un resultado si se realizó correctamente o no el retiro.
     */
    public boolean retirar(double monto){
        return cuenta.retirar(monto);
    }

    /**
     * Método que devuelve el nombre del usuario.
     * @return nombre del usuario.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método que regresa la cuenta asociada al usuario.
     * @return cuenta bancaria del usuario.
     */
    public CuentaBancaria getCuenta(){
        return cuenta;
    }

    /**
     *Método para obtener el Dni del empleado
     * @return devuelve el DNI del empleado
     */
    public String getDni(){

        return dni;
    }
}
