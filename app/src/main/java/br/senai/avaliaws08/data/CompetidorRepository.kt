package br.senai.avaliaws08.data

import br.senai.avaliaws08.model.Competidor

object CompetidorRepository {

    private val competidores = mutableListOf<Competidor>()

    fun adicionar(competidor: Competidor) {
        competidores.add(competidor)
    }

    fun listar(): List<Competidor> {
        return competidores
    }

    fun existeId(id: String): Boolean {
        return competidores.any {
            it.id.equals(id, ignoreCase = true)
        }
    }
}