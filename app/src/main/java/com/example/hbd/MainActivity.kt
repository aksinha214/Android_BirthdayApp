package com.example.hbd

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var open = findViewById<Button>(R.id.btnage)
        open.setOnClickListener(View.OnClickListener{
            var intent = Intent(this@MainActivity,Age::class.java)
            startActivity(intent)
        })

        var open1=findViewById<Button>(R.id.btnentry)
        open1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this@MainActivity,Entry::class.java)
            startActivity(intent)
        })

        var open2 = findViewById<Button>(R.id.btnexit)
        open2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this@MainActivity,Exit::class.java)
            startActivity(intent)
        })*/

        val btnAlert = findViewById<Button>(R.id.btnage)
        btnAlert.setOnClickListener{

            val artDialogBuilder = AlertDialog.Builder(this@MainActivity)

            artDialogBuilder.setMessage("Are you sure to see ?")
            artDialogBuilder.setTitle("Happy Birthday")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("Yes"){_,_->
                Toast.makeText(this@MainActivity,"I Love You",Toast.LENGTH_LONG).show()
                var intent = Intent(this@MainActivity,Age::class.java)
                startActivity(intent)
            }
            artDialogBuilder.setNegativeButton("No"){_,_->
                Toast.makeText(this@MainActivity,"Angry Girl",Toast.LENGTH_LONG).show()
                finish()
            }

            artDialogBuilder.setNeutralButton("Later"){_,_->
                Toast.makeText(this@MainActivity,"Happy Birthday Angry Girl",Toast.LENGTH_LONG).show()
            }

            val alertDialogBox= artDialogBuilder.create()
            alertDialogBox.show()

        }



        val btnAlert1 = findViewById<Button>(R.id.btnentry)
        btnAlert1.setOnClickListener{
            val artDialogBuilder = AlertDialog.Builder(this@MainActivity)

            artDialogBuilder.setMessage("Are you sure to see ?")
            artDialogBuilder.setTitle("Happy Birthday")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("Yes"){_,_->
                Toast.makeText(this@MainActivity,"I Love You",Toast.LENGTH_LONG).show()
                var intent = Intent(this@MainActivity,Entry::class.java)
                startActivity(intent)
            }
            artDialogBuilder.setNegativeButton("No"){_,_->
                Toast.makeText(this@MainActivity,"Angry Girl",Toast.LENGTH_LONG).show()
                finish()
            }

            artDialogBuilder.setNeutralButton("Later"){_,_->
                Toast.makeText(this@MainActivity,"Happy Birthday Angry Girl",Toast.LENGTH_LONG).show()
            }
            val alertDialogBox= artDialogBuilder.create()
            alertDialogBox.show()
        }

        val btnAlert2 = findViewById<Button>(R.id.btnexit)
        btnAlert2.setOnClickListener{
            val artDialogBuilder = AlertDialog.Builder(this@MainActivity)

            artDialogBuilder.setMessage("Are you sure to see ?")
            artDialogBuilder.setTitle("Happy Birthday")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("Yes"){_,_->
                Toast.makeText(this@MainActivity,"I Love You",Toast.LENGTH_LONG).show()
                var intent = Intent(this@MainActivity,Exit::class.java)
                startActivity(intent)
            }
            artDialogBuilder.setNegativeButton("No"){_,_->
                Toast.makeText(this@MainActivity,"Angry Girl",Toast.LENGTH_LONG).show()
                finish()
            }

            artDialogBuilder.setNeutralButton("Later"){_,_->
                Toast.makeText(this@MainActivity,"Happy Birthday Angry Girl",Toast.LENGTH_LONG).show()
            }
            val alertDialogBox= artDialogBuilder.create()
            alertDialogBox.show()
        }
    }
}