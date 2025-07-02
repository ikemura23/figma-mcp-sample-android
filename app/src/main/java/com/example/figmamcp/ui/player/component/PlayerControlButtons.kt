package com.example.figmamcp.ui.player.component

import androidx.compose.foundation.background
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
fun PlayerControlButtons(
    modifier: Modifier = Modifier,
    onPrevious: () -> Unit = {},
    onPlay: () -> Unit = {},
    onNext: () -> Unit = {},
    isPlaying: Boolean = false
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(56.dp)
                .clickable(onClick = onPrevious)
                .semantics { contentDescription = "前の曲" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.skip_previous_filled),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurface
            )
        }
        Spacer(modifier = Modifier.size(Spacing.L))
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(
                    color = ExtendedTheme.colors.primary,
                    shape = MaterialTheme.shapes.large
                )
                .clickable(onClick = onPlay)
                .semantics { contentDescription = if (isPlaying) "一時停止" else "再生" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.play_arrow_filled),
                contentDescription = null,
                tint = ExtendedTheme.colors.onPrimary,
                modifier = Modifier.size(48.dp)
            )
        }
        Spacer(modifier = Modifier.size(Spacing.L))
        Box(
            modifier = Modifier
                .size(56.dp)
                .clickable(onClick = onNext)
                .semantics { contentDescription = "次の曲" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.skip_next_filled),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerControlButtonsPreview() {
    MaterialTheme {
        PlayerControlButtons()
    }
} 