package com.example.composemovie.ui.component.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovie.ui.theme.ComposeMovieTheme
import com.example.composemovie.ui.theme.button
import com.example.composemovie.ui.theme.colors

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.secondary),
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colors.background,
            contentColor = MaterialTheme.colors.secondary,
            disabledContainerColor = MaterialTheme.colors.background,
            disabledContentColor = MaterialTheme.colors.disabledSecondary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = id?.let { stringResource(id = it) } ?: text,
                style = MaterialTheme.typography.button)
        }
    }
}

@Preview
@Composable
fun SecondaryButtonPreview() {
    ComposeMovieTheme {
        SecondaryButton(text = "TEST") {

        }
    }
}
