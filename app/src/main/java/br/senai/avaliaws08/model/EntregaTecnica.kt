package br.senai.avaliaws08.model

data class EntregaTecnica(
    val notaBase: Double,
    val qntCommits: Int,
    val possuiReadme: Boolean,
    val possuiCheck: Boolean,
    val possuiEvidencia: Boolean,
    val possuiItemFuncional: Boolean,
    val realizouApresentacao: Boolean,
    val corrigiuErro: Boolean,
    val tempoEntrega: TempoEntrega
)
