package com.opus_bd.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SpinnerActivity extends AppCompatActivity {
    @BindView(R.id.spinner1)
    Spinner spinner1;
    @BindView(R.id.rootLayout)
    LinearLayout rootLayout;
    @BindView(R.id.tvColor)
    TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }


    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            String item = parent.getItemAtPosition(pos).toString();
            // tvColor.setText(item);
            textColorChange(item);
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
        }

    }


    public void colorChange(String item) {
        if (item.equals("RED")) {
            rootLayout.setBackgroundColor(getResources().getColor(R.color.RED));
        }
        if (item.equals("Orange"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Orange));
        if (item.equals("Yellow"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Yellow));
        if (item.equals("Green"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Green));
        if (item.equals("Cyan"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Cyan));
        if (item.equals("Blue"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Blue));
        if (item.equals("Purple"))
            rootLayout.setBackgroundColor(getResources().getColor(R.color.Purple));

    }

    public void textColorChange(String item) {
        if (item.equals("RED")) {
            tvColor.setTextColor(getResources().getColor(R.color.RED));
            wordlist(getResources().getStringArray(R.array.RED));
        }
        if (item.equals("Orange")){
            tvColor.setText(" ");
            tvColor.setTextColor(getResources().getColor(R.color.Orange));
            wordlist(getResources().getStringArray(R.array.Orange));
        }

        if (item.equals("Yellow"))
        {
            tvColor.setTextColor(getResources().getColor(R.color.Yellow));
            wordlist(getResources().getStringArray(R.array.Yellow));

        }

        if (item.equals("Green"))
        {
            tvColor.setTextColor(getResources().getColor(R.color.Green));
            wordlist(getResources().getStringArray(R.array.Green));

        }

        if (item.equals("Cyan"))

        {

            tvColor.setTextColor(getResources().getColor(R.color.Cyan));
            wordlist(getResources().getStringArray(R.array.Cyan));
        }

        if (item.equals("Blue"))

        {
            tvColor.setTextColor(getResources().getColor(R.color.Blue));
            wordlist(getResources().getStringArray(R.array.Blue));

        }

        if (item.equals("Purple"))

        {
            tvColor.setTextColor(getResources().getColor(R.color.Purple));
            wordlist(getResources().getStringArray(R.array.Purple));
        }


    }


    public void wordlist(String word[]) {
        tvColor.setText(" ");
        for (int i = 0; i < word.length; i++) {
            tvColor.append(word[i]);
            tvColor.append("\n");
        }
    }
}
