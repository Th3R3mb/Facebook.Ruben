package com.rmariaca.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rmariaca.facebook.ui.Routes
import com.rmariaca.facebook.ui.screens.FacebookLoginScreen
import com.rmariaca.facebook.ui.screens.FacebookRegisterScreen
import com.rmariaca.facebook.ui.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myNavController = rememberNavController()
            NavHost(
                navController = myNavController,
                startDestination = Routes.LOGIN,
                modifier = Modifier.fillMaxSize()
            ) {
                composable(route = Routes.LOGIN) {
                    FacebookLoginScreen(
                        onRegisterClick = {
                            myNavController.navigate(route = Routes.REGISTER)
                        },
                        onLoginClick = {
                            myNavController.navigate(Routes.FEED) {
                                popUpTo(Routes.LOGIN) {
                                    inclusive = true
                                }
                            }
                        }
                    )
                }
                composable(Routes.REGISTER) {
                    FacebookRegisterScreen(
                        onBackClick = {
                            myNavController.navigate(Routes.LOGIN)
                        }
                    )
                }
                composable(Routes.FEED) {
                    MainScreen()
                }
            }
        }
    }
}