package br.senai.avaliaws08.model

sealed class EstadosAvaliacao {

    data object aprovado : EstadosAvaliacao()

    data object reprovado : EstadosAvaliacao()

    data object pendente : EstadosAvaliacao()

    data class invalido(
        val motivo: String
    ) : EstadosAvaliacao()
}