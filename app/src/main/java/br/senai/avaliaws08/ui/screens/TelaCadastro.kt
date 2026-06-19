package br.senai.avaliaws08.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.model.Competidor
import br.senai.avaliaws08.ui.components.Cadastro.ButtonAction
import br.senai.avaliaws08.ui.components.Cadastro.Forms
import br.senai.avaliaws08.ui.components.Cadastro.Header
import br.senai.avaliaws08.ui.components.NavigationBar
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun TelaCadastro(navController: NavController){
    var id by rememberSaveable { mutableStateOf("") }
    var nome by rememberSaveable { mutableStateOf("") }
    var unidade by rememberSaveable { mutableStateOf("") }
    var estado by rememberSaveable { mutableStateOf("") }

    val competidores = remember {
        mutableListOf<Competidor>()
    }

    Column(
        modifier = Modifier.fillMaxSize().background(Gray40)
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Header(navController = navController)
        Forms(
            id = id,
            nome = nome,
            unidade = unidade,
            estado = estado,
            onId = { novoId ->
                id = novoId
            },
            onNome = { novoNome ->
                nome = novoNome
            },
            onUnidade = { novaUnidade ->
                unidade = novaUnidade
            },
            onEstado = { novoEstado ->
                estado = novoEstado
            }

        )
        Spacer(Modifier.height(18.dp))
        ButtonAction(
            onCancelar = {
                id = ""
                nome = ""
                unidade = ""
                estado = ""
            },
            onCadastrar = {
                val competidor = Competidor(
                    id = id,
                    nome = nome,
                    unidade = unidade,
                    estado = estado
                )
                competidores.add(competidor)
            }
        )
        Spacer(Modifier.weight(1f))
        NavigationBar(navController = navController)
    }
}

@Preview
@Composable
private fun TelaCadastroPreview(){
    TelaCadastro(navController = rememberNavController())
}