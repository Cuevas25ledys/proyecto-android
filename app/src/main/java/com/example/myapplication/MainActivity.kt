package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.util.Locale

class MainActivity : ComponentActivity() {

    private lateinit var welcomeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);
        welcomeTextView = findViewById(R.id.welcome_text_view) // Assign ID to TextView

        // Determine device language or user preference
        val locale = Locale.getDefault().getLanguage();

        // Load appropriate string resource based on language
        val welcomeText = when (locale) {
            "en" -> getString(R.string.welcome_en)
            "es" -> getString(R.string.welcome_es)
            "fr" -> getString(R.string.welcome_fr)
            "de" -> getString(R.string.welcome_de)
            // Add more language cases as needed
            else -> getString(R.string.welcome_default) // Default string
        }

        welcomeTextView.text = welcomeText // Set text dynamically


    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}*/
