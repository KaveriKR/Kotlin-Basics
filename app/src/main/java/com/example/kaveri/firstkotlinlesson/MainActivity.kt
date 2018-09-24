package com.example.kaveri.firstkotlinlesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


/* The Kotlin Android Extensions plugin allows us to avoid the well known findViewById() function.
 * What you need to do :-
 * Add the following  plugin in to your app- Module gradle at the top
 * apply plugin: 'kotlin-android-extensions'*/

/* when you  need  to import a single view from a layout file, you can import the following:
   kotlinx.android.synthetic.main.<layout filename>.<id of view>
   If you need all of the views from a layout file, you can use:
   kotlinx.android.synthetic.main.<layout filename>.*                                                 */



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

/*  Functions in Kotlin are declared using the fun keyword .
*   Function parameters are defined using Pascal notation, i.e. name: type.
*   Parameters are separated using commas.
*   Function parameters can have default values, which are used when a corresponding argument is omitted.
*   Such parameters with default values should precede in position to  the other parameter.
*
*   fun foo(bar: Int = 0, baz: Int) { ... }
*
    foo(baz = 1) // The default value bar = 0 is used
    to not use default values
    foo(bar = 1,baz = 1)

    Specifying the  return type for a function, eg with Int return type:;-
    fun sum(a: Int, b: Int): Int {
    return a + b
    }                                                                                                     */


//called on press on toast button
 fun toastMe( view : View){

      val myToast = Toast.makeText(this,"",Toast.LENGTH_SHORT).show()
 }

 /* using findViewById to bind the view
 fun countMe(view: View){

     val myCountTextView = findViewById(R.id.textView) as TextView
     var countString  =  myCountTextView.text.toString()

     var count: Int = Integer.parseInt(countString)
     count++

     myCountTextView.text = count.toString()


 }*/


    /* Variables in Kotlin
    *   Assign-once (read-only), that can not be changed , use val keyword
    *   Different ways of use
    *   val a: Int = 1  // immediate assignment
        val b = 2       // `Int` type is inferred
        val c: Int      // Type required when no initializer is provided
        c = 3           // deferred assignment

        Mutable variables:  that can be changed , use var keyword

        var x = 5 // `Int` type is inferred
        x += 1*/




    //called on press on count button
    fun countMe(view: View){

        // getting text from textview the kotlin way , while u can use getText() since Java is interop  with kotlin
        val countString = textView.text.toString()

        var count : Int = Integer.parseInt(countString)
        count++

        // setting text to textview  as string
        textView.text = count.toString()

    }


    //called on press on random button
    fun random(view: View){

        val randomIntent = Intent(this,Main3Activity::class.java)
        val countString = textView.text.toString()
        val count :Int = Integer.parseInt(countString)
        randomIntent.putExtra(Main3Activity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }


}
