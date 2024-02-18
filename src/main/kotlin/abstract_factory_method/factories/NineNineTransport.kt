package abstract_factory_method.factories

import abstract_factory_method.aircrafts.Helicopter
import abstract_factory_method.aircrafts.IAircraft
import abstract_factory_method.land_vehicle.ILandVehicle
import abstract_factory_method.land_vehicle.Motorcycle
import abstract_factory_method.marine.CruiseShip
import abstract_factory_method.marine.IBoats

class NineNineTransport : ITransportFactory {
    override fun createTransportVehicle(): ILandVehicle {
        return Motorcycle()
    }

    override fun createTransportAircraft(): IAircraft {
        return Helicopter()
    }

    override fun createTransportMarine(): IBoats {
        return CruiseShip()
    }
}