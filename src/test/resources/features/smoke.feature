@smoke
Feature: Web Smoke test

  Scenario: Cotizacion Workflow
    Given Im on step 1
    When I complete Nombre form "MiNombre"
    And I complete Provincia "CABA"
    And I select Codigo Area "11"
    And I complete Celular with "12345678"
    Then Click en "Cotizá en un click"

    When Im on step 2
    And I complete cantidad de adultos "2"
    And I complete cantidad de menores "1"
    And I select plan "Plan Familia 30"
    Then I click on Siguiente
