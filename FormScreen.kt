package com.example.practica04

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica04.components.*

@Composable
fun FormScreen() {
    val context = LocalContext.current

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Práctica 4: Componentes Avanzados",
                fontSize = 22.sp,
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )

            HorizontalDivider(color = Color.DarkGray)
            Text(
                text = "1. Switch",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFD0BCFF)
            )
            CustomSwitch()

            HorizontalDivider(color = Color.DarkGray)
            Text(
                text = "2. RadioButton",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFD0BCFF)
            )
            CustomRadioButton()

            HorizontalDivider(color = Color.DarkGray)
            Text(
                text = "3. Checkbox",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFD0BCFF)
            )
            CustomCheckbox()

            HorizontalDivider(color = Color.DarkGray)
            Text(
                text = "4. Spinner (DropdownMenu)",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFD0BCFF)
            )
            CustomSpinner()

            HorizontalDivider(color = Color.DarkGray)
            Text(
                text = "5. DatePicker",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFFD0BCFF)
            )
            CustomDatePicker()
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    Toast.makeText(context, "Formulario completo", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6750A4))
            ) {
                Text(
                    text = "Probar Formulario",
                    color = Color.White
                )
            }
        }
    }
}
