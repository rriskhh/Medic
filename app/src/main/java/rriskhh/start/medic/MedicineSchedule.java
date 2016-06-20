package rriskhh.start.medic;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MedicineSchedule extends Fragment {

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstance){
        View v =  layoutInflater.inflate(R.layout.activity_medicine_schedule,container,false);
        Button newMedicine = (Button) v.findViewById(R.id.addMedicine);
        newMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),NewMedicine.class);
                startActivity(i);
            }
        });
        ListView lv = (ListView) v.findViewById(R.id.allMed);
        ArrayList<String> al = new ArrayList<String>();
        Cursor c1 = new DataSource().getMedicines();
        if(c1.moveToFirst()){
            while(c1.moveToNext()){
                String tmp = "Medicine Name: " + c1.getString(c1.getColumnIndex("mname"));
                tmp += "\nDays: ";
                String days[] = c1.getString(c1.getColumnIndex("days")).split(",");
                for(int i = 0;i<7;++i){
                    if(days[i].equals("1")){
                        switch(i){
                            case 0 : {tmp += "MON,"; break;}
                            case 1 : {tmp += "TUES,"; break;}
                            case 2 : {tmp += "WED,"; break;}
                            case 3 : {tmp += "THURS,"; break;}
                            case 4 : {tmp += "FRI,"; break;}
                            case 5 : {tmp += "SAT,"; break;}
                            case 6 : {tmp += "SUN,"; break;}
                        }
                    }
                }
                tmp += "\n Time: " + c1.getString(c1.getColumnIndex("times"));
                tmp += "\n--------------------------------------------------------\n";
                al.add(tmp);
            }
        }
        //al.add("Heyy");
        al.add("\n\n\n");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(),android.R.layout.simple_list_item_1,android.R.id.text1,al);
        lv.setAdapter(adapter);
        return v;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_medicine_schedule);
    }
}
