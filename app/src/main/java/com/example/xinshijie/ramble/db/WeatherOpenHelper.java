package com.example.xinshijie.ramble.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ChenXin on 2015/11/6.
 */
public class WeatherOpenHelper extends SQLiteOpenHelper {
    public WeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * Province表 建表语句
     */
    public static final String CREAT_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "province_name text, "
            + "province_code text)";

    /**
     * City表 建表语句
     */
    public static final String CREAT_CITY = "create table City ("
            + "id integer primary key autoincrement, "
            + "city_name text, "
            + "city_code text, "
            + "province_id integer)";

    /**
     * County表 建表语句
     */
    public static final String CREAT_COUNTY = "create table County ("
            + "id integer primary key autoincrement, "
            + "county_name text, "
            + "county_code text, "
            + "city_id integer)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAT_PROVINCE);     //创建Province表
        db.execSQL(CREAT_CITY);         //创建City表
        db.execSQL(CREAT_COUNTY);       //创建County表
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
