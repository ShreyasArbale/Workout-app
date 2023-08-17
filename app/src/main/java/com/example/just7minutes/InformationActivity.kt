package com.example.just7minutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.just7minutes.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {

    private var binding: ActivityInformationBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInformationBinding.inflate(layoutInflater)

        setContentView(binding?.root)
        setSupportActionBar(binding?.toolbarInformationActivity)

        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Information"
        }

        binding?.toolbarInformationActivity?.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}