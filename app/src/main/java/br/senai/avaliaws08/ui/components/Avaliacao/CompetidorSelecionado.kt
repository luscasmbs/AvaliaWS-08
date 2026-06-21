package br.senai.avaliaws08.ui.components.Avaliacao

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.avaliaws08.model.Competidor

@Composable
fun CompetidorSelecionado(
    competidor: Competidor
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(competidor.nome)

            Text("ID: ${competidor.id}")

            Text(competidor.unidade)

            Text(competidor.estado)

        }

    }

}

@Preview(showBackground = true)
@Composable
private fun CompetidorSelecionadoPreview() {

    CompetidorSelecionado(
        competidor = Competidor(
            id = "001",
            nome = "Lucas Silva",
            unidade = "SENAI Paulista",
            estado = "PE"
        )
    )

}