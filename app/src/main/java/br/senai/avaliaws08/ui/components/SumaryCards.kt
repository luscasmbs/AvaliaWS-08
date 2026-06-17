package br.senai.avaliaws08.ui.components

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
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Blue50
import br.senai.avaliaws08.ui.theme.Gray10
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.White

@Composable
fun SumaryCards(){
    Column(
        modifier = Modifier
            .fillMaxWidth().background(Gray40)
    ) {
        Row( modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .width(180.dp)
                    .border(width = 1.dp, color = Gray10, shape = RoundedCornerShape(16.dp))
                    .background(color = White, shape = RoundedCornerShape(16.dp))
            ){
                Text(
                    modifier = Modifier
                        .padding(25.dp),
                    color = Blue50,

                    fontSize = 25.sp,
                    text = "4",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 25.dp, top = 60.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    text = "Competidores"
                )
            }
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .width(180.dp)
                    .border(width = 1.dp, color = Gray10, shape = RoundedCornerShape(16.dp))
                    .background(color = White, shape = RoundedCornerShape(16.dp))
            ){
                Text(
                    modifier = Modifier
                        .padding(25.dp),
                    color = Blue50,

                    fontSize = 25.sp,
                    text = "4",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 25.dp, top = 60.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    text = "Entregas registradas"
                )
            }

        }
        Box(
            modifier = Modifier
                .padding(start = 12.dp)
                .height(100.dp)
                .width(372.dp)
                .border(width = 1.dp, color = Gray10, shape = RoundedCornerShape(16.dp))
                .background(color = White, shape = RoundedCornerShape(16.dp))
        ){
            Text(
                modifier = Modifier
                    .padding(25.dp),
                color = Blue50,

                fontSize = 25.sp,
                text = "3",
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(start = 25.dp, top = 60.dp),
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraLight,
                text = "Avaliados pelo motor de regras"
            )
        }

    }
}

@Preview
@Composable
private fun SumaryCardsPreview(){
    SumaryCards()
}