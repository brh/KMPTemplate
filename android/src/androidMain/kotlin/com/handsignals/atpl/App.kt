package com.handsignals.atpl

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.os.Build
import com.handsignals.di.KMPModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class App : Application() {

    @SuppressLint("ServiceCast")
    override fun onCreate() {
        super.onCreate()

        appContext = this
        startKoin {
            modules(KMPModule().module)
            androidContext(this@App)
            androidLogger()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationChannel()
        }
    }

    @SuppressLint("NewApi")
    private fun createNotificationChannel() {
//        // Create the NotificationChannel.
//        val name = getString(R.string.notification_channel_name)
//        val descriptionText = getString(R.string.notification_channel_desc)
//        val mChannel = NotificationChannel(
//            getString(R.string.notification_channel),
//            name,
//            NotificationManager.IMPORTANCE_DEFAULT
//        )
//        mChannel.description = descriptionText
//        // Register the channel with the system. You can't change the importance
//        // or other notification behaviors after this.
//        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//        notificationManager.createNotificationChannel(mChannel)
    }
}

lateinit var appContext: Context
    private set