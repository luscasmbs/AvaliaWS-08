package br.senai.avaliaws08.model

data class Penalidade(
    val descricao: String,
    val pontosPerdidos: Int,
    val motivoCritico: Boolean = false
)
