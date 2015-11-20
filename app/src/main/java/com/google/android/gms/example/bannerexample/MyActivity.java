/*
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.gms.example.bannerexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;  //Added widget import for buttons
import android.view.View;  //Added view import to make listeners work correctly

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Main Activity. Inflates main activity xml and child fragments.
 */
public class MyActivity extends ActionBarActivity
{
    //Declares all of the buttons that I created in the layout so that I can set up listeners for them.
    //Also declares an int.
    private AdView mAdView;
    private Button clearButton;
    private Button oButton;
    private Button xButton;
    private Button topLeftButton;
    private Button topMiddleButton;
    private Button topRightButton;
    private Button middleLeftButton;
    private Button middleButton;
    private Button middleRightButton;
    private Button bottomLeftButton;
    private Button bottomMiddleButton;
    private Button bottomRightButton;
    int ticTacValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Registers the declared buttons with their id's, which were set when the layout was created.
        clearButton = (Button) findViewById(R.id.clearButton);
        oButton = (Button) findViewById(R.id.oButton);
        xButton = (Button) findViewById(R.id.xButton);
        topLeftButton = (Button) findViewById(R.id.topLeftButton);
        topMiddleButton = (Button) findViewById(R.id.topMiddleButton);
        topRightButton = (Button) findViewById(R.id.topRightButton);
        middleLeftButton = (Button) findViewById(R.id.middleLeftButton);
        middleButton = (Button) findViewById(R.id.middleButton);
        middleRightButton = (Button) findViewById(R.id.middleRightButton);
        bottomLeftButton = (Button) findViewById(R.id.bottomLeftButton);
        bottomMiddleButton = (Button) findViewById(R.id.bottomMiddleButton);
        bottomRightButton = (Button) findViewById(R.id.bottomRightButton);

        //calls the setupListeners method
        setupListeners();

        // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
        // values/strings.xml.
        mAdView = (AdView) findViewById(R.id.ad_view);

        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /** Called when leaving the activity */
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

    //Initializes listeners for all the buttons.
    private void setupListeners()
    {
        //Sets the text of the button based on the value of the ticTacValue int
        topLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topLeftButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        topMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topMiddleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topMiddleButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        topRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    topRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    topRightButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        middleLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleLeftButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        middleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        middleRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    middleRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    middleRightButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        bottomLeftButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomLeftButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomLeftButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        bottomMiddleButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomMiddleButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomMiddleButton.setText("X");
                }
            }

        });
        //Sets the text of the button based on the value of the ticTacValue int
        bottomRightButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                if(ticTacValue == 1)
                {
                    bottomRightButton.setText("O");
                }
                else if(ticTacValue == 2)
                {
                    bottomRightButton.setText("X");
                }
            }

        });
        //Changes the value of the ticTacValue int
        oButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                ticTacValue = 1;
            }

        });
        //Changes the value of the ticTacValue int
        xButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                ticTacValue = 2;
            }

        });
        //Sets 9 buttons' text to "-"
        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View currentView) {
                bottomRightButton.setText("-");
                bottomLeftButton.setText("-");
                bottomMiddleButton.setText("-");
                topRightButton.setText("-");
                topLeftButton.setText("-");
                topMiddleButton.setText("-");
                middleRightButton.setText("-");
                middleLeftButton.setText("-");
                middleButton.setText("-");

            }
        });
    }
}
