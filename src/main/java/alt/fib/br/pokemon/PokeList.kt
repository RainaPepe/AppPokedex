package alt.fib.br.pokemon

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.app.Activity
import android.os.AsyncTask
import android.widget.ArrayAdapter
import android.widget.ListView
import java.io.Serializable

import kotlinx.android.synthetic.main.activity_poke_list.*

class PokeList : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_list)

        val pokelist = ArrayList<Pokemon>()
        val c1 = Pokemon(1L, "Collor")
        val c2 = Pokemon(2L, "Dilma")

        pokelist.add(c1)
        pokelist.add(c2)

        val adapter = PokemonAdapter(applicationContext, pokelist, assets)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)
    }
}


