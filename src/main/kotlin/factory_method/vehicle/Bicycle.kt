package factory_method.vehicle

class Bicycle : IVehicle {

    init {
        println("Alocando uma bicicleta...")
    }

    override fun startRoute() {
        getCargo()
        println("Iniciamos a entrega.")
    }

    override fun getCargo() {
        println("Alimento retirado no estabelecimento.")
    }

}
