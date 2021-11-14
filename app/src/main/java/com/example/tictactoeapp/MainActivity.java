package com.example.tictactoeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    ImageView Empty1, Empty2, Empty3, Empty4, Empty5, Empty6, Empty7, Empty8, Empty9 ;
    ImageView playTurn, CrossL, CrossR, CrossV1, CrossV2, CrossV3, CrossD1, CrossD2, CrossD3;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining the ids for the images
        Empty1 = findViewById(R.id.main_activity_empty1);
        Empty2 = findViewById(R.id.main_activity_empty2);
        Empty3 = findViewById(R.id.main_activity_empty3);
        Empty4 = findViewById(R.id.main_activity_empty4);
        Empty5 = findViewById(R.id.main_activity_empty5);
        Empty6 = findViewById(R.id.main_activity_empty6);
        Empty7 = findViewById(R.id.main_activity_empty7);
        Empty8 = findViewById(R.id.main_activity_empty8);
        Empty9 = findViewById(R.id.main_activity_empty9);

        Empty1.setTag("1");
        Empty2.setTag("2");
        Empty3.setTag("3");
        Empty4.setTag("4");
        Empty5.setTag("5");
        Empty6.setTag("6");
        Empty7.setTag("7");
        Empty8.setTag("8");
        Empty9.setTag("9");

        playTurn = findViewById(R.id.main_activity_playturn);
        CrossL = findViewById(R.id.main_activity_crossL);
        CrossR = findViewById(R.id.main_activity_crossR);
        CrossV1 = findViewById(R.id.main_activity_crossVertical1);
        CrossV2 = findViewById(R.id.main_activity_crossVertical2);
        CrossV3 = findViewById(R.id.main_activity_crossVertical3);
        CrossD1 = findViewById(R.id.main_activity_crossD);
        CrossD2 = findViewById(R.id.main_activity_crossD2);
        CrossD3 = findViewById(R.id.main_activity_crossD3);

        //defenition of the visibalty of the lines
        CrossR.setVisibility(View.GONE);
        CrossL.setVisibility(View.GONE);
        CrossV1.setVisibility(View.GONE);
        CrossV2.setVisibility(View.GONE);
        CrossV3.setVisibility(View.GONE);
        CrossD1.setVisibility(View.GONE);
        CrossD2.setVisibility(View.GONE);
        CrossD3.setVisibility(View.GONE);

        playTurn.setImageResource(R.drawable.xplay);
        playTurn.setTag(R.drawable.xplay);

        //define a function of click for each empty slot
        Empty1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playTurn.getTag().equals(R.drawable.xplay)) {
                    Empty1.setImageResource(R.drawable.x);
                    Empty1.setTag(R.drawable.x);

                    if (Empty7.getTag().equals(R.drawable.x) && Empty4.getTag().equals(R.drawable.x)) {

                        playTurn.setImageResource(R.drawable.xwin);
                        flag = 1;

                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);
                    }
                    if (Empty5.getTag().equals(R.drawable.x) && Empty9.getTag().equals(R.drawable.x)) {
                        playTurn.setImageResource(R.drawable.xwin);
                        flag = 1;
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);
                    }

                    if (Empty3.getTag().equals(R.drawable.x) && Empty2.getTag().equals(R.drawable.x)) {
                        playTurn.setImageResource(R.drawable.xwin);
                        flag = 1;
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);
                    }

                    if (flag == 0) {
                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }
                }
                else {

                    Empty1.setImageResource(R.drawable.o);
                    Empty1.setTag(R.drawable.o);
                    if (Empty7.getTag().equals(R.drawable.o) && Empty4.getTag().equals(R.drawable.o)) {
                        playTurn.setImageResource(R.drawable.owin);
                        flag = 1;
                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);


                    }
                    if (Empty5.getTag().equals(R.drawable.o) && Empty9.getTag().equals(R.drawable.o)) {
                        playTurn.setImageResource(R.drawable.owin);
                        flag = 1;
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);

                    }
                    if (Empty3.getTag().equals(R.drawable.o) && Empty2.getTag().equals(R.drawable.o)) {
                        playTurn.setImageResource(R.drawable.owin);
                        flag = 1;
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);

                    }
                    if (flag == 0) {
                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
        });
        Empty2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playTurn.getTag().equals(R.drawable.xplay)){
                    Empty2.setImageResource(R.drawable.x);
                    Empty2.setTag(R.drawable.x);
                    if(Empty1.getTag().equals(R.drawable.x)&&Empty3.getTag().equals(R.drawable.x)
                            ){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);
                    }
                    if (Empty5.getTag().equals(R.drawable.x)&&Empty8.getTag().equals(R.drawable.x))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }
                }else {

                    Empty2.setImageResource(R.drawable.o);
                    Empty2.setTag(R.drawable.o);
                    if(Empty1.getTag().equals(R.drawable.o)&&Empty3.getTag().equals(R.drawable.o)
                    ){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);
                    }
                    if (Empty5.getTag().equals(R.drawable.o)&&Empty8.getTag().equals(R.drawable.o))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);
                    }

                    if (flag ==0) {
                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
        });
        Empty3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playTurn.getTag().equals(R.drawable.xplay)){
                    Empty3.setImageResource(R.drawable.x);
                    Empty3.setTag(R.drawable.x);
                    if(Empty2.getTag().equals(R.drawable.x)&&Empty1.getTag().equals(R.drawable.x)
                    ){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);

                    }if(Empty5.getTag().equals(R.drawable.x)&&Empty7.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);

                    }if(Empty9.getTag().equals(R.drawable.x)&&Empty6.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);

                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }else {

                    Empty3.setImageResource(R.drawable.o);
                    Empty3.setTag(R.drawable.o);
                    if(Empty2.getTag().equals(R.drawable.o)&&Empty1.getTag().equals(R.drawable.o)
                    ){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV1.setVisibility(View.VISIBLE);
                        CrossV1.setImageResource(R.drawable.mark8);

                    }if(Empty5.getTag().equals(R.drawable.o)&&Empty7.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);

                    }if(Empty9.getTag().equals(R.drawable.o)&&Empty6.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);

                    }

                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
        });
        Empty4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playTurn.getTag().equals(R.drawable.xplay)){
                    Empty4.setImageResource(R.drawable.x);
                    Empty4.setTag(R.drawable.x);
                    if(Empty7.getTag().equals(R.drawable.x)&&Empty1.getTag().equals(R.drawable.x)
                            ){
                        flag = 1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);
                    }
                    if (Empty5.getTag().equals(R.drawable.x)&&Empty6.getTag().equals(R.drawable.x))
                    {
                        flag = 1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }else {

                    Empty4.setImageResource(R.drawable.o);
                    Empty4.setTag(R.drawable.o);
                    if(Empty7.getTag().equals(R.drawable.o)&&Empty1.getTag().equals(R.drawable.o)
                    ){
                        flag = 1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);
                    }
                    if (Empty5.getTag().equals(R.drawable.o)&&Empty6.getTag().equals(R.drawable.o))
                    {
                        flag = 1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
        });
        Empty5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(playTurn.getTag().equals(R.drawable.xplay)){
                    Empty5.setImageResource(R.drawable.x);
                    Empty5.setTag(R.drawable.x);
                    if(Empty2.getTag().equals(R.drawable.x)&&Empty8.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);

                    }if( Empty4.getTag().equals(R.drawable.x)&&Empty6.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);


                    }if( Empty9.getTag().equals(R.drawable.x)&&Empty1.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);


                    }if(Empty7.getTag().equals(R.drawable.x)&&Empty3.getTag().equals(R.drawable.x)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);


                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }else {

                    Empty5.setImageResource(R.drawable.o);
                    Empty5.setTag(R.drawable.o);
                    if(Empty2.getTag().equals(R.drawable.o)&&Empty8.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);

                    }if( Empty4.getTag().equals(R.drawable.o)&&Empty6.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);


                    }if( Empty9.getTag().equals(R.drawable.o)&&Empty1.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);


                    }if(Empty7.getTag().equals(R.drawable.o)&&Empty3.getTag().equals(R.drawable.o)){
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);


                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }

            }
        });
        Empty6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playTurn.getTag().equals(R.drawable.xplay)) {
                    Empty6.setImageResource(R.drawable.x);
                    Empty6.setTag(R.drawable.x);
                    if (Empty5.getTag().equals(R.drawable.x) && Empty4.getTag().equals(R.drawable.x)
                    )
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);
                    }
                    if(Empty9.getTag().equals(R.drawable.x) && Empty3.getTag().equals(R.drawable.x))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }
                }
                else{
                    Empty6.setImageResource(R.drawable.o);
                    Empty6.setTag(R.drawable.o);
                    if (Empty5.getTag().equals(R.drawable.o) && Empty4.getTag().equals(R.drawable.o)
                    )
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV3.setVisibility(View.VISIBLE);
                        CrossV3.setImageResource(R.drawable.mark8);
                    }
                    if(Empty9.getTag().equals(R.drawable.o) && Empty3.getTag().equals(R.drawable.o))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
     });
        Empty7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playTurn.getTag().equals(R.drawable.xplay)) {
                    Empty7.setImageResource(R.drawable.x);
                    Empty7.setTag(R.drawable.x);
                    if (Empty1.getTag().equals(R.drawable.x) && Empty4.getTag().equals(R.drawable.x) ) {

                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);

                    }if(Empty5.getTag().equals(R.drawable.x) && Empty3.getTag().equals(R.drawable.x)){
                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);
                    }if(Empty8.getTag().equals(R.drawable.x) && Empty9.getTag().equals(R.drawable.x)){
                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }
                else{
                    Empty7.setImageResource(R.drawable.o);
                    Empty7.setTag(R.drawable.o);
                    if (Empty1.getTag().equals(R.drawable.o) && Empty4.getTag().equals(R.drawable.o) ) {

                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossD2.setVisibility(View.VISIBLE);
                        CrossD2.setImageResource(R.drawable.mark4);

                    }if(Empty5.getTag().equals(R.drawable.o) && Empty3.getTag().equals(R.drawable.o)){
                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossR.setVisibility(View.VISIBLE);
                        CrossR.setImageResource(R.drawable.mark2);
                    }if(Empty8.getTag().equals(R.drawable.o) && Empty9.getTag().equals(R.drawable.o)){
                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }
            }
        });
        Empty8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playTurn.getTag().equals(R.drawable.xplay)) {
                    Empty8.setImageResource(R.drawable.x);
                    Empty8.setTag(R.drawable.x);
                    if (Empty5.getTag().equals(R.drawable.x) && Empty2.getTag().equals(R.drawable.x)
                            ) {
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);
                    }
                    if (Empty7.getTag().equals(R.drawable.x) && Empty9.getTag().equals(R.drawable.x))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.xwin);
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }
                else{
                    Empty8.setImageResource(R.drawable.o);
                    Empty8.setTag(R.drawable.o);
                    if (Empty5.getTag().equals(R.drawable.o) && Empty2.getTag().equals(R.drawable.o)
                    ) {
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossD3.setVisibility(View.VISIBLE);
                        CrossD3.setImageResource(R.drawable.mark3);
                    }
                    if (Empty7.getTag().equals(R.drawable.o) && Empty9.getTag().equals(R.drawable.o))
                    {
                        flag =1;
                        playTurn.setImageResource(R.drawable.owin);
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }


            }
        });
        Empty9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playTurn.getTag().equals(R.drawable.xplay)) {
                    Empty9.setImageResource(R.drawable.x);
                    Empty9.setTag(R.drawable.x);
                    if (Empty8.getTag().equals(R.drawable.x) && Empty7.getTag().equals(R.drawable.x)) {
                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (Empty5.getTag().equals(R.drawable.x) && Empty1.getTag().equals(R.drawable.x))
                    {
                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);
                    }
                    if (Empty6.getTag().equals(R.drawable.x) && Empty3.getTag().equals(R.drawable.x))
                    {
                        playTurn.setImageResource(R.drawable.xwin);
                        flag=1;
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);
                    }
                        if (flag ==0) {

                        playTurn.setImageResource(R.drawable.oplay);
                        playTurn.setTag(R.drawable.oplay);
                    }

                }
                else{
                    Empty9.setImageResource(R.drawable.o);
                    Empty9.setTag(R.drawable.o);
                    if (Empty8.getTag().equals(R.drawable.o) && Empty7.getTag().equals(R.drawable.o)) {
                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossV2.setVisibility(View.VISIBLE);
                        CrossV2.setImageResource(R.drawable.mark8);
                    }
                    if (Empty5.getTag().equals(R.drawable.o) && Empty1.getTag().equals(R.drawable.o))
                    {
                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossL.setVisibility(View.VISIBLE);
                        CrossL.setImageResource(R.drawable.mark1);
                    }
                    if (Empty6.getTag().equals(R.drawable.o) && Empty3.getTag().equals(R.drawable.o))
                    {
                        playTurn.setImageResource(R.drawable.owin);
                        flag=1;
                        CrossD1.setVisibility(View.VISIBLE);
                        CrossD1.setImageResource(R.drawable.mark3);
                    }
                    if (flag ==0) {

                        playTurn.setImageResource(R.drawable.xplay);
                        playTurn.setTag(R.drawable.xplay);
                    }
                }

            }
        });

    }
}