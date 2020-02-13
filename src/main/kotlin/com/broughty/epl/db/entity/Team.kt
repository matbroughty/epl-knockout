package com.broughty.epl.db.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name="team")
data class Team (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val shortName: String,

    @OneToMany(mappedBy = "team", cascade = [CascadeType.ALL], orphanRemoval = true)
    val choices: List<PlayerChoice> = Collections.emptyList()

)