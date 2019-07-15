package example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.ListView

class NumbersActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        var words = arrayListOf<Word>()

        words.add(Word("One","lutti",R.drawable.number_one))
        words.add(Word("Two","ottiko",R.drawable.number_two))
        words.add(Word("Three","tolookoso",R.drawable.number_three))
        words.add(Word("Four","oyyisa",R.drawable.number_four))
        words.add(Word("Five","massokka",R.drawable.number_five))
        words.add(Word("Six","temmokka",R.drawable.number_six))
        words.add(Word("Seven","kenekaku",R.drawable.number_seven))
        words.add(Word("Eight","kawinta",R.drawable.number_eight))
        words.add(Word("Nine","wo e",R.drawable.number_nine))
        words.add(Word("Ten","na'accha",R.drawable.number_ten))
        val itemsAdaptor = WordAdapter(this,words)
        val listView = findViewById<ListView>(R.id.list)
        listView.setAdapter(itemsAdaptor)


    }

}
