# Pasos a seguir para que funcione el proyecto.
## Paso 1
``` 
mvn compile
```
## Paso 2
```
mvn test
```
## Paso 3
Hay que crear las tablas en la base de datos. Para ello, se encuentra un archivo con el nombre HotelUD.sql en la carpeta lib, por lo que tenemos que abrirlo con una aplicación que lo permita (MySQL Workbench, XAMPP...). Dentro, tenemos que ejecutar las líneas que pone lo siguiente:
```
CREATE DATABASE IF NOT exists hotel;
```
```
use hotel;
```
```
CREATE TABLE`users`(
CREATE TABLE`workers`(
CREATE TABLE`room`(
CREATE TABLE`dependients`(
CREATE TABLE`roomAsig`(
```
Una ejecutadas, mas abajo tenemos los SELECT por si queremos comprobar que los Usuarios, Trabajadores, Habitaciones y los Dependientes que creamos mediante java se han guardado correctamente en las tablas.
## Paso 4
Para lanzar la parte cliente, abrimos el cmd con la ruta donde se encuentra nuestro proyecto y ponemos lo siguiente:
```
mvn exec:java -Pclient
```
Para lanzar la parte servidor, abrimos otro cmd con la ruta donde se encuentra nuestro proyecto y ponemos lo siguiente:
```
mvn exec:java -Pmanager
```
