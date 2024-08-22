interface AccionTecnico {
    fun reparar()
}

abstract class Tecnico {
    abstract val nombre: String
    abstract val especialidad: String
}

class TecnicoLavadoras(override val nombre: String) : Tecnico(), AccionTecnico {
    override val especialidad: String = "Lavadoras"

    override fun reparar() {
        println("Técnico $nombre: reparando una lavadora")
    }
}

class TecnicoGenerico(override val nombre: String) : Tecnico(), AccionTecnico {
    override val especialidad: String = "General"

    override fun reparar() {
        println("Técnico $nombre: reparando electrodoméstico")
    }
}
