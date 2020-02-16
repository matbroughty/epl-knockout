package com.broughty.epl.db.repository

import com.broughty.epl.db.entity.Game
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : CrudRepository<Game, Int> {

}