package br.senai.avaliaws08.ui.components.Avaliacao

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonAvaliar(
    onClick: () -> Unit
) {

    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(18.dp)
    ) {

        Text("Avaliar entrega")

    }

}

@Preview(showBackground = true)
@Composable
private fun ButtonAvaliarPreview() {

    ButtonAvaliar(
        onClick = {}
    )

}