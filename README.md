[![run web test](https://github.com/voglernicolas/presentation/actions/workflows/main.yml/badge.svg?branch=main)](https://github.com/voglernicolas/presentation/actions/workflows/main.yml)

![Selenium](https://img.shields.io/badge/SELENIUM-4.7.2-blue?style=for-the-badge)
![Cucumber](https://img.shields.io/badge/CUCUMBER-7.10.1-blue?style=for-the-badge)


# Nombre del proyecto
> Presentación

## Objetivos

- Ejecución de workflow

## Ejecución desde Github Actions

- Ejecutar `run web test`

## Reporte de ejecución

- Se genera un reporte al finalizar la ejecución desde Github Actions
- El reporte se encuentra alojado en https://voglernicolas.github.io/presentation/cucumber.html

## Ejecución y reporte en JMeter

- Se utiliza la GUI de JMeter para:
  * crear un api test para los request entre paginas.
  * Simular una carga de: 
    * 5 usuarios simultaneos.
    * ramp up de 3 min.
    * ramp up step de 5.
    * hold de usuarios por 1 min.

![Jenkins_ejecucion](https://gcdnb.pbrd.co/images/5oySbHssmrf0.gif?o=1)
- Los reportes se generan en ambiente local.


## Pre-requisitos y Ejecución local
- Java (17) y Maven 
- Requiere sacar comentarios de la linea 27 y 28 en `base/DriverFactory.java` y comentar linea 30 y 31.
- Para ejecutar las pruebas, ejecuta el siguiente comando en la raíz del proyecto:
`mvn clean test`



