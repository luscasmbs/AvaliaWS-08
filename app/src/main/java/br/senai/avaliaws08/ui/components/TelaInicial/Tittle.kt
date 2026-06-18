package br.senai.avaliaws08.ui.components.TelaInicial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.avaliaws08.ui.theme.Blue50
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun Tittle(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Gray40)
    ) {
        Text(
            text = "AvaliaWS 08.",
            color = Blue50,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 30.dp)
        )//Titulo princípal
        Text(
            text = "Motor de Regras para Avaliação de\nCompetidores.",
            fontSize = 14.sp,
            fontWeight = FontWeight.ExtraLight,
            modifier = Modifier
                .padding(start = 30.dp)
        )//Subtítulo
    }
}

@Preview
@Composable
private fun TittlePreview(){
    Tittle()
}