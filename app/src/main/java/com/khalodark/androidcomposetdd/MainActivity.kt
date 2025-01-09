package com.khalodark.androidcomposetdd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.khalodark.androidcomposetdd.ui.theme.AndroidComposeTDDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidComposeTDDTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp(){
    Text("Home Screen")
}