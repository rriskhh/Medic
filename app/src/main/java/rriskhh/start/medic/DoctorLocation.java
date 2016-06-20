package rriskhh.start.medic;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class DoctorLocation extends Fragment {

    DataSource ds;
    private ArrayList<String> arrayList;
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstance){
       View v = layoutInflater.inflate(R.layout.activity_doctor_location,container,false);

        ds = new DataSource();
        ds.setDoctor();
        final Spinner spinner_cat = (Spinner) v.findViewById(R.id.spinner_cat);
        arrayList = new ArrayList<String>();
        Cursor c1 = ds.getSpec();
        if(c1.moveToFirst()){
            do{
                arrayList.add(c1.getString(c1.getColumnIndex("speciality")));
            }while(c1.moveToNext());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_cat.setAdapter(adapter);

        final Spinner spinner_place = (Spinner) v.findViewById(R.id.spinner_place);
        arrayList = new ArrayList<String>();
        /*
        *   Fill Places
        */
        c1 = ds.getArea();
        if(c1.moveToFirst()){
            do{
                arrayList.add(c1.getString(c1.getColumnIndex("area")));
            }while(c1.moveToNext());
        }
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_place.setAdapter(adapter);
        final TextView tv = (TextView) v.findViewById(R.id.doc);
        Button but = (Button) v.findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tv.setText(ds.getAllDoctors(spinner_cat.getSelectedItem().toString(), spinner_place.getSelectedItem().toString()));
            }
        });

        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_doctor_location);
    }
}
