package com.arise.fromtheashes.screens.login


import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.arise.fromtheashes.R
import com.arise.fromtheashes.data.AuthViewModel
import com.arise.fromtheashes.navigation.ROUTE_ADD_PRODUCT
import com.arise.fromtheashes.navigation.ROUTE_ADD_STUDENT
import com.arise.fromtheashes.navigation.ROUTE_DASHBOARD
import com.arise.fromtheashes.navigation.ROUTE_VIEW_PRODUCT


@Composable
fun Login_Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { Image(
        painterResource(id = R.drawable.pr),
        contentDescription = "logo",
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
    )
        Text(
            text = "Login",
            color = Color.White,
            fontSize = 40.sp,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "you already have an account",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))


        // Declare a variable to hold the username input
        var context = LocalContext.current
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }
        // Create an OutlinedTextField for input
        OutlinedTextField(
            value = email,
            onValueChange = { email = it }, // Update the state when the user types
            label = { Text(text = "Email Address") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            textStyle = TextStyle(color= Color.White),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "email icon",

                    )

            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = pass,
            onValueChange = { pass = it }, // Update the state when the user types
            label = { Text(text = "password") },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            textStyle = TextStyle(color= Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "password icon",
                )}
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
         val mylogin= AuthViewModel(navController, context)
            mylogin.login(email.text.trim(),pass.text.trim())
            navController.navigate(ROUTE_DASHBOARD)
            }
        ) {
            Text("Login")}

        Spacer(modifier = Modifier.height(80.dp))
        TextButton(onClick = {navController.navigate("register")}) {
            Text("Don't have an account?Register here")
        }


    }
}



@Preview
@Composable
fun loginprev(){
    Login_Screen(rememberNavController())
}
