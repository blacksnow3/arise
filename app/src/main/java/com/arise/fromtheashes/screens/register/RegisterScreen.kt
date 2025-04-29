package com.arise.fromtheashes.screens.register
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TextButton

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.arise.fromtheashes.R


@Composable
fun Register_Screen(navController: NavHostController,){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { Image(
        painterResource(id = R.drawable.logo),
        contentDescription = "logo",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
    )
        Text(
            text = "Register",
            color = Color.White,
            fontSize = 30.sp,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Create an account",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(20.dp))


        // Declare a variable to hold the username input
        var lastname = remember { mutableStateOf("") }
        var firstname = remember { mutableStateOf("") }
        var confirm_password = remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        // Create an OutlinedTextField for input
        OutlinedTextField(
            value = firstname.value,
            onValueChange = { firstname.value = it }, // Update the state when the user types
            label = { Text(text = "first name") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            textStyle = TextStyle(color= Color.White),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "first name",

                    )

            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = lastname.value,
            onValueChange = { lastname.value = it }, // Update the state when the user types
            label = { Text(text = "last name") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            textStyle = TextStyle(color= Color.White),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "first name",

                    )

            }
        )
        Spacer(modifier = Modifier.height(20.dp))

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
            value = password,
            onValueChange = { password = it }, // Update the state when the user types
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
                )
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = confirm_password.value,
            onValueChange = { confirm_password.value = it }, // Update the state when the user types
            label = { Text(text = "confirm password") },
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
                )
            }
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {}
        ) {
            Text("Register")}

        Spacer(modifier = Modifier.height(15.dp))
        TextButton(onClick = {navController.navigate("login")}) {
            Text("I already have an account?login here")

        }


    }
}
@Preview
@Composable
fun registerprev(){
    Register_Screen(rememberNavController())
}

