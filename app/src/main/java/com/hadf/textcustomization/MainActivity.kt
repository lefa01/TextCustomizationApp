package com.hadf.textcustomization

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hadf.textcustomization.ui.theme.TextCustomizationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextCustomizationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.primary) {
                    ComposeText2()
                }
            }
        }
    }
}

@Composable
fun ComposeText3() {
    Text(text = "Hello World".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
}

@Composable
fun ComposeText2() {
    Text(
        buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontSize = 30.sp,
                        fontWeight = FontWeight(500)
                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("C")
            }
        }, modifier = Modifier.width(200.dp)
    )
}

@Composable
fun ComposeText() {
    Text(
        text = stringResource(
            id = R.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp)
            .width(400.dp)
            .background(MaterialTheme.colorScheme.primary),
        fontSize = 30.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight(500),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextCustomizationTheme {
        Column (modifier = Modifier.fillMaxSize()) {
            ComposeText3()
        }
    }
}