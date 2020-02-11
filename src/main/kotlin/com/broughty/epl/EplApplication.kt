package com.broughty.epl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EplApplication

fun main(args: Array<String>) {
	runApplication<EplApplication>(*args)
}
