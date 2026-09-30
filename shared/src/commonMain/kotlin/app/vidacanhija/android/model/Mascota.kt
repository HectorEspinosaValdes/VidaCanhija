package app.vidacanhija.android.model

import kotlinx.datetime.LocalDate

/**
 * Representa a una mascota de un usuario. Un usuario puede tener varias mascotas.
 *
 * @property id Identificador único de la mascota en la base de datos.
 * @property nombre Nombre de la mascota.
 * @property fotoUrl URL de la imagen de la mascota. Es nulo si la mascota no lo proporcionó.
 * @property genero Género de la mascota. Es por default NINGUNO si el usuario no lo proporcionó.
 * @property especie Especie de la mascota. Es por default NINGUNO si el usuario no lo proporcionó.
 * @property fechaNacimiento Fecha de nacimiento de la mascota. Es nulo si el usuario no lo proporcionó.
 *
 */
data class Mascota(
    val id: String,
    val nombre: String,
    val fotoUrl: String? = null,
    val genero: GeneroAnimal = GeneroAnimal.NINGUNO,
    val especie: CategoriaAnimales = CategoriaAnimales.NINGUNO,
    val fechaNacimiento: LocalDate? = null
)