open class Electrodomestico(
    open var marca: String,
    open var modelo: String,
    open var potencia: Int // Potencia en vatios
) {
    init {
        println("Inicializando electrodoméstico: $marca $modelo")
    }

    fun imprimirInfo() {
        println("Marca: $marca, Modelo: $modelo, Potencia: $potencia W")
    }

    open var consumoEnergetico: Double
        get() = potencia * 1.5 // Suponiendo un factor de consumo energético
        set(valor) {
            potencia = (valor / 1.5).toInt()
        }

    constructor(tipo: String, potencia: Int) : this(marca = "Genérica", modelo = tipo, potencia = potencia)

    open val tipo: String = "Electrodoméstico"

}

class Lavadora(
    override var marca: String,
    override var modelo: String,
    override var potencia: Int,
    var capacidadCarga: Int // Capacidad en kg
) : Electrodomestico(marca, modelo, potencia) {
    override var consumoEnergetico: Double
        get() = potencia * 2.0
        set(valor) {
            potencia = (valor / 2.0).toInt()
        }

    override val tipo: String = "Lavadora"
}
