package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Activity2 extends AppCompatActivity {
    TextView txtWordToBeGuessed;
    String wordToBeGuessed;
    String wordDisplayedString;
    char[] wordDisplayedCharArray;
    ArrayList<String> myListOfWords;

    TextView mesg;
    String triesLeft;
    final String WINNING_MESSAGE="You Saved him!";
    final String LOSING_MESSAGE="You Lost!";

    int tries=0;
    Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,RB,S,T,U,V,W,X,Y,Z;
    ImageView img;
    Integer images[] = {R.drawable.p0,R.drawable.p1, R.drawable.p2, R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.pp};




    void revealLetterInWord(char letter){
        int indexOfLetter=wordToBeGuessed.indexOf(letter);
        while (indexOfLetter>=0){
            wordDisplayedCharArray[indexOfLetter]=wordToBeGuessed.charAt(indexOfLetter);
            indexOfLetter=wordToBeGuessed.indexOf(letter,indexOfLetter+1);
        }
        wordDisplayedString=String.valueOf(wordDisplayedCharArray);
    }
    void displayWordOnScreen(){
        String formattedString="";
        for(char character:wordDisplayedCharArray){
            formattedString+=character+ " ";
        }
        txtWordToBeGuessed.setText(formattedString);
    }
    void initializeGame(){

        //get a word after shuffling
        Collections.shuffle(myListOfWords);
        wordToBeGuessed=myListOfWords.get(0);
        myListOfWords.remove(0);

        wordDisplayedCharArray=wordToBeGuessed.toCharArray();
        mesg.setText(" ");

        //add underscores
        for(int i=1;i<wordDisplayedCharArray.length-1;i++){
            wordDisplayedCharArray[i]='_';
        }

        revealLetterInWord(wordDisplayedCharArray[0]);
        revealLetterInWord(wordDisplayedCharArray[wordDisplayedCharArray.length-1]);

        wordDisplayedString=String.valueOf(wordDisplayedCharArray);
        img.setImageResource(images[0]);
        tries=1;

        displayWordOnScreen();

        triesLeft=" X X X X X X";






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        myListOfWords=new ArrayList<String>();
        txtWordToBeGuessed=findViewById(R.id.word);
        mesg=findViewById(R.id.message);

        img= (ImageView) findViewById(R.id.hangman);


        A=findViewById(R.id.A);
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        D=findViewById(R.id.D);
        E=findViewById(R.id.E);
        F=findViewById(R.id.F);
        G=findViewById(R.id.G);
        H=findViewById(R.id.H);
        I=findViewById(R.id.I);
        J=findViewById(R.id.J);
        K=findViewById(R.id.K);
        L=findViewById(R.id.L);
        M=findViewById(R.id.M);
        N=findViewById(R.id.N);
        O=findViewById(R.id.O);
        P=findViewById(R.id.P);
        Q=findViewById(R.id.Q);
        RB=findViewById(R.id.R);
        S=findViewById(R.id.S);
        T=findViewById(R.id.T);
        U=findViewById(R.id.U);
        V=findViewById(R.id.V);
        W=findViewById(R.id.W);
        X=findViewById(R.id.X);
        Y=findViewById(R.id.Y);
        Z=findViewById(R.id.Z);

        InputStream myInputStream=null;
        Scanner in=null;
        String aWord="";


        //read data from file
        try {
            myInputStream=getAssets().open("database_file.txt");
            in=new Scanner(myInputStream);
            while(in.hasNext()){
                aWord=in.next();
                myListOfWords.add(aWord);

            }
        } catch (IOException e) {
            Toast.makeText(Activity2.this,e.getClass().getSimpleName()+":"+e.getMessage(),Toast.LENGTH_SHORT).show();        }
        finally {
            if (in!=null){
            in.close();}
            try {
                if(myInputStream!=null){
                myInputStream.close();}
            } catch (IOException e) {
                Toast.makeText(Activity2.this,e.getClass().getSimpleName()+":"+e.getMessage(),Toast.LENGTH_SHORT).show();        }

        }
        initializeGame();

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('A');

            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('B');

            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('C');

            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('D');

            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('E');

            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('F');

            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('G');

            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('H');

            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('I');

            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('J');

            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('K');

            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('L');

            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('M');

            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('N');

            }
        });
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('O');

            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('P');

            }
        });
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('Q');

            }
        });
        RB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('R');

            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('S');

            }
        });
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('T');

            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('U');

            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('V');

            }
        });
        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('W');

            }
        });
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('X');

            }
        });
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('Y');

            }
        });
        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                checkIfLetterIsInWord('Z');

            }
        });




    }
    void checkIfLetterIsInWord(char letter){
        //if letter found
        if(wordToBeGuessed.indexOf(letter)>=0){
            if(wordDisplayedString.indexOf(letter)<0){
                // replace underscore with letter
                revealLetterInWord(letter);
                displayWordOnScreen();
                //check game won
                if(!wordDisplayedString.contains("_")){

                    mesg.setText(WINNING_MESSAGE);
                    img.setImageResource(images[8]);

                }
            }
        }
        //not found
        else {
            decreaseAndDisplayTriesLeft();
            //if game is lost
            if(triesLeft.isEmpty()){
                mesg.setText(LOSING_MESSAGE);
                img.setImageResource(images[7]);
                txtWordToBeGuessed.setText(wordToBeGuessed);
            }

        }



    }
    void decreaseAndDisplayTriesLeft(){
        if(!triesLeft.isEmpty()){
            triesLeft=triesLeft.substring(0,triesLeft.length() -2);

            img.setImageResource(images[tries]);
            tries+=1;

        }
    }

    void resetGame(View v){
        initializeGame();
    }


    }

