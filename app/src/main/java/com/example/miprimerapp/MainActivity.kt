package com.example.miprimerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column // AGREGADO - Ejercicio 2: para apilar los tres Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimerapp.ui.theme.MiPrimerAppTheme
import androidx.compose.ui.unit.dp // AGREGADO - Ejercicio 2: para el padding en dp de Presentacion

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Presentacion() // AGREGADO - Ejercicio 2: se llama desde la pantalla principal
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hola $name – Valentina",
        modifier = modifier
    )
}

// AGREGADO - Ejercicio 2: composable con los tres datos pedidos
@Composable
fun Presentacion() {
    Column(Modifier.padding(start = 20.dp, top = 50.dp)) {
        Text(text = "Valentina")
        Text(text = "Desarrollo de Software")
        Text(text = "Kotlin Multiplatform")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPrimerAppTheme {
        Greeting("Android")
    }
}

// AGREGADO - Ejercicio 2: preview para ver Presentacion() sin correr el emulador
@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    MiPrimerAppTheme {
        Presentacion()
    }
}