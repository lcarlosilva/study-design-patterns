package abstract_factory_method.factories

import abstract_factory_method.aircrafts.IAircraft
import abstract_factory_method.land_vehicle.ILandVehicle
import abstract_factory_method.marine.IBoats

interface ITransportFactory {
    fun createTransportVehicle() : ILandVehicle
    fun createTransportAircraft() : IAircraft
    fun createTransportMarine() : IBoats
}