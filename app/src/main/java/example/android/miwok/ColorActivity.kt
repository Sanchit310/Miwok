package example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        var words = arrayListOf<Word>()

        words.add(Word("Red","wetetti",R.drawable.color_red))
        words.add(Word("Green","chokokki",R.drawable.color_green))
        words.add(Word("Brown","takaakki",R.drawable.color_brown))
        words.add(Word("Grey","topoppi",R.drawable.color_gray))
        words.add(Word("Black","kululli",R.drawable.color_black))
        words.add(Word("White","kelelli",R.drawable.color_white))
        words.add(Word("Yellow","topiisa",R.drawable.color_dusty_yellow))
        words.add(Word("Musturd Yellow","chiwiita",R.drawable.color_mustard_yellow))
        val itemsAdaptor = WordAdapter(this,words)
        val listView = findViewById<ListView>(R.id.list)
        listView.setAdapter(itemsAdaptor)

    }
}
