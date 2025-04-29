package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CuentaBancariaMockitoTest {

    @Mock
    private CuentaBancaria cuenta;

    @InjectMocks
    private Usuario usuario;

    @Test
    void testRetirarConMockito() {
        when(cuenta.retirar(50)).thenReturn(true);

        boolean resultado = usuario.retirar(50);
        assertTrue(resultado, "El retiro realizado debería ser exitoso.");
    }

    @Test
    void testConsultarSaldoConMockito() {
        when(cuenta.consultarSaldo()).thenReturn(200.0);

        double saldo = usuario.consultarSaldo();

        assertEquals(200.0, saldo, "El saldo consultado debería ser 200.");

    }
}
