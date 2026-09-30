package app.vidacanhija.android.model

import kotlinx.datetime.LocalDate

/**
 * Representa a un usuario de la app.
 *
 * @property id Identificador único del usuario en la base de datos.
 * @property nombre Nombre del usuario.
 * @property apellido Apellido del usuario. Es nulo si el usuario no lo proporcionó.
 * @property genero Género del usuario. Es ninguno si el usuario no lo proporcionó.
 * @property email Dirección de correo electrónico del usuario. Es nulo si el usuario no lo proporcionó.
 * @property telefono Número de teléfono del usuario. Es nulo si el usuario no lo proporcionó.
 * @property galeriaUrls URL de la imagen de perfil del usuario. Es nulo si el usuario no lo proporcionó.
 * @property fechaNacimiento Fecha de nacimiento del usuario. Es nulo si el usuario no lo proporcionó.
 * @property mascotas Lista de mascotas del usuario. Es nulo si el usuario no tiene mascotas.
 *
 */
data class Usuario(
        val id: String,
        val nombre: String,
        val apellido: String? = null,
        val genero: GeneroUsuario = GeneroUsuario.NINGUNO,
        val email: String? = null,
        val telefono: String? = null,
        val galeriaUrls: String? = null,
        val fechaNacimiento: LocalDate? = null,
        val mascotas: List<Mascota>? = null
)