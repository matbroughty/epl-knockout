package com.broughty.epl.db.entity

import java.util.*
import javax.persistence.*


@Entity
@Table(name="game")
data class Game(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val name: String,

    @OneToMany(mappedBy = "game", cascade = [CascadeType.ALL], orphanRemoval = true)
    val weeks: List<Week> = Collections.emptyList()
)