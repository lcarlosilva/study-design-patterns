package factory_method

import factory_method.vehicle.IVehicle
import factory_method.vehicle.Motorcycle

class MotorcycleTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Motorcycle()
    }
}