package org.example;
/**
 * Representa una cuenta bancaria con operaciones básicas.
 * Esta clase permite realizar un retiro de la cuenta y consultar su saldo.
 *
 * Esta clase es utilizada para gestionar cuentas bancarias en una aplicación.
 *
 * @author Samuel Fiffe
 * @version 1.0
 *
 */
public class CuentaBancaria {
    private double saldo;

    /**
     * Sirve para crear la cuenta bancaria con el saldo inicial
     * @param saldoInicial saldo inicial de la cuenta
     */
    public CuentaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    /**
     * Método utilizado para retirar el dinero de la cuenta
     * @param monto es el monto utilizado para realizar operaciones
     * @return que es posible realizar el retiro.
     * @throws new IllegalArgumentException si el saldo es inferior al monto.
     */
    public boolean retirar(double monto){
        if (monto <= saldo){
            this.saldo -= monto;
            return true;
        }
        throw new IllegalArgumentException("Fondos insuficientes");
    }

    /**
     * Método utilizado para enseñar el saldo disponible de la cuenta
     * @return el saldo de la cuenta
     */
    public double consultarSaldo(){
        return this.saldo;
    }

    /**
     * Deposita una cantidad en la cuenta bancaria.
     *
     * @param monto la cantidad a depositar
     */
    public void depositar(double monto) {
        this.saldo += monto;
    }
}
