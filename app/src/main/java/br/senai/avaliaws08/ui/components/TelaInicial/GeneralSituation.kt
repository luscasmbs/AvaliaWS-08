package br.senai.avaliaws08.ui.components.TelaInicial

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.avaliaws08.ui.theme.Blue30
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.Red30
import br.senai.avaliaws08.ui.theme.White
import br.senai.avaliaws08.ui.theme.Yellow30


@Composable
fun GeneralSituation(){
    Column(
        modifier = Modifier
            .fillMaxWidth().background(Gray40)
    ) {
        Text(
            text = "SITUAÇÃO GERAL",
            fontSize = 12.sp,
            fontWeight = FontWeight.ExtraLight,
            modifier = Modifier.padding(start = 16.dp)
        )
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SituationCard(
                number = "3",
                label = "Aprovados",
                modifier = Modifier.height(80.dp).width(100.dp),
                color = Blue30
            )//Caixa 1
            SituationCard(
                number = "4",
                label = "Reprovados",
                modifier = Modifier.height(80.dp).width(120.dp),
                color = Red30
            ) //Caixa 2
        SituationCard(
            number = "4",
            label = "Pendentes",
            modifier = Modifier.height(80.dp).width(100.dp),
            color = Yellow30
            ) //Caixa 3

        }

    }
}

@Composable
private fun SituationCard(
    number: String,
    label: String,
    modifier: Modifier = Modifier,
    color: Color
){
    Box(
        modifier = modifier
            .border(width = 1.dp, color = color, shape = RoundedCornerShape(16.dp))
            .background(color = White, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .padding(),
                color = color,

                fontSize = 25.sp,
                text = number,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(),
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraLight,
                text = label
            )
        }

    }
}

@Preview
@Composable
private fun GeneralSituationPreview(){
    GeneralSituation()
}