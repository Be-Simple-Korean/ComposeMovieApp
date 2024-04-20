package com.example.composemovie.ui.component.dialog.components.content

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.em
import com.example.composemovie.ui.models.dialog.DialogContent
import com.example.composemovie.ui.models.dialog.DialogText
import com.example.composemovie.ui.theme.Padding
import com.example.composemovie.ui.theme.body1
import com.example.composemovie.ui.theme.body2
import com.example.composemovie.ui.theme.subTitle1

data class DialogContentStyle(
    val textStyle: @Composable () -> TextStyle = { MaterialTheme.typography.body1 },
    val contentTopPadding: Dp = Padding.xlarge,
    val contentBottomPadding: Dp = Padding.extra
)

val LocalDialogContentStyle = compositionLocalOf { DialogContentStyle() }

@Composable
fun ColumnScope.DialogContentWrapper(content: DialogContent) {
    when (content) {
        is DialogContent.Default -> {
            CompositionLocalProvider(
                LocalDialogContentStyle provides DialogContentStyle(
                    textStyle = {
                        MaterialTheme.typography.body2.copy(
                            lineHeight = 1.6.em
                        )
                    },
                    contentTopPadding = Padding.small,
                    contentBottomPadding = Padding.extra
                )
            ) {
                NormalTextContent(content.dialogText)
            }
        }

        is DialogContent.Large -> {
            CompositionLocalProvider(
                LocalDialogContentStyle provides DialogContentStyle(
                    textStyle = {
                        MaterialTheme.typography.subTitle1.copy(
                            lineHeight = 1.6.em
                        )
                    },
                    contentTopPadding = Padding.extra,
                    contentBottomPadding = Padding.extra
                )
            ) {
                NormalTextContent(content.dialogText)
            }
        }

        is DialogContent.Rating -> {
            RatingContent(content.dialogText)
        }
    }
}



@Composable
fun ColumnScope.NormalTextContent(dialogText: DialogText) {
    Text(
        text = getStringFromDialogText(dialogText = dialogText),
        modifier = Modifier
            .padding(
                top = LocalDialogContentStyle.current.contentTopPadding,
                bottom = LocalDialogContentStyle.current.contentBottomPadding,
            )
            .align(Alignment.CenterHorizontally),
        textAlign = TextAlign.Center,
        style = LocalDialogContentStyle.current.textStyle.invoke()
    )
}


@Composable
fun getStringFromDialogText(dialogText: DialogText): String =
    dialogText.id?.let {
        stringResource(id = it)
    } ?: dialogText.text ?: ""
