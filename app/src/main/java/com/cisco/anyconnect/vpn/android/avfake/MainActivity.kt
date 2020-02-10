package com.cisco.anyconnect.vpn.android.avfake

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action = intent.action
        if (Intent.ACTION_VIEW == action) {
            val uri = intent.data
            if (uri != null) {
                val name = uri.getQueryParameter("name")
                val host = uri.getQueryParameter("host")
                val prefill_username = uri.getQueryParameter("prefill_username")
                val prefill_password = uri.getQueryParameter("prefill_password")

                findViewById<EditText>(R.id.vpn_name).setText(name)
                findViewById<EditText>(R.id.vpn_host).setText(host)
                findViewById<EditText>(R.id.vpn_username).setText(prefill_username)
                findViewById<EditText>(R.id.vpn_password).setText(prefill_password)
            }
        }
    }
}
