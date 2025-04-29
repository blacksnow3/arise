package com.arise.fromtheashes.screens.home
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.arise.fromtheashes.navigation.ROUTE_LOGIN
import com.arise.fromtheashes.navigation.ROUTE_REGISTER


@Composable
fun Home_Screen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

            .background(Color.Black)
    ){
     Text(
         text="Welcome",
         fontSize= 30.sp,
         fontFamily = FontFamily.Serif,
         color = Color.Red,

     )
        Spacer(modifier= Modifier.height(30.dp))
        Text(
            text="join our community",
            fontSize= 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,

            )
        Spacer(modifier= Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)}, modifier = Modifier.width(100.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text("Login",
                color = Color.White,
                fontSize = 20.sp)
        }
        Spacer(modifier= Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)}, modifier = Modifier.width(150.dp),
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text("Register",
                color = Color.White,
                fontSize = 20.sp)
        }


    }
}
@Preview
@Composable
fun homescreenprev(){
    Home_Screen(rememberNavController())
}


