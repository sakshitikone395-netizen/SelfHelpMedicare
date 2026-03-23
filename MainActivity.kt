package com.selfhealthmedicare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.selfhealthmedicare.theme.SelfHealthMedicareTheme   // ✅ CORRECT IMPORT
import com.selfhealthmedicare.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SelfHealthMedicareTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "splash"
                ) {

                    composable("splash") {
                        SplashScreen(navController)
                    }

                    composable("basicDetails") {
                        BasicDetailsScreen()
                    }
                }
            }
        }
    }
}
