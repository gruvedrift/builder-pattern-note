package com.gruvedrift.models

// Product representation
data class Gemstone (
    val name: String,
    val weight: Int,
)

// Concrete builder class
class GemstoneBuilder {
    private var weight: Int = 0
    private var name: String = ""

    fun name(name: String): GemstoneBuilder {
        this.name = name
        return this
    }

    fun weight(weight: Int): GemstoneBuilder {
        this.weight = weight
        return this
    }

    fun build(): Gemstone {
        return Gemstone(name, weight)
    }
}

fun gemstoneEntry() {

    // With Builder Pattern
    val builder = GemstoneBuilder()
    val diamond = builder
        .name("Diamond")
        .weight(100)
        .build()

    // With named parameters:
    val emerald = Gemstone(
        name = "Emerald",
        weight = 200,
    )

    println("Gemstone with name parameters: $emerald")
    println("Built gemstone: $diamond")
}



