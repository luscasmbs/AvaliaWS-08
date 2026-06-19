package br.senai.avaliaws08.ui.components.Competidores

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.avaliaws08.ui.theme.Gray40
import br.senai.avaliaws08.ui.theme.Gray50

@Composable
fun BarSearch(onSearchTex: (String) -> Unit = {}) {
    var busca by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxWidth().background(Gray40).padding(16.dp),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = busca,
            onValueChange = { searchTex ->
                busca =searchTex
                onSearchTex(searchTex)

            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Icone de lupa"
                )
            },
            placeholder = {
                Text(
                    text = "Busca",
                    color = Gray50
                )
            }

        )
    }
}

@Preview
@Composable
private fun BarSearchPreview(){
    BarSearch()
}
