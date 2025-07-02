package com.example.figmamcp.ui.player.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmamcp.ui.theme.ExtendedTheme
import com.example.figmamcp.ui.theme.Spacing
import com.example.figmamcp.R

@Composable
fun PlayerAppBar(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
    onMenuClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .background(ExtendedTheme.colors.background)
            .padding(horizontal = Spacing.XS, vertical = Spacing.S)
            .height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onBackClick)
                .semantics { contentDescription = "戻る" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurface
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .size(40.dp)
                .clickable(onClick = onMenuClick)
                .semantics { contentDescription = "メニュー" },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.more_vert),
                contentDescription = null,
                tint = ExtendedTheme.colors.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerAppBarPreview() {
    MaterialTheme {
        PlayerAppBar()
    }
} 