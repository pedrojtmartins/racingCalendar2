package com.pjtm.racingcalendar2

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
import com.pjtm.racingcalendar2.ui.theme.RacingCalendarTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RacingCalendarTheme {
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    // A surface container using the 'background' color from the theme
    Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
    ) {
        Text(text = "Hello Android")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RacingCalendarTheme {
        WelcomeScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkModePreview() {
    RacingCalendarTheme(darkTheme = true) {
        WelcomeScreen()
    }
}