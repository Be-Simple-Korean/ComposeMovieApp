package com.example.composemovie.ui.component.dialog

import androidx.compose.runtime.Composable
import com.example.composemovie.ui.models.dialog.DialogButton
import com.example.composemovie.ui.models.dialog.DialogContent
import com.example.composemovie.ui.models.dialog.DialogText
import com.example.composemovie.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    movieName: String,
    rating: Float,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your Score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = movieName,
                rating = rating
            )
        ),
        buttons = buttons
    )
}
