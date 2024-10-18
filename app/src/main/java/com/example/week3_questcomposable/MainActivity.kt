package com.example.week3_questcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week3_questcomposable.ui.theme.Week3QuestComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week3QuestComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColumn(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun BasicColumn(modifier: Modifier = Modifier){
Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top,
    modifier = Modifier.fillMaxSize()
        .padding(top = 30.dp)
) {
    Text("Login",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold)

    Text("Ini Adalah Halaman Login")

    Image(painter = painterResource(id = R.drawable.logo),
    contentDescription = "",
        modifier = Modifier.size(300.dp)
        )

    Text("Nama")
    Text("Ersa Aditya")
    Text("20220140160")
    Image(painter = painterResource(id = R.drawable.potrait)
    , contentDescription = "")

}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week3QuestComposableTheme {
        BasicColumn()
    }
}