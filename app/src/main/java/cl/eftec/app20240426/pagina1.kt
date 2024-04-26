package cl.eftec.app20240426

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Pagina1(navController: NavController, paises: List<String>, agregarPais:()->Unit) {

    //ClaseEjemplo.campo3+="pagina,"
    Column {
        Text("Pagina:"+ClaseEjemplo.campo3)
        for (pais in paises) {

            ElevatedButton(onClick = {
                ClaseEjemplo.campo3=pais
                navController.navigate("detalle/$pais") }
            ) {
                Text(pais)
            }
        }
        Divider(color = Color.Red, thickness = 1.dp)
        ElevatedButton(onClick = {
            agregarPais()
        }) {
            Text("Agregar pais")
        }

    }
}
