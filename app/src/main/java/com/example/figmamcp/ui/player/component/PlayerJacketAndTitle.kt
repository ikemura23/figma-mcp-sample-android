package com.example.figmamcp.ui.player.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmamcp.ui.theme.ExtendedTheme
import com.example.figmamcp.ui.theme.Spacing
import com.example.figmamcp.R

@Composable
fun PlayerJacketAndTitle(
    modifier: Modifier = Modifier,
    title: String = "Here Comes the Bone",
    artist: String = "The Beagles"
) {
    Column(
        modifier = modifier.padding(top = Spacing.L),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "ジャケット画像"
            )
        }
        Spacer(modifier = Modifier.height(Spacing.L))
        Text(
            text = title,
            style = MaterialTheme.typography.headlineLarge,
            color = ExtendedTheme.colors.onSurface,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(Spacing.XS))
        Text(
            text = artist,
            style = MaterialTheme.typography.titleMedium,
            color = ExtendedTheme.colors.onSurfaceVariant,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerJacketAndTitlePreview() {
    MaterialTheme {
        PlayerJacketAndTitle()
    }
} 