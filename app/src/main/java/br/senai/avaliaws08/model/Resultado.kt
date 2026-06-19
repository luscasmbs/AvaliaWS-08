package br.senai.avaliaws08.model

data class Resultado(
    val competidor: Competidor,
    val pontuacaoBase: Int,
    val penalidade: List<Penalidade>,
    val pendencias: List<String>,
    val pontosPerdidos: Int,
    val pontuacaoFinal: Int,
    val estado: EstadosAvaliacao
)
