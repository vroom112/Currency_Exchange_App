package com.example.currencyexchangeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.currencyexchangeapp.ui.theme.CurrencyExchangeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(val buttonConvert = findViewById<Button>(R.id.buttonConvert)
        val editTextBaseCurrency = findViewById<EditText>(R.id.editTextBaseCurrency)
        val editTextTargetCurrency = findViewById<EditText>(R.id.editTextTargetCurrency)
        val editTextAmount = findViewById<EditText>(R.id.editTextAmount)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonConvert.setOnClickListener {
            val baseCurrency = editTextBaseCurrency.text.toString()
            val targetCurrency = editTextTargetCurrency.text.toString()
            val amount = editTextAmount.text.toString().toDoubleOrNull()

            if (baseCurrency.isNotEmpty() && targetCurrency.isNotEmpty() && amount != null) {
                // Perform currency conversion here using an API or any other method
                // Replace the code below with your currency conversion logic
                val result = amount * 2.0

                textViewResult.text = result.toString()
            } else {
                textViewResult.text = "Invalid input"
            }
        }
        )
        setContentView(R.layout.activity_main)
        setContent {
            CurrencyExchangeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CurrencyExchangeAppTheme {
        Greeting("Android")
    }
}