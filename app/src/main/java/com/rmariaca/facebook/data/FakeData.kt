package com.rmariaca.facebook.data

import com.rmariaca.facebook.data.model.Post

// Datos de prueba para la UI (no son reales)
object FakeData {
    val posts = listOf(
        Post(1, "Laura Gómez", "2 h", "¡Primer día de clases del semestre! 📚", 24, 5),
        Post(2, "Carlos Pérez", "5 h", "Probando Jetpack Compose, cada vez me gusta más.", 58, 12),
        Post(3, "Ana Torres", "1 d", "Atardecer en Bucaramanga 🌅", 132, 20),
        Post(4, "Diego Rojas", "2 d", "¿Alguien para estudiar Kotlin esta semana?", 9, 3)
    )
}
