
fun crearElectrodomesticos() {
    val lavadora = Lavadora(marca = "LG", modelo = "TurboWash", potencia = 2000, capacidadCarga = 10)
    lavadora.imprimirInfo()
    println("Consumo energético de la lavadora: ${lavadora.consumoEnergetico} kWh")
}

fun crearTecnicos() {
    val tecnicoLavadoras = TecnicoLavadoras(nombre = "Pablo")
    val tecnicoGenerico = TecnicoGenerico(nombre = "Steve")

    println("El técnico especializado en: ${tecnicoLavadoras.especialidad} es: ${tecnicoLavadoras.nombre}")
    tecnicoLavadoras.reparar()

    println("El técnico con especialidad: ${tecnicoGenerico.especialidad} es: ${tecnicoGenerico.nombre}")
    tecnicoGenerico.reparar()
}

fun main() {
    crearElectrodomesticos()
    crearTecnicos()
}
