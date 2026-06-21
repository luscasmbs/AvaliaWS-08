package br.senai.avaliaws08.ui.components.Avaliacao

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NavigateBefore
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun HeaderAvaliacao(
    navController: NavController
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Gray40)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(
            onClick = {
                navController.popBackStack()
            }
        ) {

            Icon(
                imageVector = Icons.Default.NavigateBefore,
                contentDescription = "Voltar"
            )

        }

        Column {

            Text(
                text = "Avaliação",
                color = Blue40,
                fontSize = 18.sp
            )

            Text(
                text = "Avaliação técnica do competidor",
                fontWeight = FontWeight.Light,
                fontSize = 11.sp
            )

        }

    }
}
@Preview(showBackground = true)
@Composable
private fun HeaderAvaliacaoPreview() {
    HeaderAvaliacao(
        navController = rememberNavController()
    )
}