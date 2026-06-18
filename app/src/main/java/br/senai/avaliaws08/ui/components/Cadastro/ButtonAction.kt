package br.senai.avaliaws08.ui.components.Cadastro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.White

@Composable
fun ButtonAction(){
    Column(modifier = Modifier.fillMaxWidth().padding(start = 18.dp).background(Gray40)){
        Button(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue40,
                contentColor = White
            )
        ) {
            Text("Cadastrar competidor")
        }
    }
}

@Preview
@Composable
private fun ButtonActionPreview(){

}