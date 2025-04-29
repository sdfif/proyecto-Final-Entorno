package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CuentaBancariaTest {

    @Test
    public void testRetiroExitoso() {
        CuentaBancaria cuenta = new CuentaBancaria(200);
        boolean resultado = cuenta.retirar(50);
        assertTrue(resultado, "El retiro de 50 debería ser exitoso.");
        assertEquals(150, cuenta.consultarSaldo(),"El saldo luego del retiro debe ser 150.");
    }

    @Test
    public void testRetiroFondosInsuficientes() {
        CuentaBancaria cuenta = new CuentaBancaria(200);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(250);
        });
        assertEquals("Fondos insuficientes", ex.getMessage());
    }


}
