# Reto-Banco-general-Modulo-Saving-Account

Reto #2 el cual busca probar los conocimientos del funcionamiento de los microservicios y la comunicacion de los mismos por medio de springboot con openfeign

Para poder utilizar este application es necesario exportar la estructura y data de la base de datos utilizada por la misma, esta informacion se encuentra en
la carpeta **Database structure and data exported** usando mySQL workbench, una vez tenemos creada la estructura de la base de datos procedemos 
a ejecutar el archivo **Cuentas de ahorro.sql** para que se cree nuestro procedimiento almacenado.

Una vez terminamos de configurar nuestra Base de datos y crear el procedimiento podemos arrancar la aplicacion, la misma se encuentra en la sub carpeta **Saving Account** y utilizar la siguiente ruta para validar la ejecucion del mismo

http://localhost:8081/deposit-account/saving

Se recomienda utilizar la herramienta Postman para validar la data de manera mas clara.
