package com.example.livedatatraining.domain.repository

import com.example.livedatatraining.domain.entity.GameSettings
import com.example.livedatatraining.domain.entity.Level
import com.example.livedatatraining.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}