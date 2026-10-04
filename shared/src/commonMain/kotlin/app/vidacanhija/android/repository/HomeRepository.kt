package app.vidacanhija.android.repository

import app.vidacanhija.android.model.CategoriaServicio
import app.vidacanhija.android.model.ProveedorServicio

interface HomeRepository {

    fun obtenerServicio( categoriSeleccionada: CategoriaServicio? = null): List<ProveedorServicio>

}