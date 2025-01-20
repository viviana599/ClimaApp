package com.example.miapp

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.miapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(), FragmentComunicator {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun magnagelouder(isVisible: Boolean) {
        if (isVisible){
        binding.loaderView.visibility = View.VISIBLE
        }else{
        binding.loaderView.visibility = View.GONE
        }
    //binding.loaderView.vissibility
    }
}
