package com.broughty.epl.db.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name="week")
data class Week(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val number: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    val game: Game? = null,

    @OneToMany(mappedBy = "week", cascade = [CascadeType.ALL], orphanRemoval = true)
    val choices: List<PlayerChoice> = Collections.emptyList()

)