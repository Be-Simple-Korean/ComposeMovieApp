package com.example.composemovie.ui.component.dialog.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composemovie.ui.component.buttons.PrimaryButton
import com.example.composemovie.ui.component.buttons.SecondaryButton
import com.example.composemovie.ui.component.buttons.UnderlinedTextButton
import com.example.composemovie.ui.models.dialog.DialogButton
import com.example.composemovie.ui.theme.Padding

@Composable
fun DialogButtonsColumn(buttons: List<DialogButton>?) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons?.forEachIndexed { index, dialogButton ->
            if (index > 0) {
                Spacer(modifier = Modifier.height(Padding.large))
            }
            when (dialogButton) {
                is DialogButton.Primary -> {
                    PrimaryButton(
                        text = dialogButton.title,
                        leadingIconData = dialogButton.leadingIconData
                    ) {
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.Secondary -> {
                    SecondaryButton(text = dialogButton.title) {
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.SecondaryBorderless -> {}
                is DialogButton.UnderlinedText -> {
                    UnderlinedTextButton(text = dialogButton.title) {
                        dialogButton.action?.invoke()
                    }
                }
            }
        }
    }
}
