package br.senai.avaliaws08.model

data class Competidor(
    val id: String,
    val nome: String,
    val unidade: String,
    val estado: String,
    val entrega: EntregaTecnica? = null
)