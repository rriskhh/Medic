package rriskhh.start.medic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ShowDiseases extends AppCompatActivity {

    DataSource ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_diseases);
        ds = new DataSource();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        int i;
        String tm;
        for(i = 0;i<SymptomChecker.arrayList.size();++i){
            tm = ds.getDisease(SymptomChecker.arrayList.get(i));
            String list[] = tm.split(",");
            for(int j = 0;j<list.length;++j){
                if(!stringArrayList.contains(list[j]))
                    stringArrayList.add(list[j]);
            }
        }
        //TextView tv1 = (TextView) findViewById(R.id.tv1);
        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,stringArrayList);
        list.setAdapter(adapter);
    }
}
