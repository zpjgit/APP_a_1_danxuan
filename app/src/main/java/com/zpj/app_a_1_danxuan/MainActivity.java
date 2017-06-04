package com.zpj.app_a_1_danxuan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup = null;
    private RadioButton femaleButton = null;
    private RadioButton maleButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        femaleButton = (RadioButton) findViewById(R.id.femaleButtonId);
        maleButton = (RadioButton) findViewById(R.id.maleButtonId);

//        RadioGroupListener listener = new RadioGroupListener();
//        radioGroup.setOnCheckedChangeListener(listener);

        RadioButtonListener radioButtonListener = new RadioButtonListener();
        maleButton.setOnCheckedChangeListener(radioButtonListener);
    }

        class RadioButtonListener implements RadioButton.OnCheckedChangeListener{
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println("id--> " + b);
            }
        }


//    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener {
//
//        @Override
//        public void onCheckedChanged(RadioGroup radioGroup, int i) {
//            if (i == femaleButton.getId()) {
//                System.out.println("选中female");
//            }
//            else if (i == maleButton.getId()) {
//                System.out.println("选中male  ");
//            }
//        }
//    }

}
