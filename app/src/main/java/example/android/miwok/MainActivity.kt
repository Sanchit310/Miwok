package example.android.miwok

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    public fun numberActivity(view: View){
        val actOne = Intent(this, NumbersActivity::class.java)
        startActivity(actOne)
    }
    public fun familyActivity(view: View){
        val actTwo = Intent(this, FamilyActivity::class.java)
        startActivity(actTwo)
    }
    public fun colorActivity(view: View){
        val actThree = Intent(this, ColorActivity::class.java)
        startActivity(actThree)
    }
    public fun phraseActivity(view: View){
        val actFour = Intent(this, PhrasesActivity::class.java)
        startActivity(actFour)
    }
}
