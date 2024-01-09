package com.gruvedrift.models

// Product representation
data class MiningCart(
    val registrationPlate: String,
    val wheels: Int,
    val storageCapacity: Double,
    val reverseHypertrophy: Boolean,
)

// Builder Interface
interface Builder {
    fun registrationPlate(regPlate: String)
    fun wheels(wheels: Int)
    fun storageCapacity(storage: Double)
    fun reverseHypertrophy(belowEquator: Boolean)
    fun build(): MiningCart
}

// Builder class
class BuilderImpl: Builder {
    private var registrationPlate: String = ""
    private var wheels: Int = 4
    private var storageCapacity: Double = 100.0
    private var reverseHypertrophy: Boolean = false

    override fun registrationPlate(regPlate: String) {
        this.registrationPlate = regPlate
    }
    override fun wheels(wheels: Int) {
        this.wheels = wheels
    }
    override fun storageCapacity(storage: Double) {
        this.storageCapacity = storage
    }
    override fun reverseHypertrophy(belowEquator: Boolean) {
        this.reverseHypertrophy = belowEquator
    }
    override fun build(): MiningCart {
        return MiningCart(registrationPlate, wheels, storageCapacity, reverseHypertrophy)
    }

}

// Director
class Director(
    private val builder: Builder,
) {
    fun construct(regPlate: String, wheels: Int, storageCapacity: Double, reverseHypertrophy: Boolean ): MiningCart {
        builder.registrationPlate(regPlate)
        builder.wheels(wheels)
        builder.storageCapacity(storageCapacity)
        builder.reverseHypertrophy(reverseHypertrophy)
        return builder.build()
    }
}

fun miningCartEntry() {

    // With Builder Pattern
    val miningCartBuilder = BuilderImpl()
    val director = Director(miningCartBuilder)
    val trolley = director.construct("NX 66622", 6, 500.00, true )

    // With Named Parameters
    val simpleTrolley = MiningCart("SN 60605", 8, 750.00, false)

    println("Built mining cart with Builder Pattern: $trolley")
    println("Built mining cart with named parameters: $simpleTrolley")
}
