package abstract_factory_method

import abstract_factory_method.app.Application
import abstract_factory_method.factories.ITransportFactory
import abstract_factory_method.factories.NineNineTransport
import abstract_factory_method.factories.UberTransport

fun main(args: Array<String>) {
    val application: Application = Main_AbstractFactoryMethod.configureApplication("99")
    application.startRoute()
}

class Main_AbstractFactoryMethod {
    companion object {
        fun configureApplication(company: String): Application {
            return Application(
                if (company == "99") {
                    UberTransport()
                } else {
                    NineNineTransport()
                }
            )
        }
    }
}