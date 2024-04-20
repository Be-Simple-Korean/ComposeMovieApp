package com.example.composemovie.ui.component.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovie.ui.theme.ComposeMovieTheme
import com.example.composemovie.ui.theme.Padding
import com.example.composemovie.ui.theme.h5
import java.util.Locale.Category

@Composable
fun Category() {
    Column {
        CategoryTitle("타이틀")
        LazyRow(contentPadding = PaddingValues(horizontal = Padding.large)) {
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }

        }
    }
}

@Composable
fun CategoryTitle(title: String) {
    Text(
        text = title,
        modifier = Modifier.padding(
            vertical = Padding.large,
            horizontal = Padding.extra
        ),
        style = MaterialTheme.typography.h5
    )
}

@Preview
@Composable
fun CategoryPreview() {
    ComposeMovieTheme {
        Surface {
            Category()
        }
    }

}

