package com.example.composemovie.ui.component.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovie.ui.theme.ComposeMovieTheme
import com.example.composemovie.ui.theme.Padding
import com.example.composemovie.ui.theme.button
import com.example.composemovie.ui.theme.colors
import kr.co.fastcampus.part4plus.movieapp.ui.models.buttons.LeadingIconData

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    leadingIconData: LeadingIconData? = null,
    onClick: () -> Unit,
    ) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary,
            disabledContainerColor = MaterialTheme.colors.background,
            disabledContentColor = MaterialTheme.colors.disabledSecondary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIconData?.let {
                Icon(
                    painter = painterResource(id = leadingIconData.iconDrawable),
                    contentDescription = stringResource(
                        id = leadingIconData.iconContentDescription ?: 0
                    ),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(Padding.small))
            }
            Text(text = id?.let { stringResource(id = it) } ?: text,
                style = MaterialTheme.typography.button)
        }
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    ComposeMovieTheme {
        PrimaryButton(text = "TEST") {}
    }
}
