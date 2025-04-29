package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import org.example.CuentaBancaria;

public class DepositoSteps {
    private CuentaBancaria cuenta;

    @Given("una cuenta con saldo {int}")
    public void una_cuenta_con_saldo(Integer saldo) {
        cuenta = new CuentaBancaria(saldo.doubleValue());
    }

    @When("deposito {int}")
    public void deposito(Integer monto) {
        cuenta.depositar(monto.doubleValue());
    }

    @Then("el saldo restante es {int}")
    public void el_saldo_restante_es(Integer saldoEsperado) {
        assertEquals(saldoEsperado.doubleValue(), cuenta.consultarSaldo(), 0.001);
    }
}
