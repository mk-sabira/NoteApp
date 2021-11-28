package com.example.notes.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = DarkGrey,
    onBackground = Color.White,
    surface = LightBlue,
    onSurface = DarkGrey
)

@Composable
fun CleanArchitectureNotesTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit){
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography(),
        shapes = Shapes,
        content = content
    )
}