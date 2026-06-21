package br.senai.avaliaws08.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import br.senai.avaliaws08.data.CompetidorRepository
import br.senai.avaliaws08.model.EntregaTecnica
import br.senai.avaliaws08.model.TempoEntrega
import br.senai.avaliaws08.service.MotorAvaliacao
import br.senai.avaliaws08.ui.components.Avaliacao.*

@Composable
fun TelaAvaliacao(
    navController: NavController,
    competidorId: String
) {

    val competidor =
        CompetidorRepository
            .listar()
            .firstOrNull {
                it.id == competidorId
            } ?: return

    var nota by rememberSaveable { mutableStateOf("") }
    var commits by rememberSaveable { mutableStateOf("") }
    var tempo by rememberSaveable { mutableStateOf("") }

    var readme by rememberSaveable { mutableStateOf(false) }
    var checklist by rememberSaveable { mutableStateOf(false) }
    var evidencia by rememberSaveable { mutableStateOf(false) }
    var funcional by rememberSaveable { mutableStateOf(false) }
    var apresentacao by rememberSaveable { mutableStateOf(false) }
    var correcao by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier.verticalScroll(
            rememberScrollState()
        )
    ) {

        HeaderAvaliacao(navController)

        CompetidorSelecionado(competidor)

        FormularioAvaliacao(
            nota = nota,
            commits = commits,
            tempo = tempo,

            possuiReadme = readme,
            possuiCheck = checklist,
            possuiEvidencia = evidencia,
            possuiItemFuncional = funcional,
            realizouApresentacao = apresentacao,
            corrigiuErro = correcao,

            onNotaChange = { nota = it },
            onCommitsChange = { commits = it },
            onTempoChange = { tempo = it },

            onReadmeChange = { readme = it },
            onCheckChange = { checklist = it },
            onEvidenciaChange = { evidencia = it },
            onItemFuncionalChange = { funcional = it },
            onApresentacaoChange = { apresentacao = it },
            onCorrecaoChange = { correcao = it }
        )

        ButtonAvaliar {

            val entrega = EntregaTecnica(
                notaBase = nota.toDouble(),
                qntCommits = commits.toInt(),
                possuiReadme = readme,
                possuiCheck = checklist,
                possuiEvidencia = evidencia,
                possuiItemFuncional = funcional,
                realizouApresentacao = apresentacao,
                corrigiuErro = correcao,
                tempoEntrega = TempoEntrega(
                    tempo.toInt()
                )
            )

            val resultado =
                MotorAvaliacao().avaliar(
                    competidor.copy(
                        entrega = entrega
                    )
                )

        }

    }
}