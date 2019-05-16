package cn.edu.fafu.se3166016049.homework2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Students_Info_DB extends SQLiteOpenHelper {

    //带全部参数的构造函数，此构造函数必不可少
    public Students_Info_DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table students_info(student_id varchar(20), student_name varchar(20), student_image int)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
