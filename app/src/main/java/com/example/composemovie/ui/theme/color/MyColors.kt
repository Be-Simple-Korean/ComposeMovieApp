package com.example.composemovie.ui.theme.color

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

data class MyColors(
    val material: ColorScheme,
    val tertiary: Color = material.primary,
    val onPrimaryAlt: Color = material.onPrimary,
    val success: Color = Color.Green,
    val checked: Color = Color.White,
    val unchecked: Color = Color.White,
    val checkmark: Color = material.primary,
    val disabledSecondary: Color = material.secondary.copy(alpha = 0.5f),
    val textFiledBackground: Color = Color.LightGray,
    val textFiledBackgroundVariant: Color = Color.DarkGray,
    val launcherScreenBackground: Color = material.primary,
    val progressItemColor: Color = Color.Black,
    val _primaryVariant: Color = Color.Black,
    val _secondaryVariant: Color = Color.Black,
) {
    val primary: Color get() = material.primary
    val primaryVariant: Color get() = _primaryVariant
    val secondary: Color get() = material.secondary
    val secondaryVariant: Color get() = _secondaryVariant
    val background: Color get() = material.background
    val surface: Color get() = material.surface
    val error: Color get() = material.error
    val onPrimary: Color get() = material.onPrimary
    val onSecondary: Color get() = material.onSecondary
    val onBackground: Color get() = material.onBackground
    val onSurface: Color get() = material.onSurface
    val onError: Color get() = material.onError
    val isLight: Boolean @Composable
    get() = material.isLight()

}
