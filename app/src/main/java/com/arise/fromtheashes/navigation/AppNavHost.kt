package com.arise.fromtheashes.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.arise.fromtheashes.navigation.ROUTE_HOME
import com.arise.fromtheashes.navigation.ROUTE_LOGIN
import com.arise.fromtheashes.navigation.ROUTE_REGISTER
import com.arise.fromtheashes.screens.home.Home_Screen
import com.arise.fromtheashes.screens.login.Login_Screen
import com.arise.fromtheashes.screens.register.Register_Screen
import com.arise.fromtheashes.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
navController: NavHostController= rememberNavController(),
  starDestination: String= ROUTE_Splash
) {
    NavHost(
        modifier = modifier, startDestination = starDestination,
        navController = navController
    ) {
        composable(ROUTE_HOME) {
            Home_Screen(navController)
        }
        composable(ROUTE_LOGIN) {
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER) {
            Register_Screen(navController)

        }
        composable ( ROUTE_Splash )
        {
            SplashScreen(navController)
        }

    }
}




