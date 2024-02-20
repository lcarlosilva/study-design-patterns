package builder.builders

import builder.components.Engine
import builder.components.Transmission
import builder.components.VehicleType

class CarBuilder : IVehicleBuilder {

    private var type: VehicleType? = null
    private var seats: Int = 0
    private var engine: Engine? = null
    private var transmission: Transmission? = null
    override fun setVehicleType(type: VehicleType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    fun result() = "The configs of this Car type ${type?.name?.lowercase()} are: \n\tSeats: $seats, Transmission: $transmission, Engine: ${engine?.getPower()} "
}