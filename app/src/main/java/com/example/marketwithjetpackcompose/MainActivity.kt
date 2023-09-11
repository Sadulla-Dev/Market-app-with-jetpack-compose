package com.example.marketwithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.marketwithjetpackcompose.forniture.navigation.FurnitureNavigation
import com.example.marketwithjetpackcompose.ui.theme.MarketWithJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketWithJetpackComposeTheme {
                FurnitureNavigation()
            }
        }
    }
}

@Preview
@Composable
fun sa() {
    MarketWithJetpackComposeTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            FurnitureNavigation()
        }
    }
}