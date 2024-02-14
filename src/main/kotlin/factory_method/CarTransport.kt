package factory_method

import factory_method.vehicle.Car
import factory_method.vehicle.IVehicle

class CarTransport : Transport() {
    override fun createTransport(): IVehicle {
        return Car()
    }
}