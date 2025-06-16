package com.example.figmamcp.ui.theme

import androidx.compose.runtime.Composable

object ExtendedTheme {
    val colors: ExtendedColors
        @Composable
        get() = LocalExtendedColors.current
}
