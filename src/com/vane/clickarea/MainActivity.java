package com.vane.clickarea;

import com.vane.demo.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView( R.layout.activity_main);
        findViewById( R.id.menu_1).setOnClickListener( this);
        findViewById( R.id.menu_2).setOnClickListener( this);
        findViewById( R.id.menu_3).setOnClickListener( this);
        findViewById( R.id.menu_4).setOnClickListener( this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(null != mToast) {
            mToast.cancel();
        }
        switch(v.getId()) {
            case R.id.menu_1:
                mToast = Toast.makeText( this, "red", Toast.LENGTH_SHORT);
                break;
            case R.id.menu_2:
                mToast = Toast.makeText( this, "yellow", Toast.LENGTH_SHORT);
                break;
            case R.id.menu_3:
                mToast = Toast.makeText( this, "green", Toast.LENGTH_SHORT);
                break;
            case R.id.menu_4:
                mToast = Toast.makeText( this, "blue", Toast.LENGTH_SHORT);
                break;
        }
        mToast.show();
    }
}
