package app.vidacanhija.android.model

/**
 * Representa a un negocio o servicoo afiliado a Vida Canhija. Un mismo proveedor
 * puede pertenecer a varios tipos de Categoria Servicio.
 *
 * @property id Identificador único del establecimiento en la base de datos.
 * @property nombre Nombre del comercial del establecimiento.
 * @property direccion Dirección fisica del establecimiento.
 * @property telefono Número de teléfono del establecimiento. Es nulo si el proveedor no lo proporcionó.
 * @property abierto24hrs Indica si el establecimiento está abierto 24 horas. Por defecto es falso.
 * @property calificacion Promedio de estrellas otorgadas por el usuario a los servicios ofrecidos. (0 - 5)
 * @property fotoUrl Lista de URLs de las imagenes de la galeria del establecimiento.
 * @property categoria Lista de categorías de servicios ofrecidos por el establecimiento.
 * (ej. Veterinaria y Pet Shop al mismo tiempo). Por defecto esta vacia.
 */
data class ProveedorServicio(
    val id: String,
    val nombre: String,
    val direccion: String,
    val telefono: String? = null,
    val abierto24hrs: Boolean = false,
    val calificacion: Double = 0.0,
    val fotoUrl: List<String> = emptyList(),
    val categoria: List<CategoriaServicio> = emptyList()
)