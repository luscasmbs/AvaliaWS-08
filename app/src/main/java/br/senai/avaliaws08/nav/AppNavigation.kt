package br.senai.avaliaws08.nav

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.components.NavigationBar
import br.senai.avaliaws08.ui.screens.TelaCadastro
import br.senai.avaliaws08.ui.screens.TelaCompetidores
import br.senai.avaliaws08.ui.screens.TelaInicial

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val selectButton = rememberSaveable { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar(
                navController = navController,
                selectButton = selectButton.value,
                onSelectButton = { selectButton.value = it }
            )
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("home") {
                TelaInicial(navController = navController)
            }
            composable("cadastro") {
                TelaCadastro(navController = navController)
            }
            composable("competidores") {
                TelaCompetidores(navController = navController)
            }
        }
    }
}