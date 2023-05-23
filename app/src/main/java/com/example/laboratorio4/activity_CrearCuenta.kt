package com.example.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.laboratorio4.databinding.ActivityCrearCuentaBinding
import com.google.firebase.auth.FirebaseAuth

class activity_CrearCuenta : AppCompatActivity() {
    private  lateinit var binding: ActivityCrearCuentaBinding

    //Validar que los campos no sean nulos
    fun valida(): Boolean {
        try {
            var validaok: Boolean = false
//-- El email es un valor requerido
            if (binding.tvEmail.text?.length?.equals(0)!!) {
                binding.tvEmail.requestFocus()
                binding.tvEmail.setError("Email es un valor requerido")
                return validaok
            }
//-- La contraseña es un valor requerido
            if (binding.tvPass.text?.length?.equals(0)!!) {
                binding.tvPass.requestFocus()
                binding.tvPass.setError("Debe ingresar una contraseña")
                    return validaok
            }
//La confirmación de contraseña es un valor requerido
            if (binding.tvConfirmPass.text?.length?.equals(0)!!) {
                binding.tvConfirmPass.requestFocus()
                binding.tvConfirmPass.setError("Debe ingresar la confirmación de contraseña")
                    return validaok
            }
//La contraseña debe ser igual a la confirmación de la contraseña
            val strpassword: String = if (binding.tvPass.text !=
                null) binding.tvPass.text.toString() else ""
            val strpasswordconfirmar:String = if (binding.tvConfirmPass.text != null) binding.tvConfirmPass.text.toString() else ""
            if (strpassword.equals(strpasswordconfirmar) == false)
            {
                binding.tvPass.requestFocus()
                binding.tvPass.setError("El Password y la confirmación deben coincidir")
                    return validaok
            }
            validaok = true
            return validaok
        } catch (e: Exception) {
            e.message?.let { Log.e("Error en valida", it) };
            return false;
        }
    }

    //-- Metodo agregar Usuario
    fun addCuentaUsuario()
    {
        val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
        firebaseAuth.createUserWithEmailAndPassword(binding.tvEmail.text
            .toString(), binding.tvPass.text.toString())
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "El usuario ha sido creado",
                        Toast.LENGTH_SHORT).show();
                    finish()
                } else {
                    Toast.makeText(this, "El usuario no ha sido creado",
                        Toast.LENGTH_SHORT).show();
                }
            }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCrearCuentaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //-------
        val toolbar:Toolbar= binding.tbCrearCuenta
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Create Account")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.createBtn.setOnClickListener {
            if (valida().equals(true)) {
                addCuentaUsuario()

            }
        }


    }
}