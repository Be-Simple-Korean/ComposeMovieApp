package com.example.composemovie.ui.component.dialog.components.title

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.example.composemovie.ui.models.dialog.DialogTitle
import com.example.composemovie.ui.theme.Padding
import com.example.composemovie.ui.theme.colors
import com.example.composemovie.ui.theme.h3
import com.example.composemovie.ui.theme.h5
import com.example.composemovie.ui.theme.h5Title

@Composable
fun DialogTitleWrapper(dialogTitle: DialogTitle) {
    when (dialogTitle) {
        is DialogTitle.Default -> {
            DefaultDialogTitle(dialogTitle)
        }

        is DialogTitle.Header -> {
            HeaderDialogTitle(dialogTitle)
        }

        is DialogTitle.Large -> {
            LargeDialogTitle(dialogTitle)
        }
    }
}



@Composable
fun HeaderDialogTitle(title: DialogTitle.Header) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.primary)
            .padding(Padding.large),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3.copy(
                color = MaterialTheme.colors.onPrimary
            )
        )
    }
}

@Composable
fun LargeDialogTitle(title: DialogTitle.Large) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .padding(all = Padding.xlarge)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5Title,
            color = MaterialTheme.colors.secondary
        )
    }
}

@Composable
fun DefaultDialogTitle(title: DialogTitle.Default) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(
                horizontal = Padding.large,
                vertical = Padding.extra
            ),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5.copy(
                color = MaterialTheme.colorScheme.secondary
            )
        )
    }
}
