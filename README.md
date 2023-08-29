
# README
Nasa Test

A continuacion se detalla la manera correcta de poder compilar y realizar pruebas exitosas de la api

#### Paso 1:
Cargar la base de datos (postgresql) con su gestor de base de datos preferido

#### Paso 2:
Modificar el archivo application.properties del proyecto e ingresar la url de conexion con su base de datos (Actualmente se encuentra con una base de datos llamada nasa, favor cambiar la password por la que tenga su servidor)

#### Paso 3:
Abrir el Proyecto con su IDE preferido y Ejecutarlo (por defecto se encuentra configurado en el puerto 8080)

Se compart el CURL

curl --location --request GET 'http://localhost:8080/v1.0/'






## Script Base de Datos

//PASO #1
//Creacion de la Base de Datos
CREATE DATABASE "nasa";

//PASO #2
//Creacion de la Tabla Segun Especificaciones
create table nasa_test(
id int primary key,
href text,
center varchar(5000),
title varchar(5000),
nasa_id varchar(1000),
created_at timestamp default current_timestamp
);

//PASO #3
//Creacion de la Sequencia para el Autoincrementable
create sequence seq_id_nasa
start with 1
increment by 1;

## By
- Oscar Barahona


## Support

para soporte del repositorio el correo es oscar.barahona04@gmail.com

