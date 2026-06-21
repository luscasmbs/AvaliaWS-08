package br.senai.avaliaws08.service

import br.senai.avaliaws08.model.*

class MotorAvaliacao {

    private val regras = listOf(
        RegraReadme(),
        RegraCommits(),
        RegraCheckList(),
        RegraEvidencias(),
        RegraItemFuncional(),
        RegraApresentacao(),
        RegraTempoEntrega(),
        RegraCorrecao()
    )

    fun avaliar(
        competidor: Competidor
    ): Resultado {

        val entrega = competidor.entrega

        if (entrega == null) {

            return Resultado(
                competidor = competidor,
                pontuacaoBase = 0,
                penalidade = emptyList(),
                pendencias = listOf(
                    "Competidor sem entrega técnica"
                ),
                pontosPerdidos = 0,
                pontuacaoFinal = 0,
                estado = EstadosAvaliacao.pendente
            )
        }

        val penalidades = mutableListOf<Penalidade>()
        val pendencias = mutableListOf<String>()

        regras.forEach { regra ->

            val resultado = regra.avaliar(entrega)

            resultado.penalidade?.let {
                penalidades.add(it)
            }

            resultado.pendencia?.let {
                pendencias.add(it)
            }
        }

        val pontosPerdidos =
            penalidades.sumOf {
                it.pontosPerdidos
            }

        val pontuacaoBase =
            entrega.notaBase.toInt()

        val pontuacaoFinal =
            (pontuacaoBase - pontosPerdidos)
                .coerceAtLeast(0)

        val possuiReprovacaoCritica =
            penalidades.any {
                it.motivoCritico
            }

        val estado = when {

            possuiReprovacaoCritica -> {
                EstadosAvaliacao.reprovado
            }

            pontuacaoFinal < 70 -> {
                EstadosAvaliacao.reprovado
            }

            pendencias.isNotEmpty() -> {
                EstadosAvaliacao.pendente
            }

            else -> {
                EstadosAvaliacao.aprovado
            }
        }

        return Resultado(
            competidor = competidor,
            pontuacaoBase = pontuacaoBase,
            penalidade = penalidades,
            pendencias = pendencias,
            pontosPerdidos = pontosPerdidos,
            pontuacaoFinal = pontuacaoFinal,
            estado = estado
        )
    }
}