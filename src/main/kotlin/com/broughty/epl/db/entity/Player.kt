package com.broughty.epl.db.entity

import java.util.*
import javax.persistence.*


@Entity
@Table(name="player")
data class Player(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(nullable = false)
    val name: String = "",

    @Column(nullable = false)
    val stars: Int = 0,

    @Column(nullable = false)
    val paid: Boolean = false,

    @OneToMany(mappedBy = "player", cascade = [CascadeType.ALL], orphanRemoval = true)
    val choices: List<PlayerChoice> = Collections.emptyList()
)