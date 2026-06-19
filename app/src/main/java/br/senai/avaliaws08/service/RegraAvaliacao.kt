package br.senai.avaliaws08.service

import br.senai.avaliaws08.model.EntregaTecnica
import br.senai.avaliaws08.model.Penalidade

interface RegraAvaliacao {
    fun avaliar(entrega: EntregaTecnica): ResultadoRegra
}
data class ResultadoRegra(
    val penalidade: Penalidade? = null,
    val pendencia: String? = null
)