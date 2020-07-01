#Autor: Jhon Sebastian Benavides
#Fecha: 01 de julio de 2020

Feature: Prueba sophos

@HU001
Scenario Outline: Validación búsqueda en google de Sophos solutions
Given Ingresar a la URL de google
When Realizar la busqueda <ValorBusqueda>
Then Validar la cantidad de resultados arrojados

Examples:
|ValorBusqueda|
|"Sophos solutions"|


