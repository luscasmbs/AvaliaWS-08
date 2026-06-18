package br.senai.avaliaws08.ui.components.Cadastro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
fun Header(navController: NavController){
    Column(modifier = Modifier.fillMaxWidth().background(Gray40)) {
        Row( modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically){
            IconButton(
                onClick ={
                    navController.popBackStack()
                },
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.NavigateBefore,
                    contentDescription = "Voltar tela"
                )
            }
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Cadastrar competidor",
                    fontSize = 18.sp,
                    color = Blue40
                )
                Text(
                    text = "Dados básicos do participante",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.ExtraLight,
                )
            }
        }
    }
}

@Preview
@Composable
private fun HeaderPreview(){
    Header(navController = rememberNavController())
}