package builder.builders

import builder.components.Engine
import builder.components.Transmission
import builder.components.VehicleType

interface IVehicleBuilder {
    fun setVehicleType(type: VehicleType)
    fun setSeats(seats: Int)
    fun setTransmission(transmission: Transmission)
    fun setEngine(engine: Engine)
}