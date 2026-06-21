package br.senai.avaliaws08.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.avaliaws08.data.CompetidorRepository
import br.senai.avaliaws08.ui.components.Competidores.BarSearch
import br.senai.avaliaws08.ui.components.Competidores.CompetidorCard
import br.senai.avaliaws08.ui.components.Competidores.CompetidoresHeader
import br.senai.avaliaws08.ui.components.NavigationBar
import br.senai.avaliaws08.ui.theme.Gray40

@Composable
fun TelaCompetidores(
    navController: NavController
) {

    var busca by rememberSaveable {
        mutableStateOf("")
    }

    val competidores = CompetidorRepository.listar()

    val competidoresFiltrados =
        competidores.filter {

            it.nome.contains(
                busca,
                ignoreCase = true
            ) ||

                    it.id.contains(
                        busca,
                        ignoreCase = true
                    ) ||

                    it.unidade.contains(
                        busca,
                        ignoreCase = true
                    ) ||

                    it.estado.contains(
                        busca,
                        ignoreCase = true
                    )

        }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Gray40)
    ) {

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        CompetidoresHeader(
            navController = navController,
            quantidade = competidores.size
        )

        BarSearch(
            value = busca,
            onValueChange = {
                busca = it
            }
        )

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            if (competidoresFiltrados.isEmpty()) {

                item {

                    Text(
                        text = "Nenhum competidor encontrado.",
                        modifier = Modifier.padding(18.dp)
                    )

                }

            } else {

                items(
                    competidoresFiltrados
                ) { competidor ->

                    CompetidorCard(
                        competidor = competidor
                    )

                }

            }

        }



    }

}
@Preview(showBackground = true)
@Composable
private fun TelaCompetidoresPreview() {

    TelaCompetidores(
        navController = rememberNavController()
    )

}