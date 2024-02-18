package abstract_factory_method.aircrafts

class Airplane : IAircraft {
    override fun startRoute() {
        wind()
        getCargo()

    }

    override fun getCargo() {
        println("Passageiros a bordo, Vôo autorizado!")
    }

    override fun wind() {
        println("Ventos a 25km, ventos ok!")
    }
}