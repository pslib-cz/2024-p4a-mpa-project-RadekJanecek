package com.example.shopping_list

import android.app.Application
import androidx.room.Room
import com.example.shopping_list.database.ItemDatabase

class MyApp: Application() {
    companion object {
        lateinit var database: ItemDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            ItemDatabase::class.java,
            "item_database"
        ).build()
    }
}