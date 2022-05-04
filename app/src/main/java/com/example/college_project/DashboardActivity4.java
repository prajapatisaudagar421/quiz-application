package com.example.college_project;

import static com.example.college_project.SplashScreen.list;
import static com.example.college_project.SplashScreen.list1;
import static com.example.college_project.SplashScreen.list4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class DashboardActivity4 extends AppCompatActivity {
    CountDownTimer countDownTimer;
    int timerValue = 20;
    List<Modelclass> allQuestionList;
    Modelclass modelclass;
    int index = 0;
    TextView card_question, optiona, optionb, optionc, optiond;
    CardView cardOA,cardOB,cardOC,cardOD;
    int correctCount = 0;
    int wrongCount = 0;
    LinearLayout nextBtn;
    ImageView ic_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);
        ic_back = findViewById(R.id.ic_back);


        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity4.this,CategoryActivity.class);
                startActivity(intent);
            }
        });

        Hooks();
        allQuestionList = list4;
        Collections.shuffle(allQuestionList);
        modelclass = list4.get(index);

        cardOA.setBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setBackgroundColor(getResources().getColor(R.color.white));

        nextBtn.setClickable(false);

        countDownTimer = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerValue = timerValue-1;

            }

            @Override
            public void onFinish() {
                Dialog dialog = new Dialog(DashboardActivity4.this,R.style.Dailoge);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                dialog.setContentView(R.layout.time_out_dailog);


                dialog.findViewById(R.id.btn_tryAgain).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DashboardActivity4.this,CategoryActivity.class);
                        startActivity(intent);
                    }
                });
                dialog.show();

            }
        }.start();

        setAllData();
    }

    private void setAllData() {
        card_question.setText(modelclass.getQuestion());
        optiona.setText(modelclass.getoA());
        optionb.setText(modelclass.getoB());
        optionc.setText(modelclass.getoC());
        optiond.setText(modelclass.getoD());
        timerValue = 10;
        countDownTimer.cancel();
        countDownTimer.start();
    }

    private void Hooks() {
        card_question = findViewById(R.id.card_question);
        optiona = findViewById(R.id.card_optiona);
        optionb = findViewById(R.id.card_optionb);
        optionc = findViewById(R.id.card_optionc);
        optiond = findViewById(R.id.card_optiond);

        cardOA = findViewById(R.id.cardOA);
        cardOB = findViewById(R.id.cardOB);
        cardOC = findViewById(R.id.cardOC);
        cardOD = findViewById(R.id.cardOD);

        nextBtn = findViewById(R.id.nextBtn);
    }
    public void Correct(CardView cardView){

        cardView.setBackgroundColor(getResources().getColor(R.color.light_green));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctCount++;
                index++;
                modelclass = list4.get(index);
                resetColor();
                setAllData();
                enableButton();
            }
        });
    }


    public void Wrong(CardView cardView){
        cardView.setBackgroundColor(getResources().getColor(R.color.light_red));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrongCount++;
                if (index<list4.size()-1){
                    index++;
                    modelclass = list4.get(index);
                    setAllData();
                    resetColor();
                    enableButton();

                }
                else {
                    GameWon();
                }
            }
        });


    }

    private void GameWon() {
        Intent intent = new Intent(DashboardActivity4.this,WonActivity.class);
        intent.putExtra("correct",correctCount);
        intent.putExtra("wrong",wrongCount);
        startActivity(intent);
    }
    public void enableButton(){
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }
    public void disableButton(){
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }
    public void resetColor(){
        cardOA.setBackgroundColor(getResources().getColor(R.color.white));
        cardOB.setBackgroundColor(getResources().getColor(R.color.white));
        cardOC.setBackgroundColor(getResources().getColor(R.color.white));
        cardOD.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void OptionAClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if (modelclass.getoA().equals(modelclass.getAns())){
            cardOA.setCardBackgroundColor(getResources().getColor(R.color.light_green));
            if (index<list4.size()-1){
                Correct(cardOA);

            }
            else {
                GameWon();
            }
        }
        else {
            Wrong(cardOA);
        }
    }

    public void OptionBClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if (modelclass.getoB().equals(modelclass.getAns())){
            cardOB.setCardBackgroundColor(getResources().getColor(R.color.light_green));
            if (index<list4.size()-1){
                Correct(cardOB);

            }
            else {
                GameWon();
            }
        }
        else {
            Wrong(cardOB);
        }
    }

    public void OptionCClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if (modelclass.getoC().equals(modelclass.getAns())){
            cardOC.setCardBackgroundColor(getResources().getColor(R.color.light_green));
            if (index<list4.size()-1){
                Correct(cardOC);

            }
            else {
                GameWon();
            }
        }
        else {
            Wrong(cardOC);
        }
    }

    public void OptionDClick(View view) {
        disableButton();
        nextBtn.setClickable(true);
        if (modelclass.getoD().equals(modelclass.getAns())){
            cardOD.setCardBackgroundColor(getResources().getColor(R.color.light_green));
            if (index<list4.size()-1){
                Correct(cardOD);

            }
            else {
                GameWon();
            }
        }
        else {
            Wrong(cardOD);
        }
    }
}