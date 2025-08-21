# Proyecto Java para la asignatura de Entornos de Desarrollo

En este repositorio podrás encontrar el paso a paso del proyecto de crear un sistema de gestión para una
empresa, en este caso, de venta de mobiliario para el hogar. Está realizado de manera que la persona que
lo utiliza pueda cargar los datos de los clientes, registrar las ventas y el stock correspondiente.

## Requisitos para compilar y ejecutar

Para poder ejecutar este programa se necesitará:

- Un IDE en donde puedas compilar y ejecutar el código
- Java Development Kit 23.0.2
- Gestor de dependencias Maven
- JUnit 5 para testing

## Instrucciones de uso

El programa nos da la opción de elegir entre 5 posibilidades:
1. Gestión de Clientes:
* Dentro de esta opción a su vez podemos elegir entre 6 opciones:
   1. Alta cliente: aquí podemos dar de alta a un cliente nuevo.
   2. Baja cliente: aquí podemos eliminar a un cliente ya cargado.
   3. Modificación cliente: en esta opción podemos cambiar cualquier dato del mismo.
   4. Búsqueda por DNI: buscar un cliente por su num de documento.
   5. Listado: listar todos los clientes que se encuentran en la base de datos.
   6. Volver al menú principal.

2. Gestión de productos:
* Dentro de esta opción podemos también elegir entre 4 opciones *:
    1. Alta producto: aquí podemos cargar un producto a nuestro catálogo.
    2. Listado de productos: el sistema te muestra la lista de productos cargados.
    3. Búsqueda por ID: se puede buscar un producto específico por su num de ID.
    4. Volver al menú principal.

3. Realizar Venta:
* Dentro de esta opción debemos elegir entre todos los clientes cargados el que efectuará
la compra y además asociarle el/los producto/s que quiera comprar. De esta forma la venta
quedará registrada en la base.

4. Mostrar Ventas:
* Aquí el sistema te muestra el listado de todas las ventas realizadas, a quién y por cuanto
dinero.

5. Salir:
* Eligiendo esta opción el usuario sale del sistema.

## Autoría y licencia

**Autora**: María Marta Frisone
**Licencia**: MIT