package com.example.figmamcp.ui.player.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmamcp.ui.theme.ExtendedTheme
import com.example.figmamcp.ui.theme.Spacing
import com.example.figmamcp.R

@Composable
fun PlayerOptionButtons(
    modifier: Modifier = Modifier,
    onRepeat: () -> Unit = {},
    onShuffle: () -> Unit = {},
    onFavorite: () -> Unit = {},
    onShare: () -> Unit = {}
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onRepeat)
                .semantics { contentDescription = "リピート" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.repeat),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurfaceVariant
            )
        }
        Spacer(modifier = Modifier.size(Spacing.M))
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onShuffle)
                .semantics { contentDescription = "シャッフル" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.shuffle),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurfaceVariant
            )
        }
        Spacer(modifier = Modifier.size(Spacing.M))
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onFavorite)
                .semantics { contentDescription = "お気に入り" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.favorite),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurfaceVariant
            )
        }
        Spacer(modifier = Modifier.size(Spacing.M))
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onShare)
                .semantics { contentDescription = "共有" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.share),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerOptionButtonsPreview() {
    MaterialTheme {
        PlayerOptionButtons()
    }
} 