package abstract_factory_method.aircrafts

class Helicopter : IAircraft {
    override fun startRoute() {
        wind()
        getCargo()
        println("Iniciando a decolagem.")
    }

    override fun getCargo() {
        println("Passageiros ok, Ligando hélices")
    }

    override fun wind() {
        println("Ventos a 27km sudeste, ventos ok!")
    }
}