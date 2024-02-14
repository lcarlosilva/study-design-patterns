package factory_method

import factory_method.vehicle.IVehicle

abstract class Transport {
    fun startTransport() {
        val vehicle = createTransport()
        vehicle.startRoute()
    }

    protected abstract fun createTransport(): IVehicle
}