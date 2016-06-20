package rriskhh.start.medic;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymptomChecker extends Fragment {

    public static ArrayList<String> arrayList;
    ExapandableListAdapter adapter;
    ExpandableListView listView;
    List<String> header;
    HashMap<String,List<String>> item;
    DataSource ds;
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstance){
        View v =  layoutInflater.inflate(R.layout.activity_symptom_checker,container,false);
        arrayList  = new ArrayList<String>();
        ds = new DataSource();
        ds.setSymptom();
        listView = (ExpandableListView) v.findViewById(R.id.expandableListView);
        prepareList();
        adapter = new ExapandableListAdapter(getContext(),header,item);
        listView.setAdapter(adapter);
        Button but = (Button) v.findViewById(R.id.findDisease);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),ShowDiseases.class);
                startActivity(i);
            }
        });
        return v;
    }
    void prepareList(){
        header  = new ArrayList<String>();
        item = new HashMap<String,List<String>>();
        Cursor c1 = ds.getParts();
        if(c1.moveToFirst()) {
            do{
                header.add(c1.getString(c1.getColumnIndex("part")));
            }while(c1.moveToNext());
        }
        List<String> tm ;
        for(int i = 0;i<header.size();++i){
            tm = new ArrayList<String>();
            c1 = ds.getSymptom(header.get(i));
            if(c1.moveToFirst()){
                do{
                    tm.add(c1.getString(c1.getColumnIndex("symptom")));
                }while(c1.moveToNext());
            }
            item.put(header.get(i),tm);
        }

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_symptom_checker);

    }
}
