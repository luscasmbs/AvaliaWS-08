package br.senai.avaliaws08.ui.components.Competidores

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.avaliaws08.model.Competidor
import br.senai.avaliaws08.ui.theme.Gray15
import br.senai.avaliaws08.ui.theme.White

@Composable
fun CompetidorCard(
    competidor: Competidor
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 18.dp,
                vertical = 6.dp
            ),
        shape = RoundedCornerShape(16.dp)
    ) {

        Column(
            modifier = Modifier
                .background(Gray15)
                .padding(16.dp)
        ) {

            Text(
                text = competidor.nome,
                color = White,
                fontSize = 18.sp
            )

            Text(
                text = "ID: ${competidor.id}",
                color = White
            )

            Text(
                text = competidor.unidade,
                color = White
            )

            Text(
                text = competidor.estado,
                color = White
            )

        }

    }

}
@Preview(showBackground = true)
@Composable
private fun CompetidorCardPreview() {

    CompetidorCard(
        competidor = Competidor(
            id = "001",
            nome = "Lucas Silva",
            unidade = "SENAI Paulista",
            estado = "PE"
        )
    )

}