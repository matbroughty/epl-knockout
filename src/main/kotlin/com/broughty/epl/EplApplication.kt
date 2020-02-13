package com.broughty.epl

import com.broughty.epl.db.entity.Player
import com.broughty.epl.db.repository.PlayerRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class EplApplication {
    private val log = LoggerFactory.getLogger(EplApplication::class.java)
    @Bean
    fun init(repository: PlayerRepository) = CommandLineRunner {
        log.info("adding players to database")
        repository.save(Player(name = "Matty", stars = 3, paid = true))
        log.info("Finished adding players - size = {}", repository.count())
    }

}

fun main(args: Array<String>) {
    runApplication<EplApplication>(*args)
}


