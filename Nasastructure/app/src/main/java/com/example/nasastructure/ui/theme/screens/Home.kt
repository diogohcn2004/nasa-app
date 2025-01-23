package com.example.nasastructure.ui.theme.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nasastructure.R
import com.example.nasastructure.ui.theme.Blue30


@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    val backcolor = Blue30
    Box(modifier = Modifier.fillMaxSize().background(Blue30)){
        Image(painter = painterResource(R.drawable.galaxy_removebg),
            contentDescription = "Logo",
            modifier = modifier
                .size(200.dp)
                .align(Alignment.TopCenter))

        Column (modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center)
            .padding(top = 0.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Image(painter = painterResource(R.drawable.milky_way_illustration_1),
                contentDescription = "Testing",
                modifier = modifier.size(300.dp))
            Spacer(modifier = modifier.padding(4.dp))
            Text(text = "This is a test of a Name of the picture",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline,
                    color = Color.White

                )

            )
            Spacer(modifier = modifier.padding(4.dp))
            Row(modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.Center )  {
                Text(text = "This is a test of the autor ",
                    modifier = Modifier,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        color = Color.White

                    )
                )
                Spacer(modifier = Modifier.padding(12.dp))
                Text(text = "(2004) ",
                    modifier = Modifier,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,
                        color = Color.White

                    )
                )

            }


        }

    }

}
@Preview
@Composable
fun PreviewHome(){
    HomeScreen()
}