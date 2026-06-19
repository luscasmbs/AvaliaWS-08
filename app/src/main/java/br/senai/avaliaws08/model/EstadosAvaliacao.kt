package br.senai.avaliaws08.model

sealed class EstadosAvaliacao{
    data object aprovado: EstadosAvaliacao()
    data object reprovado: EstadosAvaliacao()
    data object pentente: EstadosAvaliacao()
    data class invalido(val motivo: String): EstadosAvaliacao()
}