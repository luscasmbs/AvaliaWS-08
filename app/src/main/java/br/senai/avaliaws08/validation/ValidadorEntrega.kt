package br.senai.avaliaws08.validation

import br.senai.avaliaws08.model.EntregaTecnica

object ValidadorEntrega {

    fun validar(
        entrega: EntregaTecnica
    ): List<String> {

        val erros = mutableListOf<String>()

        if (
            entrega.notaBase < 0 ||
            entrega.notaBase > 100
        ) {
            erros.add(
                "Nota deve estar entre 0 e 100"
            )
        }

        if (
            entrega.qntCommits < 0
        ) {
            erros.add(
                "Commits não podem ser negativos"
            )
        }

        if (
            entrega.tempoEntrega.minutos <= 0
        ) {
            erros.add(
                "Tempo deve ser maior que zero"
            )
        }

        return erros
    }
}