Feature: Login user
 Como usuario quiero ingresar mis credenciales para tener acceso a mi cuenta

  Scenario: login
    Given :Un formulario de inicio de sesion
    When : ingreso credenciales validas
    Then : me da acceso a mi cuenta