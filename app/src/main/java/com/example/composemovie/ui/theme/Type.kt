package com.example.composemovie.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.example.composemovie.R

// Set of Material typography styles to start with


private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ),
    headlineMedium =  TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ),
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ),
    bodyMedium =  TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    )
)

val Typography.h5Title: TextStyle
    @Composable get() = Typography.headlineSmall.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = Typography.labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = Typography.labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = Typography.labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )
val Typography.h1: TextStyle
    @Composable get() = Typography.displayLarge
val Typography.h2: TextStyle
    @Composable get() = Typography.displayMedium
val Typography.h3: TextStyle
    @Composable get() = Typography.displaySmall
val Typography.h4: TextStyle
    @Composable get() = Typography.headlineMedium
val Typography.h5: TextStyle
    @Composable get() = Typography.headlineSmall
val Typography.h6: TextStyle
    @Composable get() = Typography.titleLarge
val Typography.subTitle1: TextStyle
    @Composable get() = Typography.titleMedium
val Typography.subTitle2: TextStyle
    @Composable get() = Typography.titleSmall
val Typography.body1: TextStyle
    @Composable get() = Typography.bodyLarge
val Typography.body2: TextStyle
    @Composable get() = Typography.bodyMedium
val Typography.button: TextStyle
    @Composable get() = Typography.labelLarge