# Visor-UrlProvider

El proposito de este mini-proyecto es proveer una url valida al Visor, en esta url se encuentra el recurso disponible (imagen/documento). Eventualmente se tendra que parametrizar en el visor esta posible URL de una 
serie de Url's dadas (aquellas disponibles entre las aplicaciones que pueden utilizar el visor, en primera instancia XContent...)

NOTAS:

En el Controlador es necesario cambiar la ubicaciòn indicada en la cte FILE_PATH_ROOT por una ubicaciòn en tu computadora que cuente con una serie de imagenes. En primera instancia que sean formato PNG, despues
le agrego la conf. para que agregue cualquier doc/imagen.

Esta aplicaciòn se esta llamando desde un pequeño proyecto web, en este caso se levanta en http://localhost:4200. De ser necesario cambiar esto por la url donde publiques el frontend, cambiando la siguiente linea
en el controller: @CrossOrigin(origins = "http://localhost:4200")
