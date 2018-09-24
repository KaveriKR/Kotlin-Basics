package com.example.kaveri.firstkotlinlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.lable
import kotlinx.android.synthetic.main.activity_main3.random
import java.util.*

class Main3Activity : AppCompatActivity() {

    companion object {
        const  val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        showRandom()
    }


    // function show a random number with max bound as count got from the previos activity
    fun showRandom(){

        val count = intent.getIntExtra(TOTAL_COUNT,0)

        // showing a lable text
        lable.text = getString(R.string.random,count)

        // r is the variable of type random
        val r = Random()

        var randomInt = 0

        if(count>0){
            // return a random number upto count +1.
            randomInt = r.nextInt(count+1)
        }

        // setting the random interger to textview as string
        random.text = Integer.toString(randomInt)
    }
}
