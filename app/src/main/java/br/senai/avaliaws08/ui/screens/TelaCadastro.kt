package br.senai.avaliaws08.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.model.CompetidorData
import br.senai.avaliaws08.ui.components.Cadastro.ButtonAction
import br.senai.avaliaws08.ui.components.Cadastro.Forms
import br.senai.avaliaws08.ui.components.Cadastro.Header
import br.senai.avaliaws08.ui.components.NavigationBar
import br.senai.avaliaws08.ui.components.TelaInicial.FloatingButton
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun TelaCadastro(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize().background(Gray40)
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Header(navController = navController)
        Forms(
            competidor = CompetidorData(1,"Bobo","SANTO","PE"),
            onId = {},
            onNome = {},
            onUnidade = {},
            onEstado = {}
        )
        Spacer(Modifier.height(18.dp))
        ButtonAction()
        Spacer(Modifier.weight(1f))
        NavigationBar(navController = navController)
    }
}

@Preview
@Composable
private fun TelaCadastroPreview(){
    TelaCadastro(navController = rememberNavController())
}