package com.develops.joy.destiny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mtextstoryview;
    private Button mtopbutton;
    private Button mbottombutton;
    private int mstoryindex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mtextstoryview=findViewById(R.id.storyTextView);
        mtopbutton=findViewById(R.id.buttonTop);
        mbottombutton=findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mstoryindex==1) {
                    mtextstoryview.setText(R.string.T3_Story);
                    mtopbutton.setText(R.string.T3_Ans1);
                    mbottombutton.setText(R.string.T3_Ans2);
                    mstoryindex=3;


                    }
                    else if(mstoryindex==3){
                    mtextstoryview.setText(R.string.T6_End);
                    mtopbutton.setVisibility(View.GONE);
                    mbottombutton.setVisibility(View.GONE);

                }
                else if(mstoryindex==2){
                    mtextstoryview.setText(R.string.T3_Story);
                    mtopbutton.setText(R.string.T3_Ans1);
                    mbottombutton.setText(R.string.T3_Ans2);
                    mstoryindex=3;

                }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbottombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mstoryindex==1) {
                    mtextstoryview.setText(R.string.T2_Story);
                    mtopbutton.setText(R.string.T2_Ans1);
                    mbottombutton.setText(R.string.T2_Ans2);
                    mstoryindex = 2;
                }
                else if(mstoryindex==2){
                    mtextstoryview.setText(R.string.T4_End);
                    mtopbutton.setVisibility(View.GONE);
                    mbottombutton.setVisibility(View.GONE);
                }
                else if(mstoryindex==3){
                    mtextstoryview.setText(R.string.T5_End);
                    mtopbutton.setVisibility(View.GONE);
                    mbottombutton.setVisibility(View.GONE);
                }


            }
        });


    }
}
