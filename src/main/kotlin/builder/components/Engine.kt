package builder.components

import java.io.ObjectInputStream.GetField

data class Engine(
    private val power: Int
) {
    fun getPower() = power
}