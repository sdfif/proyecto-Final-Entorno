package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.Usuario;
import org.example.CuentaBancaria;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    private Usuario usuario;
    private boolean operacionExitosa;

    @Given("usuario con cuenta de saldo {int}")
    public void usuario_con_cuenta_de_saldo(Integer saldo) {
        // Se crea el usuario con una cuenta bancaria que tiene el saldo indicado.
        usuario = new Usuario("Juan", "12345678A", new CuentaBancaria(saldo.doubleValue()));
    }

    @When("intenta retirar {int}")
    public void intenta_retirar(Integer monto) {
        try {
            // Ejecuta el retiro y se guarda si fue exitoso.
            operacionExitosa = usuario.retirar(monto.doubleValue());
        } catch (IllegalArgumentException e) {
            operacionExitosa = false;
        }
    }

    @Then("la operación es exitosa")
    public void la_operacion_es_exitosa() {
        assertTrue("La operación debería haber sido exitosa", operacionExitosa);
    }

    @Then("saldo restante es {int}")
    public void saldo_restante_es(Integer saldoEsperado) {
        assertEquals("El saldo restante no coincide", saldoEsperado.doubleValue(), usuario.consultarSaldo(), 0.001);
    }
}
