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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DrugAlternatives extends Fragment {

    private ArrayList<String> arrayList;
    DataSource ds;
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstance){
        View v =  layoutInflater.inflate(R.layout.activity_drug_alternatives,container,false);
        ds = new DataSource();
        ds.setDrug();
        final Spinner spinner = (Spinner) v.findViewById(R.id.alternative);
        arrayList = new ArrayList<String>();
        /*
        *   Fill Categories
        */
        Cursor c1 = ds.getDrug();
        if(c1.moveToFirst()){
            do{
                arrayList.add(c1.getString(c1.getColumnIndex("name")));
            }while(c1.moveToNext());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        final TextView tv = (TextView) v.findViewById(R.id.alternate);
        Button but = (Button) v.findViewById(R.id.drugBut);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String drug = spinner.getSelectedItem().toString();
                tv.setText(ds.getAlternateDrug(drug));
            }
        });
        return v;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_drug_alternatives);
    }
}
