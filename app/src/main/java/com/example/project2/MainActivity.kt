package com.example.project2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var stateList = ArrayList<Capital>()

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
        var stringArray : List<String>
        var capital : Capital

        for (state in rawDataArray){
            stringArray = state.split(",")
            stateName = stringArray[0]
            capital = Capital(stateName)
            capital.capitalCity = stringArray[1]
            stateList.add(capital)
        }

        showStateInfo()

        binding.nextButton.setOnClickListener {
            showStateInfo()
        }
    }

    private fun showStateInfo(){
        val capitalObject = stateList[Random.nextInt(stateList.size)]
        val messageString = "${capitalObject.capitalCity} " +
                "is the capital of ${capitalObject.state}"
        binding.capitalInfo.text = messageString
    }
}
