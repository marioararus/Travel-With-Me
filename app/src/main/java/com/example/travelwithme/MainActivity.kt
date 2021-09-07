package com.example.travelwithme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelwithme.ui.theme.TravelWithMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelWithMeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Travel and Learn with me")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Glad you are here to $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TravelWithMeTheme {
        Greeting("Travel and Learn with me")
    }
}
