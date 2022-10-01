package com.valencio.wavestimer.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController


private val AndroidBlueColor = Color(0xff9bbed3)
private val AndroidBlueDarkerColor = Color(0xff073042)

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = WhiteF3F3,
    surface = AndroidBlueColor.copy(alpha = 0.08f).compositeOver(Color(0xff121212)),
    background = AndroidBlueColor.copy(alpha = 0.08f).compositeOver(Color(0xff121212))
)

private val LightColorPalette = lightColors(
    primary = Grey4343,
    primaryVariant = Purple700,
    secondary = WhiteF3F3

)

@Composable
fun WavesTimerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

@Composable
fun EdgeToEdgeContent(content: @Composable () -> Unit) {
    val isLightTheme = MaterialTheme.colors.isLight
    val controller = rememberSystemUiController()
    SideEffect {
        controller.setSystemBarsColor(color = Color.Transparent, darkIcons = isLightTheme)
    }
    ProvideWindowInsets(content = content)
}