package com.example.ejerciciopractico.viewmodels

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejerciciopractico.navigation.Screen

@Composable
fun SettingsScreen(
    navController: NavController,
    viewModel: MainViewModel
) {
    // Estructura visual centralizada
    Column(
        modifier = Modifier
            .fillMaxSize() // Ocupar todo el alto disponible
            .padding(16.dp), // Margen interno general
        verticalArrangement = Arrangement.Center, // Centrar elementos verticalmente
        horizontalAlignment = Alignment.CenterHorizontally // Centrar elementos horizontalmente
    ) {
        // Título o texto principal
        Text(text = "Pantalla de Configuración (Settings)")

        Spacer(modifier = Modifier.height(24.dp)) // Espacio vertical

        // Botón para volver al Home
        Button(
            onClick = {
                viewModel.navigateTo(Screen.Home) // Emitir evento de navegación al ViewModel
            }
        ) {
            Text(text = "Volver al Inicio")
        }

        Spacer(modifier = Modifier.height(16.dp)) // Más espacio

        // Botón para ir al Perfil
        Button(
            onClick = {
                viewModel.navigateTo(Screen.Profile) // Emitir evento para ir a perfil
            }
        ) {
            Text(text = "Ir a Perfil")
        }
    }
}
