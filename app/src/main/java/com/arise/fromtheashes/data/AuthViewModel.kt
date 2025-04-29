package com.arise.fromtheashes.data


import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.arise.fromtheashes.model.User
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel (
    var navController: NavHostController,
    var context: Context) {
    var mAuth: FirebaseAuth=FirebaseAuth.getInstance()
    fun signup(fname: String,lname: String,email : String, pass: String,conpass: String) {
        if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || pass.isEmpty() || conpass.isEmpty()) {
            Toast.makeText(context, "Please fill in all details", Toast.LENGTH_LONG).show()
        } else {
            mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                  val userdata=User(fname,lname,email,pass,conpass,mAuth.currentUser!!.uid)
                  val regRef= FirebaseDatabase.getInstance().getReference().child("Users/+mAuth.currentUser!!.uid")
                  regRef.setValue(userdata)
                      .addOnCompleteListener {
                          if (it.isSuccessful) {
                              Toast.makeText(context, "Registration Successful"+"created an account", Toast.LENGTH_LONG)
                                  .show()
                          }else{
                              Toast.makeText(context, "Registration Failed", Toast.LENGTH_LONG).show()
                          }
                      }

                }
            }
        }

    }
}