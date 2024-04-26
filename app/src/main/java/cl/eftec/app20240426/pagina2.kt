package cl.eftec.app20240426

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Pagina2(navController: NavController,idpais:String,modificarPais:()->Unit) {
    Column {
        Text("Pagina 2 argumento: "+idpais)
        Text("Pagina 2 estatico: "+ClaseEjemplo.campo3)
        ElevatedButton(onClick = { navController.popBackStack()}) {
            Text("Volver atras")
        }
        ElevatedButton(onClick = { modificarPais() }) {
            
        }
    }
}
