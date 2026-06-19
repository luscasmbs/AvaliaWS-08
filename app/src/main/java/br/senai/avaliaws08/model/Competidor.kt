package br.senai.avaliaws08.model

data class Competidor(
    val id: String,
    val Nome: String,
    val Unidade: String,
    val Estado: String,
    val Entrega: EntregaTecnica? = null
)