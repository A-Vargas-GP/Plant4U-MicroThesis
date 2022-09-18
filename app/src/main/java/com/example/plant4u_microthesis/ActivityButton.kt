package com.example.plant4u_microthesis

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ActivityButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val languages = resources.getStringArray(R.array.perennial_plants)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, languages)
        val autocompleteTV = findViewById<AutoCompleteTextView>(R.id.txtComplete)
        autocompleteTV.setAdapter(arrayAdapter)

        val textView: TextView = findViewById<TextView>(R.id.textViewInfo)
        autocompleteTV.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val item = parent.getItemAtPosition(position).toString()
                if (item == "Asparagus")
                    textView.text = "Hello"
                else if (item == "Strawberries")
                    textView.text = "Change1"
                else if (item == "Horseradish")
                    textView.text = "Change2"
                else if (item == "Blueberries")
                    textView.text = "Change3"
                else
                    textView.text = ""
            }

        val buttonClick = findViewById<Button>(R.id.buttonBack)
        buttonClick.setOnClickListener {
            finish()
        }
    }
}