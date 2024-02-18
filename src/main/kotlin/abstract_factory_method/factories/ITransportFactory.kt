package abstract_factory_method.factories

import abstract_factory_method.aircrafts.IAircraft
import abstract_factory_method.land_vehicle.ILandVehicle

interface ITransport {
    fun createTransportVehicle() : ILandVehicle
    fun createTransportAircraft() : IAircraft
}