package com.example.figmamcp.ui.player.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmamcp.ui.theme.ExtendedTheme
import com.example.figmamcp.ui.theme.Spacing

@Composable
fun PlayerProgressBar(
    modifier: Modifier = Modifier,
    progress: Float = 0.0f, // 0.0 ~ 1.0
    elapsed: String = "0:00",
    total: String = "3:01"
) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .clip(MaterialTheme.shapes.small)
                .background(ExtendedTheme.colors.progressTrack)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(progress)
                    .height(4.dp)
                    .clip(MaterialTheme.shapes.small)
                    .background(ExtendedTheme.colors.primary)
            )
        }
        Spacer(modifier = Modifier.height(Spacing.XS))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = elapsed,
                style = MaterialTheme.typography.labelMedium,
                color = ExtendedTheme.colors.onSurfaceVariant
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = total,
                style = MaterialTheme.typography.labelMedium,
                color = ExtendedTheme.colors.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerProgressBarPreview() {
    MaterialTheme {
        PlayerProgressBar(progress = 0.2f)
    }
} 