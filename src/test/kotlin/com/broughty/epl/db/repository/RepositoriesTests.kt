package com.broughty.epl.db.repository

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val playerRepository: PlayerRepository) {

    @Test
    fun `When findByIdOrNull then return Player`() {
        val juergen = Player()
        entityManager.persist(juergen)
        val player = Player("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", juergen)
        entityManager.persist(player)
        entityManager.flush()
        val found = articleRepository.findByIdOrNull(player.id!!)
        assertThat(found).isEqualTo(article)
    }

}