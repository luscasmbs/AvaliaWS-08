package br.senai.avaliaws08.ui.components.TelaInicial

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.avaliaws08.ui.theme.Blue50
import br.senai.avaliaws08.ui.theme.Gray10
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.White

@Composable
fun SumaryCards(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Gray40)
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            SummaryCard(
                number = "4",
                label = "Competidores",
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            )
            SummaryCard(
                number = "4",
                label = "Entregas registradas",
                modifier = Modifier
                    .weight(1f)
                    .height(100.dp)
            )
        }

        SummaryCard(
            number = "3",
            label = "Avaliados pelo motor de regras",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}

@Composable
private fun SummaryCard(
    number: String,
    label: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .border(width = 1.dp, color = Gray10, shape = RoundedCornerShape(16.dp))
            .background(color = White, shape = RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Column {
            Text(
                color = Blue50,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                text = number
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraLight,
                text = label
            )
        }
    }
}

@Preview
@Composable
private fun SumaryCardsPreview(){
    SumaryCards()
}