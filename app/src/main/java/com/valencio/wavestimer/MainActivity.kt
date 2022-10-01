package com.valencio.wavestimer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.valencio.wavestimer.ui.theme.EdgeToEdgeContent
import com.valencio.wavestimer.ui.theme.WavesTimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WavesTimerTheme {
                EdgeToEdgeContent {
                    WavesTimer()
                }
            }
        }
    }
}

