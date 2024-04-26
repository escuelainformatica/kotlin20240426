package cl.eftec.app20240426

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cl.eftec.app20240426.ui.theme.App20240426Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App20240426Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    var paises = remember { mutableStateListOf("chile","argentina","peru")}





                    NavHost(
                        navController = navController,
                        startDestination = "listado"
                    ) {
                        composable("listado") {
                            Pagina1(navController,paises, agregarPais = {paises.add("nuevo")})

                        }
                        composable("detalle/{idpais}"
                            ,arguments = listOf(navArgument("idpais") { type = NavType.StringType })) {
                            lambda -> Pagina2(
                            navController,
                            lambda.arguments?.getString("idpais") ?: "", modificarPais = {
                                //paises.find { it == lambda.arguments?.getString("idpais") ?: ""}?.first()
                                var indice=paises.indexOf(lambda.arguments?.getString("idpais") ?: "")
                                paises[indice]=paises[indice].uppercase();
                                //paises.set() [indice]=paises.get(indice).uppercase()


                            }

                            )
                        }
                    }
                }
            }
        }
    }
}
