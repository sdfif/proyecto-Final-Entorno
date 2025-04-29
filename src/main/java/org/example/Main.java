package org.example;

/**
 * Clase principal de la aplicación bancaria.
 *
 */
public class Main {
    /**
     * Método principal que se encarga de iniciar la ejecución.
     * @param args los argumentos de la línea de comando
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(200);

        Usuario usuario = new Usuario("Pedro", "87654321B", cuenta);

        boolean retiroExitoso = usuario.retirar(50);
        System.out.println("Retiro exitoso: " + retiroExitoso);
        System.out.println("Saldo actual: " + usuario.consultarSaldo());
    }
}
