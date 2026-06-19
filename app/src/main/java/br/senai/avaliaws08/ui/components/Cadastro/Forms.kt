package br.senai.avaliaws08.ui.components.Cadastro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.avaliaws08.model.Competidor
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray15
import br.senai.avaliaws08.ui.theme.Gray20
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.Gray50

@Composable
fun Forms(
    id: String,
    nome: String,
    unidade: String,
    estado: String,
    onId: (String) -> Unit,
    onNome: (String) -> Unit,
    onUnidade: (String) -> Unit,
    onEstado: (String) -> Unit
){
    Column(
        modifier = Modifier.fillMaxWidth().background(Gray40).padding(horizontal = 18.dp)
    ) {
        Input(
            value = id,
            label = "Identificador",
            onValueChange = onId
        )
        Spacer(modifier = Modifier.height(13.dp))
        Input(
            value = nome,
            label = "Nome completo",
            onValueChange = onNome
        )
        Spacer(modifier = Modifier.height(13.dp))
        Input(
            value = unidade,
            label = "Unidade ou Escola",
            onValueChange = onUnidade
        )
        Spacer(modifier = Modifier.height(13.dp))
        Input(
            value = estado,
            label = "Estado ou região",
            onValueChange = onEstado
        )
    }
}

@Composable
private fun Input(
    value: String,
    label: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        shape = RoundedCornerShape(16.dp),
        singleLine = true,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(1f),
        label = {
            Text(text = label)
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Gray15,
            focusedBorderColor = Blue40,
            unfocusedLabelColor = Gray50,
            focusedLabelColor = Blue40,


        )
    )
}
@Preview
@Composable
private fun FormsPreview(){
    Forms(
        id = "001",
        nome = "Lucas Silva",
        unidade = "SENAI",
        estado = "Pernambuco",
        onId = {},
        onNome = {},
        onUnidade = {},
        onEstado = {}
    )
}