Feature: Gestión de cuenta bancaria

  Scenario: Retiro exitoso
    Given usuario con cuenta de saldo 200
    When intenta retirar 50
    Then la operación es exitosa
    And saldo restante es 150
