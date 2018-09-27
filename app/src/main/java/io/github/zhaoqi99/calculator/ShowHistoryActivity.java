package io.github.zhaoqi99.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowHistoryActivity extends AppCompatActivity {

    private ListView listViewhis;
    ArrayList<HashMap<String,Object>> dataHis;
    HistoryOperator historyOperator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_history);
        listViewhis=(ListView)findViewById(R.id.ListviewHis);
        historyOperator=new HistoryOperator(this);
        setListView();
    }

    public void setListView(){
        dataHis=new ArrayList<HashMap<String, Object>>();
        ArrayList<HistoryItem> arrayList=historyOperator.QueryAll();
        for(int i=0;i<arrayList.size();i++){
            HistoryItem historyItem=(HistoryItem)arrayList.get(i);
            HashMap<String,Object> item=new HashMap<String,Object>();
            item.put("index",historyItem.getIndex());
            item.put("formula",historyItem.getFormula());
            item.put("result",historyItem.getResult());
            dataHis.add(item);
        }

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,dataHis,
                R.layout.history_layout,new String[]{"index","formula","result"},
                new int[]{R.id.TextViewHisItemIndex,R.id.TextVIewHisItemFormula,
                R.id.TextViewHisItemResult});
        listViewhis.setAdapter(simpleAdapter);
    }

}
