package com.example.just7minutes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.just7minutes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var countDownTimer: CountDownTimer? = null
    private var timerDuration: Long = 60000
    private var pauseOffset: Long = 0

    private var binding: ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        //val flStartButton: FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

        binding?.flBMI?.setOnClickListener {
            val intent = Intent(this,BMIActivity::class.java)
            startActivity(intent)
        }

        binding?.flInformation?.setOnClickListener {
            val intent = Intent(this,InformationActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}