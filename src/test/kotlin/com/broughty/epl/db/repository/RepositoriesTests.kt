package com.broughty.epl.db.repository

import com.broughty.epl.db.entity.Player
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val playerRepository: PlayerRepository) {

    @Test
    fun `When findByIdOrNull then return Player`() {
        val player = Player(name = "Matty")
        entityManager.persist(player)
        entityManager.flush()
        val found = playerRepository.findByIdOrNull(player.id)
        assertThat(found).isEqualTo(player)
        val notFound = playerRepository.findByIdOrNull(932489238)
        assertThat(notFound).isNull()
    }

}