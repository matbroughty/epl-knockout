package com.broughty.epl.db.repository

import com.broughty.epl.db.entity.Game
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameRepository : JpaRepository<Game, Int> {

}