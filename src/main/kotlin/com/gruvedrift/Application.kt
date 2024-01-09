package com.gruvedrift

import com.gruvedrift.models.gemstoneEntry
import com.gruvedrift.models.miningCartEntry
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    gemstoneEntry()
    miningCartEntry()
}
