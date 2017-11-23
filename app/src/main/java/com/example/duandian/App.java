package com.example.duandian;

import android.app.Application;

import com.bwie.test.greendaodemo.gen.DaoMaster;
import com.bwie.test.greendaodemo.gen.DaoSession;
import com.bwie.test.greendaodemo.gen.UserDao;

/**
 * Created by 姜天赐 on 2017/11/23.
 */

public class App extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}