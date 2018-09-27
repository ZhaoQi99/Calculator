package io.github.zhaoqi99.calculator;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class HistoryOperator {
    private SQLiteDatabase db;
    private SqliteHelper dbhelper;

    public HistoryOperator(Context context) {
        this.dbhelper = new SqliteHelper(context,"history",null,1);
        this.db= dbhelper.getWritableDatabase();
    }

    public void Add(HistoryItem item){
        String sql=String.format("insert into history(formula,result) values('%1$s','%2$s')",
                item.getFormula(),item.getResult());
        db.execSQL(sql);
    }

    public void Clear(){
        db.execSQL("drop table history");
        db.execSQL(SqliteHelper.CREATE_TABLE);
    }

    public ArrayList<HistoryItem> QueryAll(){
        ArrayList<HistoryItem> arrayList=new ArrayList<HistoryItem>();
        Cursor c=db.rawQuery("select * from history",null);
        while(c.moveToNext()){
            HistoryItem item=new HistoryItem();
            item.setIndex(c.getInt(0));
            item.setFormula(c.getString(1));
            item.setResult(c.getString(2));
            arrayList.add(item);
        }
        c.close();
        return  arrayList;
    }
}
