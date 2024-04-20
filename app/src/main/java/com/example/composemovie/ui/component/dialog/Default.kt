package com.example.composemovie.ui.component.dialog

import androidx.compose.runtime.Composable
import com.example.composemovie.ui.models.dialog.DialogButton
import com.example.composemovie.ui.models.dialog.DialogContent
import com.example.composemovie.ui.models.dialog.DialogText
import com.example.composemovie.ui.models.dialog.DialogTitle

object DialogPopup

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Default(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(bodyText)
        ),
        buttons = buttons
    )
}
