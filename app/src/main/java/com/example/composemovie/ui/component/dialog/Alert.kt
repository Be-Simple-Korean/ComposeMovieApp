package com.example.composemovie.ui.component.dialog

import androidx.compose.runtime.Composable
import com.example.composemovie.ui.models.dialog.DialogButton
import com.example.composemovie.ui.models.dialog.DialogContent
import com.example.composemovie.ui.models.dialog.DialogText
import com.example.composemovie.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            title
        ),
        dialogContent = DialogContent.Large(
            DialogText.Default(
                bodyText
            )
        ),
        buttons = buttons
    )
}
