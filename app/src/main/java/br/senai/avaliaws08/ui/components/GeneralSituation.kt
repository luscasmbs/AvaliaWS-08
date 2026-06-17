package br.senai.avaliaws08.ui.components

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.avaliaws08.ui.theme.Blue30
import br.senai.avaliaws08.ui.theme.Blue50
import br.senai.avaliaws08.ui.theme.Gray10
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
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .height(80.dp)
                    .width(100.dp)
                    .border(width = 1.dp, color = Blue30, shape = RoundedCornerShape(16.dp))
                    .background(color = White, shape = RoundedCornerShape(16.dp))
            ) {
                Text(
                    modifier = Modifier
                        .padding(25.dp),
                    color = Blue30,

                    fontSize = 25.sp,
                    text = "4",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 25.dp, top = 60.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    text = "Aprovados"
                )
            }
            Box(
                modifier = Modifier
                    .height(80.dp)
                    .width(120.dp)
                    .border(width = 1.dp, color = Red30, shape = RoundedCornerShape(16.dp))
                    .background(color = White, shape = RoundedCornerShape(16.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                }
                Text(
                    modifier = Modifier
                        .padding(25.dp),
                    color = Red30,

                    fontSize = 25.sp,
                    text = "4",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 25.dp, top = 60.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    text = "Reprovados"
                )
            }
            Box(
                modifier = Modifier
                    .height(80.dp)
                    .width(100.dp)
                    .border(width = 1.dp, color = Yellow30, shape = RoundedCornerShape(16.dp))
                    .background(color = White, shape = RoundedCornerShape(16.dp))
            ) {
                Text(
                    modifier = Modifier
                        .padding(25.dp),
                    color = Yellow30,

                    fontSize = 25.sp,
                    text = "4",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(start = 25.dp, top = 60.dp),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraLight,
                    text = "Pendentes"
                )
            }

        }

    }
}

@Preview
@Composable
private fun GeneralSituationPreview(){
    GeneralSituation()
}