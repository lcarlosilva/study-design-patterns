package abstract_factory_method.marine

class Ship : IBoats{
    override fun startRoute() {
        getCargo()
        anchorCollected()
        println("Iniciando navegação a bombordo.")
    }

    override fun getCargo() {
        println("Containers todos embarcados!")
    }

    override fun anchorCollected() {
        println("Âncora recolhida.")
    }
}