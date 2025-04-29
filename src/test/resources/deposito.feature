Feature: Depósito a cuenta bancaria

  Scenario: Depósito exitoso en una cuenta
    Given una cuenta con saldo 200
    When deposito 50
    Then el saldo restante es 250
