package com.prologue.core.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF0B6B37),     // brand green
    secondary = Color(0xFF4D4D4D),   // secondary text
    background = Color(0xFFFFFFFF),  // white background
    surface = Color(0xFFF8F8F8),     // light gray cards
    onPrimary = Color.White,         // text on green
    onBackground = Color(0xFF1A1A1A),// main text
    onSurface = Color(0xFF1A1A1A),   // text on cards
    error = Color(0xFFFF6B6B),       // red for errors / delete
    outline = Color(0xFFD9D9D9)      // card borders
)

// Optional dark theme if you want:
private val DarkColors = darkColorScheme(
    primary = Color(0xFF0B6B37),
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    onPrimary = Color.White,
    onBackground = Color(0xFFEAEAEA),
    onSurface = Color(0xFFEAEAEA),
    error = Color(0xFFFF6B6B),
    outline = Color(0xFF444444)
)

@Composable
fun PrologueTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}
