package abstract_factory_method.land_vehicle

class Motorcycle : ILandVehicle {
    override fun startRoute() {
        getCargo()
        println("Estamos iniciando a entrega.")
    }

    override fun getCargo() {
        println("Já pegamos a encomenda!")
    }
}