package com.broughty.epl

import com.broughty.epl.db.entity.Game
import com.broughty.epl.db.entity.Player
import com.broughty.epl.db.repository.GameRepository
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
    fun init(playerRepository: PlayerRepository, gameRepository: GameRepository) = CommandLineRunner {
        log.info("adding players to database")
        val player = playerRepository.save(Player(name = "Matty", stars = 3, paid = true))
        log.info("Finished adding players - size = {}", playerRepository.count())
        val game = gameRepository.save(Game(name="One"))
        log.info("Finished adding game - size = {} game {}", gameRepository.count(), game)

    }

}

fun main(args: Array<String>) {
    runApplication<EplApplication>(*args)
}


