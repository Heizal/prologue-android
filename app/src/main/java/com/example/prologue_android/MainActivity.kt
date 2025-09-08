package com.example.prologue_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.navigation.compose.NavHost
import com.example.prologue_android.ui.theme.PrologueandroidTheme
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrologueandroidTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home"){
                    composable("home") {Text("Home Screen")}
                    composable("profile") {Text("Profile Screen")
                }
            }
        }
    }
}

}
