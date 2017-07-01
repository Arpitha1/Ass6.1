package com.example.abhi.storage1;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().findFragmentById(R.id.fragment);
    }

    public static class SimpleAddition extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInsatnceState){
            View v =inflater.inflate(R.layout.activity_main,container,false);
            Button b = (Button)v.findViewById(R.id.button);
            final EditText et1 = (EditText)v.findViewById(R.id.editText);
            final TextView tv1 = (TextView)v.findViewById(R.id.textView);
            b.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View v) {
                    String text = et1.getText().toString();
                    tv1.setText(text);
                }
            });
            return v;
        }

        }
}
