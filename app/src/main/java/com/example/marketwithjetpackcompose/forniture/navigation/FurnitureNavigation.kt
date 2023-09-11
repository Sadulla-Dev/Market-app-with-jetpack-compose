package com.example.marketwithjetpackcompose.forniture.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marketwithjetpackcompose.forniture.screen.CheckOutScreen
import com.example.marketwithjetpackcompose.forniture.screen.HomeScreen
import com.example.marketwithjetpackcompose.forniture.screen.ProductDetailScreen

@Composable
fun FurnitureNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Home) {
        composable(Home) {
            HomeScreen(navController)
        }
        composable(Checkout) {
            CheckOutScreen(navController)
        }
        composable(ProductDetail) {
            ProductDetailScreen(navController)
        }

    }
}

const val Home = "home_screen"
const val ProductDetail = "product_detail_screen"
const val Checkout = "check_out_screen"