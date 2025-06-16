package com.example.figmamcp.ui.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.figmamcp.ui.theme.FigmamcpsampleandroidTheme

@Composable
fun MainComponent(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainComponentPreview() {
    FigmamcpsampleandroidTheme {
        MainComponent("Android")
    }
}