package com.example.figmamcp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


@Composable
fun FigmamcpsampleandroidTheme(
    content: @Composable () -> Unit
) {
    // https://developer.android.com/jetpack/compose/themes/material
    val extendedColors = if (isSystemInDarkTheme()) {
        GeneratedDarkColors
    } else {
        GeneratedLightColors
    }

    CompositionLocalProvider(
        LocalExtendedColors provides extendedColors,
    ) {
        MaterialTheme(
            typography = Typography,
            content = content
        )
    }
}