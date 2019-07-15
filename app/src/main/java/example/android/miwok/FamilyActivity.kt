package example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FamilyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
        var words = arrayListOf<Word>()

        words.add(Word("Father","әpә",R.drawable.family_father))
        words.add(Word("Mother","әṭa",R.drawable.family_mother))
        words.add(Word("Son","angsi",R.drawable.family_son))
        words.add(Word("Daughter","tune",R.drawable.family_daughter))
        words.add(Word("Older Brother","taachi",R.drawable.family_older_brother))
        words.add(Word("Younger Brother","chalitti",R.drawable.family_younger_brother))
        words.add(Word("Older Sister","teṭe",R.drawable.family_older_sister))
        words.add(Word("Younger Sister","kolliti",R.drawable.family_younger_sister))
        words.add(Word("Grand Mother","ama",R.drawable.family_grandmother))
        words.add(Word("Grand Father","paapa",R.drawable.family_grandfather))
        val itemsAdaptor = WordAdapter(this,words)
        val listView = findViewById<ListView>(R.id.list)
        listView.setAdapter(itemsAdaptor)

    }
}
