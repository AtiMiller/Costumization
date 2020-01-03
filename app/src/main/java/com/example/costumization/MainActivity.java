package com.example.costumization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);

        String [] names = {"Peter", "Paul", "Joe", "Jack", "Jill"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, names);

        etName.setThreshold(1);
        etName.setAdapter(adapter);

        showToast("Hello World!");
    }

    private void showToast(String message)
    {
        View toastView = getLayoutInflater().inflate(R.layout.toast, (ViewGroup) findViewById(R.id.linlay));

        TextView tvMessage = toastView.findViewById(R.id.tvMessage);
        tvMessage.setText(message);

        //Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastView);
        toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
    }
}
