package br.senai.avaliaws08.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Contrast
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray20

import br.senai.avaliaws08.ui.theme.Gray30

@Composable
fun NavigationBar(){
    val selectButton = remember { mutableStateOf(0) }
    BottomAppBar(
        modifier = Modifier.height(80.dp),
        containerColor = Gray20,
        actions = {

            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(54.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick ={
                        selectButton.value = 0
                    },

                ) {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription = "Icone de inicio",
                        tint = if (selectButton.value == 0){
                            Blue40
                        } else {Color.Black}
                    )

                }//Botão 1
                IconButton(
                    onClick = {
                    selectButton.value = 1
                    },

                ) {
                    Icon(
                        imageVector = Icons.Outlined.Menu,
                        contentDescription = "Icone de equipe",
                                tint = if (selectButton.value == 1){
                            Blue40
                        } else {Color.Black}
                    )
                }//Botão 2
                IconButton(
                    onClick = {
                    selectButton.value = 2
                    },
                ) {
                    Icon(
                        imageVector = Icons.Outlined.StarOutline,
                        contentDescription = "Icone do ranking",
                        tint = if (selectButton.value == 2){
                            Blue40
                        } else {Color.Black}
                    )
                }//Botão 3
                IconButton(
                    onClick = {
                    selectButton.value = 3
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Contrast,
                        contentDescription = "Icone de penalidades",
                        tint = if (selectButton.value == 3){
                            Blue40
                        } else {Color.Black}
                    )
                }//Botão 4

            }

        }
    )
}



@Preview
@Composable
private fun NavigationBarPreview(){
    NavigationBar()
}