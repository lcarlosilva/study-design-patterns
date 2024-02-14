package factory_method.vehicle

class Car : IVehicle {

    init {
        println("Alocando um carro...")
    }

    override fun startRoute() {
        getCargo()
        println("Iniciando o trajeto")
    }

    override fun getCargo() {
        println("Pegamos os passageiros, estamos prontos!")
    }
}