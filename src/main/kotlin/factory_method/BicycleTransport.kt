package factory_method

import factory_method.vehicle.Bicycle
import factory_method.vehicle.IVehicle

class BicycleTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Bicycle()
    }

}
