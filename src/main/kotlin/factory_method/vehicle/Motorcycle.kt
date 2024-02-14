package factory_method.vehicle

class Motorcycle : IVehicle {

    init {
        println("Alocando uma moto...")
    }

    override fun startRoute() {
        getCargo()
        println("Iniciamos a entrega.")
    }

    override fun getCargo() {
        println("Já pegamos a encomenda !")
    }
}