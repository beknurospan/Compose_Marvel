package com.jorgesm.usecases.local

import com.jorgesm.domain.model.Character
import com.jorgesm.domain.repositoy.LocalRepository
import javax.inject.Inject

class SaveCharacterInDataBaseUseCase @Inject constructor(
    private val localRepository: LocalRepository
) {
    suspend operator fun invoke(characters: List<Character>) =
        localRepository.saveAllCharacters(characters)
}