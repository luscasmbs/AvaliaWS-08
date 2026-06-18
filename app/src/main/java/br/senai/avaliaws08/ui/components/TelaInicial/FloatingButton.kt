package br.senai.avaliaws08.ui.components.TelaInicial

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun FloatingButton(navController: NavController){
    Column(Modifier.fillMaxWidth().background(Gray40).padding(end = 16.dp),
        horizontalAlignment = Alignment.End) {
        Box(modifier = Modifier
            .background(Blue40, shape = RoundedCornerShape(16.dp))
            .height(50.dp)
            .width(50.dp)) {
            IconButton(
                onClick = {
                    navController.navigate("cadastro")
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Create,
                    contentDescription = "Icone de criação"
                )
            }
        }
    }
}

@Preview
@Composable
private fun FloattingButtonPreview(){
    FloatingButton(navController = rememberNavController())
}