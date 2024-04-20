package com.example.composemovie.ui.component.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composemovie.R
import com.example.composemovie.ui.theme.ComposeMovieTheme
import com.example.composemovie.ui.theme.Padding
import com.example.composemovie.ui.theme.body2

private val CARD_WIDTH = 150.dp

@Composable
fun MovieItem() {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(Padding.large)

    ) {
        Poster(modifier = Modifier.width(CARD_WIDTH))
        Text(
            text = "The Lord the Ring 1",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = Padding.large)
        )
        Row(
            modifier = Modifier.padding(vertical = Padding.large),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .padding(Padding.small)
                    .size(Padding.large),
                imageVector = ImageVector.vectorResource(
                    id = R.drawable.ic_rating
                ),
                tint = Color.Black.copy(
                    alpha = 0.5f
                ),
                contentDescription = ""
            )
            Text(
                text = "5.0",
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
        }
    }
}

@Composable
fun Poster(modifier: Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        shape = RoundedCornerShape(Padding.none)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
        )
    }
}

@Preview
@Composable
fun MovieItemPreView() {
    ComposeMovieTheme {
        Surface {
            MovieItem()
        }
    }

}