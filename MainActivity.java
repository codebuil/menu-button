package mydomain.HelloWorld;

import android.app.Activity;
import android.os.Bundle;

import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;



public class MainActivity extends Activity
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void  onmenu1_click(View v) {
		setTitle("menu1");
	} 
public void onmenu2_click(View v) {
		setTitle("menu2");
	}
	  public void onmenu3_click(View v) {
		setTitle("menu3");
	}
	public void onmenu4_click(View v) {
		setTitle("menu4");
	}
	public void onmenu5_click(View v) {
		setTitle("menu5");
	}
}
