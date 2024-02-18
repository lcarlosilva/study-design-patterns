package abstract_factory_method.marine

class CruiseShip : IBoats {
    override fun startRoute() {
        getCargo()
        anchorCollected()
        println("Iniciando navegação a bombordo.")
    }

    override fun getCargo() {
        println("Passageiros embarcados.")
    }

    override fun anchorCollected() {
        println("Âncora recolhida")
    }
}