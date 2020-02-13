package com.broughty.epl.db.repository

import com.broughty.epl.db.entity.Player
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository : CrudRepository<Player, Long> {
}