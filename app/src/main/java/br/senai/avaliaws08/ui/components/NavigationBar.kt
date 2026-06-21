package br.senai.avaliaws08.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Contrast
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.theme.Blue40
import br.senai.avaliaws08.ui.theme.Gray20

@Composable
fun NavigationBar(
    navController: NavController,
    selectButton: Int,
    onSelectButton: (Int) -> Unit
) {
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
                    onClick = {
                        onSelectButton(0)
                        navController.navigate("home")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription = "Icone de inicio",
                        tint = if (selectButton == 0) Blue40 else Color.Black
                    )
                }
                IconButton(
                    onClick = {
                        onSelectButton(1)
                        navController.navigate("competidores")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Menu,
                        contentDescription = "Icone de equipe",
                        tint = if (selectButton == 1) Blue40 else Color.Black
                    )
                }
                IconButton(
                    onClick = {
                        onSelectButton(2)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.StarOutline,
                        contentDescription = "Icone do ranking",
                        tint = if (selectButton == 2) Blue40 else Color.Black
                    )
                }
                IconButton(
                    onClick = {
                        onSelectButton(3)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Contrast,
                        contentDescription = "Icone de penalidades",
                        tint = if (selectButton == 3) Blue40 else Color.Black
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun NavigationBarPreview() {
    NavigationBar(
        navController = rememberNavController(),
        selectButton = 0,
        onSelectButton = {}
    )
}