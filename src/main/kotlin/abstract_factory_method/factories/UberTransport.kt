package abstract_factory_method.factories

import abstract_factory_method.aircrafts.Airplane
import abstract_factory_method.aircrafts.IAircraft
import abstract_factory_method.land_vehicle.Car
import abstract_factory_method.land_vehicle.ILandVehicle
import abstract_factory_method.marine.IBoats
import abstract_factory_method.marine.Ship

class UberTransport : ITransportFactory {
    override fun createTransportVehicle(): ILandVehicle {
        return Car()
    }

    override fun createTransportAircraft(): IAircraft {
        return Airplane()
    }

    override fun createTransportMarine(): IBoats {
        return Ship()
    }
}