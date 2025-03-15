package com.example.project2

import android.graphics.Paint.Cap
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var stateList: ArrayList<Capital>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rawDataArray = resources.getStringArray(R.array.states)
        var stateName : String
        var capitalName : String
        var stringArray : List<String>
        var capital : Capital
        stateList = ArrayList<Capital>()

        for (state in rawDataArray){
            stringArray = state.split(",")
            stateName = stringArray[0]
            capitalName = stringArray[1]
            capital = Capital(stateName, capitalName)
            stateList.add(capital)
        }

        var capitalObject = stateList.get(Random.nextInt(stateList.size))
        var messageString = "${capitalObject.capitalCity} " +
                "is the capital of ${capitalObject.state}"
        binding.capitalInfo.setText(messageString)

        binding.nextButton.setOnClickListener {
            capitalObject = stateList.get(Random.nextInt(stateList.size))
            messageString = "${capitalObject.capitalCity} " +
                    "is the capital of ${capitalObject.state}"
            binding.capitalInfo.setText(messageString)
        }

    }
}