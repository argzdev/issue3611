package com.argz.issue3611

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test(){
        val db = Firebase.firestore
        val data: HashMap<String, Any> = HashMap()
        val myUri: Uri = Uri.parse("https://en.wikipedia.org/wiki/Odd-eyed_cat#/media/File:VAN_CAT.png")
        data["profileImage"] = myUri
        db.collection("users").document("user_1")[data] = SetOptions.merge()
    }
}