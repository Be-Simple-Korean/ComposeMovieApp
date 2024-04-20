package com.example.composemovie.ui.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import java.util.Objects

val Red200 = Color(0xFFFFAAAA)
val Red300 = Color(0xFFCC5942)
val Red400 = Color(0xFFFF5258)
val Red700 = Color(0xFFEC0000)
val Red800 = Color(0xFFAF0000)
val Red900 = Color(0xFF531F1C)
val Purple200 = Color(0xFF908499)
val Purple400 = Color(0xFF6D59FF)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF635270)
val Purple900 = Color(0xFF200833)
val Green400 = Color(0xFF55D800)
val Blue400 = Color(0xFF395DE8)
val Grey200 = Color(0xFF908499)
val Grey900 = Color(0xFF151515)
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

@Composable
fun ColorScheme.isLight() = this.background.luminance() > 0.5

sealed class ColorSet {
    open lateinit var LightColors: MyColors
    open lateinit var DarkColors: MyColors

    object Red : ColorSet() {
        override var LightColors = MyColors(
            material = lightColorScheme(
                primary = Red700,
                secondary = Purple900,
                surface = White,
                onSurface = Black,
                background = White,
                onBackground = Black,
                error = Red400,
                onPrimary = White
            ),
            success = Green400,
            disabledSecondary = Grey200,
            textFiledBackground = Grey200,
            _primaryVariant = Red800,
            _secondaryVariant = Purple700,
        )

        override var DarkColors = MyColors(
            material = darkColorScheme(
                primary = Purple900,
                secondary = Purple900,
                surface = White,
                onSurface = Black,
                background = White,
                onBackground = Black,
                error = Red400,
                onPrimary = White
            ),
            _primaryVariant = Red800,
            _secondaryVariant = Purple700,
        )
    }

    object Blue : ColorSet() {
        override var LightColors = MyColors(
            material = lightColorScheme(
                primary = Blue400,
                secondary = Red900,

                surface = White,
                onSurface = Purple900,
                background = White,
                onBackground = Purple900,
                error = Red400,
                onPrimary = White
            ),
            _primaryVariant = Purple400,
            _secondaryVariant = Red700,
            success = Green400,
            disabledSecondary = Purple700,
            textFiledBackground = Grey200
        )

        override var DarkColors = MyColors(
            material = darkColorScheme(
                primary = Red900,
                secondary = Blue400,
                surface = White,
                onSurface = Purple900,
                background = White,
                onBackground = Purple900,
                error = Red400,
                onPrimary = White
            ),
            _primaryVariant = Purple400,
            _secondaryVariant = Purple900,
        )
    }
}