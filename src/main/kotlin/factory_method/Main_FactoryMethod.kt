package factory_method

/**
 * Temos aqui um exemplo de Padrão de projeto Criacional
 * - Factory Method: Cria uma instância de várias classes derivadas.
 * */

lateinit var transport: Transport

fun main(args: Array<String>) {
    configure(ModalDelivery.valueOf(args[0].uppercase()))
    if (null != transport) {
        runTransport()
    }
}

fun runTransport() {
    transport.startTransport()
}

fun configure(type: ModalDelivery) {
    transport = when(type) {
        ModalDelivery.UBER -> { CarTransport() }
        ModalDelivery.LOGISTICS -> { MotorcycleTransport() }
        ModalDelivery.EATS -> { BicycleTransport() }
    }
}

enum class ModalDelivery {
    UBER,
    LOGISTICS,
    EATS
}
