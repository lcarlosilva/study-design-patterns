package abstract_factory_method.app

import abstract_factory_method.aircrafts.IAircraft
import abstract_factory_method.factories.ITransportFactory
import abstract_factory_method.land_vehicle.ILandVehicle
import abstract_factory_method.marine.IBoats

class Application(factory: ITransportFactory) {
    private val vehicle: ILandVehicle = factory.createTransportVehicle()
    private val aircraft: IAircraft = factory.createTransportAircraft()
    private val marine: IBoats = factory.createTransportMarine()

    fun startRoute() {
        vehicle.startRoute()
        aircraft.startRoute()
        marine.startRoute()
    }
}