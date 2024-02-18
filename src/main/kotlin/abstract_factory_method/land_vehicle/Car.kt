package abstract_factory_method.land_vehicle

class Car : ILandVehicle {
    override fun startRoute() {
        getCargo()
        println("Iniciando o trajeto.")
    }

    override fun getCargo() {
        println("Pegamos os passageiros, estamos prontos.")
    }
}