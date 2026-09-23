package com.example.myapplication.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = WarmPrimaryDark,
    secondary = WarmSecondaryDark,
    tertiary = WarmTertiaryDark,
    background = WarmBackgroundDark,
    surface = WarmSurfaceDark,
    onPrimary = Color(0xFF4A1A00),
    onSecondary = Color(0xFF3E2723),
    onTertiary = Color(0xFF4E2600),
    onBackground = Color(0xFFEDE0D4),
    onSurface = Color(0xFFEDE0D4)
)

private val LightColorScheme = lightColorScheme(
    primary = WarmPrimaryLight,
    secondary = WarmSecondaryLight,
    tertiary = WarmTertiaryLight,
    background = WarmBackgroundLight,
    surface = WarmSurfaceLight,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF211A15),
    onSurface = Color(0xFF211A15)
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Set default dynamicColor to false so custom warm palette is applied
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
