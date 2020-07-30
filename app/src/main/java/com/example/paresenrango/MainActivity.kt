package com.example.paresenrango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton=findViewById<Button>(R.id.btCalcular)
        boton.setOnClickListener(View.OnClickListener {
            calculado()//llamo la funcion al dar clic
        })
    }
    fun calculado(){//funcion
        val min = etnMin.text.toString().toInt()//declare val para que sea un poco mas estable
        val max = etnMax.text.toString().toInt()// y volvi entero en lugar de double
        var cont = ""// Genere esta variable para guardar cada dato que saliera del for

        for (number in min..max) {
/* la variable number sera la que haga el barrido, el for actuara comenzando en
el numero minimo tecleado hasta el numero maximo, sera un barrido rapido.
 */
            if (number % 2 == 0) {
                cont += number.toString()
/* mientras que con el if hago la operacion para encontrar los numeros pares
y una vez echa solo con mi variable contador voy sumando cada dato que va saliendo
 */
            }
        }
        tvResultado.text="son pares: "+'\n'+ cont//finalmente imprimo mi contador.
    }
}
