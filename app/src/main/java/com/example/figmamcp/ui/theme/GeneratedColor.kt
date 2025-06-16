package com.example.figmamcp.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
class ExtendedColors(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val error: Color,
    val onError: Color,
    val errorContainer: Color,
    val onErrorContainer: Color,
    val background: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val outline: Color,
    val outlineVariant: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val scrim: Color,
    val buttonHover: Color,
    val listBackground: Color,
    val progressTrack: Color,
    val progressTrack2: Color,
    val navigationBackground: Color,
    val opacity06: Color,
    val opacity08: Color,
    val opacity12: Color,
)

// Light Theme Colors
private object LightThemeColors {
    val md_theme_light_primary = Color(0xFF1560D0) // blue40
    val md_theme_light_onPrimary = Color(0xFFFFFFFF) // white
    val md_theme_light_primaryContainer = Color(0xFFD6E3FF) // blue90
    val md_theme_light_onPrimaryContainer = Color(0xFF001C3B) // blue10
    val md_theme_light_secondary = Color(0xFF5B8DEF) // blue60
    val md_theme_light_onSecondary = Color(0xFFFFFFFF) // white
    val md_theme_light_secondaryContainer = Color(0xFFB3CCFF) // blue80
    val md_theme_light_onSecondaryContainer = Color(0xFF001C3B) // blue10
    val md_theme_light_tertiary = Color(0xFFB39DDB) // purple50
    val md_theme_light_onTertiary = Color(0xFFFFFFFF) // white
    val md_theme_light_tertiaryContainer = Color(0xFFEDE7F6) // purple90
    val md_theme_light_onTertiaryContainer = Color(0xFF6A1B9A) // purple40
    val md_theme_light_error = Color(0xFFD32F2F) // red30
    val md_theme_light_onError = Color(0xFFFFEBEE) // red99
    val md_theme_light_errorContainer = Color(0xFFFFCDD2) // red95
    val md_theme_light_onErrorContainer = Color(0xFFD32F2F) // red40
    val md_theme_light_background = Color(0xFFF5F9FF) // blue95
    val md_theme_light_surface = Color(0xFFF5F9FF) // blue95
    val md_theme_light_onSurface = Color(0xFF2C2C2E) // neutral20
    val md_theme_light_surfaceVariant = Color(0xFFD6E3FF) // blue90
    val md_theme_light_onSurfaceVariant = Color(0xFF757575) // neutral40
    val md_theme_light_outline = Color(0xFF9E9E9E) // neutral50
    val md_theme_light_outlineVariant = Color(0xFFBDBDBD) // neutral70
    val md_theme_light_surfaceContainer = Color(0xFFF5F9FF) // blue95
    val md_theme_light_surfaceContainerHigh = Color(0xFFB3CCFF) // blue80
    val md_theme_light_scrim = Color(0x52000000) // #000000 32%
    val md_theme_light_buttonHover = Color(0xFF1560D0) // blue30
    val md_theme_light_listBackground = Color(0xFFFAFAFA) // neutral99
    val md_theme_light_progressTrack = Color(0xFFE5E5E5) // neutral90
    val md_theme_light_progressTrack2 = Color(0xFFFFFFFF) // #FFFFFF
    val md_theme_light_navigationBackground = Color(0xFFFAFAFA) // neutral99
    val md_theme_light_opacity06 = Color(0x0F4A4459) // #4A4459 6%
    val md_theme_light_opacity08 = Color(0x144A4459) // #4A4459 8%
    val md_theme_light_opacity12 = Color(0x1F4A4459) // #4A4459 12%
}

// Dark Theme Colors
private object DarkThemeColors {
    val md_theme_dark_primary = Color(0xFF1560D0) // blue80
    val md_theme_dark_onPrimary = Color(0xFF33343A) // neutral20
    val md_theme_dark_primaryContainer = Color(0xFF003A75) // blue30
    val md_theme_dark_onPrimaryContainer = Color(0xFFD6E3FF) // blue90
    val md_theme_dark_secondary = Color(0xFF1560D0) // blue70
    val md_theme_dark_onSecondary = Color(0xFF003A75) // blue20
    val md_theme_dark_secondaryContainer = Color(0xFF1560D0) // blue40
    val md_theme_dark_onSecondaryContainer = Color(0xFFD6E3FF) // blue90
    val md_theme_dark_tertiary = Color(0xFF7C43BD) // purple80
    val md_theme_dark_onTertiary = Color(0xFF6A1B9A) // purple30
    val md_theme_dark_tertiaryContainer = Color(0xFF6A1B9A) // purple40
    val md_theme_dark_onTertiaryContainer = Color(0xFFFFFFFF) // white
    val md_theme_dark_error = Color(0xFFB71C1C) // red80
    val md_theme_dark_onError = Color(0xFFD32F2F) // red20
    val md_theme_dark_errorContainer = Color(0xFFD32F2F) // red30
    val md_theme_dark_onErrorContainer = Color(0xFFFFFFFF) // white
    val md_theme_dark_background = Color(0xFF1A1A1A) // neutral10
    val md_theme_dark_surface = Color(0xFF2C2C2E) // neutral20
    val md_theme_dark_onSurface = Color(0xFFFFFFFF) // neutral99
    val md_theme_dark_surfaceVariant = Color(0xFF2C2C2E) // neutral20
    val md_theme_dark_onSurfaceVariant = Color(0xFFE0E0E0) // neutral90
    val md_theme_dark_outline = Color(0xFFE0E0E0) // neutral90
    val md_theme_dark_outlineVariant = Color(0xFF616161) // neutral30
    val md_theme_dark_surfaceContainer = Color(0xFF2C2C2E) // neutral20
    val md_theme_dark_surfaceContainerHigh = Color(0xFFD6E3FF) // blue90
    val md_theme_dark_scrim = Color(0x52000000) // #000000 32%
    val md_theme_dark_buttonHover = Color(0xFF90B6F9) // blue90
    val md_theme_dark_listBackground = Color(0xFF424242) // neutral30
    val md_theme_dark_progressTrack = Color(0xFF616161) // neutral40
    val md_theme_dark_progressTrack2 = Color(0xFFFFFFFF) // #FFFFFF
    val md_theme_dark_navigationBackground = Color(0xFF1A1A1A) // neutral10
    val md_theme_dark_opacity06 = Color(0x0FE8DEF8) // #E8DEF8 6%
    val md_theme_dark_opacity08 = Color(0x14E8DEF8) // #E8DEF8 8%
    val md_theme_dark_opacity12 = Color(0x1FE8DEF8) // #E8DEF8 12%
}

val GeneratedLightColors = ExtendedColors(
    primary = LightThemeColors.md_theme_light_primary, // blue40
    onPrimary = LightThemeColors.md_theme_light_onPrimary, // white
    primaryContainer = LightThemeColors.md_theme_light_primaryContainer, // blue90
    onPrimaryContainer = LightThemeColors.md_theme_light_onPrimaryContainer, // blue10
    secondary = LightThemeColors.md_theme_light_secondary, // blue60
    onSecondary = LightThemeColors.md_theme_light_onSecondary, // white
    secondaryContainer = LightThemeColors.md_theme_light_secondaryContainer, // blue80
    onSecondaryContainer = LightThemeColors.md_theme_light_onSecondaryContainer, // blue10
    tertiary = LightThemeColors.md_theme_light_tertiary, // purple50
    onTertiary = LightThemeColors.md_theme_light_onTertiary, // white
    tertiaryContainer = LightThemeColors.md_theme_light_tertiaryContainer, // purple90
    onTertiaryContainer = LightThemeColors.md_theme_light_onTertiaryContainer, // purple40
    error = LightThemeColors.md_theme_light_error, // red30
    onError = LightThemeColors.md_theme_light_onError, // red99
    errorContainer = LightThemeColors.md_theme_light_errorContainer, // red95
    onErrorContainer = LightThemeColors.md_theme_light_onErrorContainer, // red40
    background = LightThemeColors.md_theme_light_background, // blue95
    surface = LightThemeColors.md_theme_light_surface, // blue95
    onSurface = LightThemeColors.md_theme_light_onSurface, // neutral20
    surfaceVariant = LightThemeColors.md_theme_light_surfaceVariant, // blue90
    onSurfaceVariant = LightThemeColors.md_theme_light_onSurfaceVariant, // neutral40
    outline = LightThemeColors.md_theme_light_outline, // neutral50
    outlineVariant = LightThemeColors.md_theme_light_outlineVariant, // neutral70
    surfaceContainer = LightThemeColors.md_theme_light_surfaceContainer, // blue95
    surfaceContainerHigh = LightThemeColors.md_theme_light_surfaceContainerHigh, // blue80
    scrim = LightThemeColors.md_theme_light_scrim, // #000000 32%
    buttonHover = LightThemeColors.md_theme_light_buttonHover,
    listBackground = LightThemeColors.md_theme_light_listBackground,
    progressTrack = LightThemeColors.md_theme_light_progressTrack,
    progressTrack2 = LightThemeColors.md_theme_light_progressTrack2,
    navigationBackground = LightThemeColors.md_theme_light_navigationBackground,
    opacity06 = LightThemeColors.md_theme_light_opacity06,
    opacity08 = LightThemeColors.md_theme_light_opacity08,
    opacity12 = LightThemeColors.md_theme_light_opacity12,
)

val GeneratedDarkColors = ExtendedColors(
    primary = DarkThemeColors.md_theme_dark_primary, // blue80
    onPrimary = DarkThemeColors.md_theme_dark_onPrimary, // neutral20
    primaryContainer = DarkThemeColors.md_theme_dark_primaryContainer, // blue30
    onPrimaryContainer = DarkThemeColors.md_theme_dark_onPrimaryContainer, // blue90
    secondary = DarkThemeColors.md_theme_dark_secondary, // blue70
    onSecondary = DarkThemeColors.md_theme_dark_onSecondary, // blue20
    secondaryContainer = DarkThemeColors.md_theme_dark_secondaryContainer, // blue40
    onSecondaryContainer = DarkThemeColors.md_theme_dark_onSecondaryContainer, // blue90
    tertiary = DarkThemeColors.md_theme_dark_tertiary, // purple80
    onTertiary = DarkThemeColors.md_theme_dark_onTertiary, // purple30
    tertiaryContainer = DarkThemeColors.md_theme_dark_tertiaryContainer, // purple40
    onTertiaryContainer = DarkThemeColors.md_theme_dark_onTertiaryContainer, // white
    error = DarkThemeColors.md_theme_dark_error, // red80
    onError = DarkThemeColors.md_theme_dark_onError, // red20
    errorContainer = DarkThemeColors.md_theme_dark_errorContainer, // red30
    onErrorContainer = DarkThemeColors.md_theme_dark_onErrorContainer, // white
    background = DarkThemeColors.md_theme_dark_background, // neutral10
    surface = DarkThemeColors.md_theme_dark_surface, // neutral20
    onSurface = DarkThemeColors.md_theme_dark_onSurface, // neutral99
    surfaceVariant = DarkThemeColors.md_theme_dark_surfaceVariant, // neutral20
    onSurfaceVariant = DarkThemeColors.md_theme_dark_onSurfaceVariant, // neutral90
    outline = DarkThemeColors.md_theme_dark_outline, // neutral90
    outlineVariant = DarkThemeColors.md_theme_dark_outlineVariant, // neutral30
    surfaceContainer = DarkThemeColors.md_theme_dark_surfaceContainer, // neutral20
    surfaceContainerHigh = DarkThemeColors.md_theme_dark_surfaceContainerHigh, // blue90
    scrim = DarkThemeColors.md_theme_dark_scrim, // #000000 32%
    buttonHover = DarkThemeColors.md_theme_dark_buttonHover,
    listBackground = DarkThemeColors.md_theme_dark_listBackground,
    progressTrack = DarkThemeColors.md_theme_dark_progressTrack,
    progressTrack2 = DarkThemeColors.md_theme_dark_progressTrack2,
    navigationBackground = DarkThemeColors.md_theme_dark_navigationBackground,
    opacity06 = DarkThemeColors.md_theme_dark_opacity06,
    opacity08 = DarkThemeColors.md_theme_dark_opacity08,
    opacity12 = DarkThemeColors.md_theme_dark_opacity12,
)

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        primary = Color.Unspecified,
        onPrimary = Color.Unspecified,
        primaryContainer = Color.Unspecified,
        onPrimaryContainer = Color.Unspecified,
        secondary = Color.Unspecified,
        onSecondary = Color.Unspecified,
        secondaryContainer = Color.Unspecified,
        onSecondaryContainer = Color.Unspecified,
        tertiary = Color.Unspecified,
        onTertiary = Color.Unspecified,
        tertiaryContainer = Color.Unspecified,
        onTertiaryContainer = Color.Unspecified,
        error = Color.Unspecified,
        onError = Color.Unspecified,
        errorContainer = Color.Unspecified,
        onErrorContainer = Color.Unspecified,
        background = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        surfaceVariant = Color.Unspecified,
        onSurfaceVariant = Color.Unspecified,
        outline = Color.Unspecified,
        outlineVariant = Color.Unspecified,
        surfaceContainer = Color.Unspecified,
        surfaceContainerHigh = Color.Unspecified,
        scrim = Color.Unspecified,
        buttonHover = Color.Unspecified,
        listBackground = Color.Unspecified,
        progressTrack = Color.Unspecified,
        progressTrack2 = Color.Unspecified,
        navigationBackground = Color.Unspecified,
        opacity06 = Color.Unspecified,
        opacity08 = Color.Unspecified,
        opacity12 = Color.Unspecified,
    )
}
