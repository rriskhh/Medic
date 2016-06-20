package rriskhh.start.medic;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NewMedicine extends AppCompatActivity {
    int doses = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_medicine);
        final Spinner spinner = (Spinner) findViewById(R.id.doses);
        //int doses = 0;
        final Context _context = getApplicationContext();
        final LinearLayout parentLayout = (LinearLayout)findViewById(R.id.parent);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int total = Integer.parseInt(spinner.getSelectedItem().toString());
                for (; doses < total; ++doses) {
                    LinearLayout child = new LinearLayout(_context);
                    LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    layout.setMargins(10, 10, 10, 10);
                    child.setLayoutParams(layout);
                    //child.setBackgroundColor(Color.BLUE);
                    child.setOrientation(LinearLayout.HORIZONTAL);
                    TextView tv = new TextView(_context);
                    LinearLayout.LayoutParams txtView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    txtView.setMargins(30, 0, 0, 0);
                    tv.setLayoutParams(txtView);
                    //int color = Color.parseColor("125688");
                    tv.setTextColor(Color.BLACK);
                    tv.setTextSize(22);
                    tv.setText("Dose" + (doses + 1));
                    child.addView(tv);
                    EditText ed = new EditText(_context);
                    ed.setTextSize(20);
                    txtView.setMargins(100, 0, 0, 0);
                    //ed.setText("huhuhu");
                    ed.setTextColor(Color.WHITE);
                    ed.setPadding(10, 10, 10, 10);
                    ed.setBackgroundColor(Color.parseColor("#125688"));
                    ed.setHintTextColor(Color.WHITE);
                    ed.setHint(" Dose Timings ");
                    ed.setId(doses);
                    ed.setLayoutParams(txtView);
                    //ed.setBackgroundColor(Color.BLUE);
                    child.addView(ed);
                    parentLayout.addView(child);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            int chDays[] = {R.id.mon, R.id.tues, R.id.wed, R.id.thurs, R.id.fri, R.id.sat, R.id.sun};

            @Override
            public void onClick(View v) {
                String mname = ((EditText) findViewById(R.id.mname)).getText().toString();
                if (mname.isEmpty()) {
                    Toast.makeText(_context, "No medicine Name Entered", Toast.LENGTH_SHORT).show();
                    return;
                }
                String timings = "";
                String days = "";
                int i;
                for (i = 0; i < doses; i++)
                    timings += ((EditText) findViewById(i)).getText() + ",";

                for (i = 0; i < 7; ++i) {
                    if ( ((CheckBox)findViewById(chDays[i])).isChecked() )
                        days += "1,";
                    else
                        days += "0,";
                }
                new DataSource().addMedicines(mname, timings, days);
                Toast.makeText(_context,"Medicine Added",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent = new Intent(_context,MainActivity.class);
                startActivity(intent);
            }
        });
        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
