package com.broughty.epl.db.entity

import java.sql.Date
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.OneToMany


@Entity
data class PlayerChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int

    @ManyToOne(fetch = FetchType.LAZY)
    val player: Player? = null

    @ManyToOne(fetch = FetchType.LAZY)
    val team: Team? = null

    @Column(nullable = false)
    val created: Date

    @Column(nullable = false)
    val locked: Boolean = false

    @Column(nullable = false)
    val dead: Boolean = false

}