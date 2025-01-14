package com.example.downloadfiles

import android.annotation.SuppressLint
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class DownloadCompletedReceiver: BroadcastReceiver() {

    private  lateinit var downloadManger: DownloadManager

    @SuppressLint("SuspiciousIndentation")
    override fun onReceive(context: Context?, intent: Intent?) {



        if(intent?.action == "android.intent.action.DOWNLOAD_COMPLETE"){
          val id = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
            if(id != -1L){
                println("Download with ID $id finished")
            }
        }
    }

}