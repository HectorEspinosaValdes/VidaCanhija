package app.vidacanhija.android.repository

import app.vidacanhija.android.model.CategoriaServicio
import app.vidacanhija.android.model.ProveedorServicio


class FakeHomeRepositoryImpl: HomeRepository {

    private val baseDatosFalsa = listOf(
        ProveedorServicio(
            id = "1",
            nombre = "Veterinaria Huellitas",
            direccion = "Av. Siempre Viva 123",
            telefono = "",
            abierto24hrs = true,
            calificacion = 4.3,
            fotoUrl = listOf("lo q sea", "lo que sea 2", "lo que sea 3"),
            categoria = listOf(CategoriaServicio.VETERINARIA, CategoriaServicio.PET_SHOP)
        ),
        ProveedorServicio(
            id = "2",
            nombre = "Parque Central Canino",
            direccion = "Esq. Insurgentes y Reforma",
            abierto24hrs = false,
            calificacion = 4.5,
            categoria = listOf(CategoriaServicio.PARQUE)
        ),
        ProveedorServicio(
            id = "3",
            nombre = "Pet Shop El Hueso Feliz",
            direccion = "Plaza Comercial Sur",
            telefono = "555-9876",
            calificacion = 4.0,
            categoria = listOf(CategoriaServicio.PET_SHOP)
        )
    )

    override fun obtenerServicio(categoriSeleccionada: CategoriaServicio?): List<ProveedorServicio> {

        /**
         * if: la pantalla (home), se abre por pirmera vez mandara un null pues el usuario no a
         * seleccionado ningun filtro.
         *
         * else: Si el usuario toca un filtro  ej.veterinaria la variable categoria tendra el valor
         * de CategoriaServicio.VETERINARIA.
         *
         * filter: Esto es como un ciclo FOR invisible y rapido. Revisa negocio por negocio
         * (baseDatosFalsa)  buscando los negocios que cumplan con la categoria del filtro
         * seleccionado.
         *
         * it: Significa "eso" que en este contexto es una categoria del negocio (ProvedorServicio)
         * dentro de la lista (baseDatosFalsa).
         *
         */
        return if (categoriSeleccionada == null){
            baseDatosFalsa
        } else{
            baseDatosFalsa.filter {  it.categoria.contains(categoriSeleccionada)}
        }
    }
}