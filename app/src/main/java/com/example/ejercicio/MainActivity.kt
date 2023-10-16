package com.example.ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Pantalla"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Se llama después de onCreate. Pedro, muestro la pantalla. El usuario aún no puede interaccionar")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Pierdo el foco de la pantalla. Boton Home")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Vuelvo a estar visible, me muestro en logcat")
        Log.e(TAG,"Puede ser que algo no funcione al volver iniciar la app.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Dejo de estar visible para le usuario.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"La actividad muere.")

    }
}