package br.senai.avaliaws08.validation

import br.senai.avaliaws08.data.CompetidorRepository

object ValidadorCompetidor {

    fun validar(
        id: String,
        nome: String,
        unidade: String,
        estado: String
    ): String? {

        if (id.isBlank()) {
            return "Informe o identificador."
        }

        if (nome.isBlank()) {
            return "Informe o nome do competidor."
        }

        if (nome.trim().split(" ").size < 2) {
            return "Informe nome e sobrenome."
        }

        if (unidade.isBlank()) {
            return "Informe a unidade."
        }

        if (estado.isBlank()) {
            return "Informe o estado ou regional."
        }

        if (CompetidorRepository.existeId(id)) {
            return "Já existe um competidor com esse identificador."
        }

        return null
    }
}