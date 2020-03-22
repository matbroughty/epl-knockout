package com.broughty.epl.graphql.query

import com.broughty.epl.db.entity.Player
import com.broughty.epl.db.repository.PlayerRepository
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*
import java.util.stream.Collectors

@Component
data class PlayerQuery(val playerRepository: PlayerRepository) : GraphQLQueryResolver {

    fun getPlayers(count: Int): List<Player?>? {
        return playerRepository.findAll().stream().limit(count.toLong()).collect(Collectors.toList())
    }

    fun getPlayer(id: Int): Optional<Player?>? {
        return playerRepository.findById(id)
    }
}

@Component
data class PlayerMutation(val playerRepository: PlayerRepository) : GraphQLMutationResolver {

    /**
     * name: String, stars: Int, paid: Boolean
     */
    fun createPlayer(name: String, stars: Int, paid: Boolean): Player {
        return playerRepository.save(Player(name = name, stars = stars, paid = paid))
    }


}


