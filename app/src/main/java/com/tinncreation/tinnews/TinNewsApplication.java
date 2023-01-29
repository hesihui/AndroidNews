package com.tinncreation.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.tinncreation.tinnews.database.TinewsDatabase;

public class TinNewsApplication extends Application {
    private TinewsDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this, TinewsDatabase.class, "tinnews_db").build();
    }

    public TinewsDatabase getDatabase(){
        return database;
    }
}
