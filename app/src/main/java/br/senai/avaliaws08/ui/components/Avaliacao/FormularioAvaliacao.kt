package br.senai.avaliaws08.ui.components.Avaliacao

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FormularioAvaliacao(
    nota: String,
    commits: String,
    tempo: String,

    possuiReadme: Boolean,
    possuiCheck: Boolean,
    possuiEvidencia: Boolean,
    possuiItemFuncional: Boolean,
    realizouApresentacao: Boolean,
    corrigiuErro: Boolean,

    onNotaChange: (String) -> Unit,
    onCommitsChange: (String) -> Unit,
    onTempoChange: (String) -> Unit,

    onReadmeChange: (Boolean) -> Unit,
    onCheckChange: (Boolean) -> Unit,
    onEvidenciaChange: (Boolean) -> Unit,
    onItemFuncionalChange: (Boolean) -> Unit,
    onApresentacaoChange: (Boolean) -> Unit,
    onCorrecaoChange: (Boolean) -> Unit
) {

    Column(
        modifier = Modifier.padding(18.dp)
    ) {

        OutlinedTextField(
            value = nota,
            onValueChange = onNotaChange,
            label = {
                Text("Nota base (0-100)")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = commits,
            onValueChange = onCommitsChange,
            label = {
                Text("Quantidade de commits")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = tempo,
            onValueChange = onTempoChange,
            label = {
                Text("Tempo de entrega (min)")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(16.dp))

        CheckboxLinha("Possui README", possuiReadme, onReadmeChange)

        CheckboxLinha("Possui Checklist", possuiCheck, onCheckChange)

        CheckboxLinha("Possui Evidências", possuiEvidencia, onEvidenciaChange)

        CheckboxLinha("Possui Item Funcional", possuiItemFuncional, onItemFuncionalChange)

        CheckboxLinha("Realizou Apresentação", realizouApresentacao, onApresentacaoChange)

        CheckboxLinha("Corrigiu Erro", corrigiuErro, onCorrecaoChange)
    }
}

@Composable
private fun CheckboxLinha(
    texto: String,
    valor: Boolean,
    onChange: (Boolean) -> Unit
) {

    Row {

        Checkbox(
            checked = valor,
            onCheckedChange = onChange
        )

        Text(texto)

    }
}

@Preview(showBackground = true)
@Composable
private fun FormularioAvaliacaoPreview() {

    FormularioAvaliacao(
        nota = "85",
        commits = "5",
        tempo = "120",

        possuiReadme = true,
        possuiCheck = true,
        possuiEvidencia = true,
        possuiItemFuncional = true,
        realizouApresentacao = true,
        corrigiuErro = false,

        onNotaChange = {},
        onCommitsChange = {},
        onTempoChange = {},

        onReadmeChange = {},
        onCheckChange = {},
        onEvidenciaChange = {},
        onItemFuncionalChange = {},
        onApresentacaoChange = {},
        onCorrecaoChange = {}
    )

}