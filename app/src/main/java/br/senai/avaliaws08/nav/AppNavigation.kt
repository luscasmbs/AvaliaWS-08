package br.senai.avaliaws08.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.screens.TelaCadastro
import br.senai.avaliaws08.ui.screens.TelaInicial

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home"
    )
    {
        composable("home"){
            TelaInicial(navController = navController)  // ← Passe o navController
        }
        composable("cadastro"){
            TelaCadastro(navController = navController)  // ← Passe o navController
        }
    }
}