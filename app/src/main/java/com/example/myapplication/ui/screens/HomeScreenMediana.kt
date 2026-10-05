package com.example.myapplication.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenMediana(){
    Scaffold(
        topBar= {
            TopAppBar(title = { Text(text= "Mi app Kotlin") })
        }
    ){ innerPadding ->
        Row(
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(24.dp),
            horizontalArrangement= Arrangement.SpaceEvenly,
            verticalAlignment= Alignment.CenterVertically
        ){
            Column(
                verticalArrangement= Arrangement.spacedBy(20.dp)
            ){
                Text(
                    text= "Bienvendo!",
                    color= MaterialTheme.colorScheme.primary,
                    style= MaterialTheme.typography.displaySmall
                )
                Button(onClick= {}){
                    Text("Presioname")
                }
            }
            Image(
                painter= painterResource(id= R.drawable.logo),
                contentDescription= "LogoApp",
                modifier= Modifier.size(250.dp),
                contentScale= ContentScale.Fit
            )
        }
    }
}

