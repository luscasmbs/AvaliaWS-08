package br.senai.avaliaws08.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.ui.components.NavigationBar
import br.senai.avaliaws08.ui.components.TelaInicial.FloatingButton
import br.senai.avaliaws08.ui.components.TelaInicial.GeneralSituation
import br.senai.avaliaws08.ui.components.TelaInicial.SumaryCards
import br.senai.avaliaws08.ui.components.TelaInicial.Tittle
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun TelaInicial(navController: NavController){
    Column(
        Modifier.fillMaxSize().background(Gray40)
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Tittle()
        Spacer(modifier = Modifier.height(10.dp))
        SumaryCards()
        Spacer(modifier = Modifier.height(30.dp))
        GeneralSituation()
        Spacer(modifier = Modifier.weight(1f))
        FloatingButton(navController = navController)
        Spacer(modifier = Modifier.height(30.dp))
        NavigationBar(navController = navController)
    }
}

@Preview
@Composable
private fun TelaInicialPreview(){
    TelaInicial(navController = rememberNavController())
}