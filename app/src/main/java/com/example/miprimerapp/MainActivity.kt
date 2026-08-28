package com.example.miprimerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimerapp.ui.theme.MiPrimerAppTheme
import androidx.compose.ui.unit.dp


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
                    Presentacion()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun Presentacion () {
    Column (Modifier.padding (start = 20.dp , top = 50.dp)) {
        Text(text = "nombre")
        Text(text = "carrera")
        Text(text = "una tecnologia que el estudiante quiera aprender")
    }
}



@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    MiPrimerAppTheme {
        Presentacion ()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPrimerAppTheme {
        Greeting("Android")
    }
}
