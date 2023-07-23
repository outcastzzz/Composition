package com.example.livedatatraining.domain.useCases

import com.example.livedatatraining.domain.entity.GameSettings
import com.example.livedatatraining.domain.entity.Level
import com.example.livedatatraining.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}