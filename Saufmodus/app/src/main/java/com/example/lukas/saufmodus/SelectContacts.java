package com.example.lukas.saufmodus;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.zip.Inflater;

/**
 * Created by Lukas on 04.05.2016. (C) Lukas Kaisermayr
 */
public class SelectContacts extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configurecontacts);

        fillList();
    }

    private void fillList (){

    }
}
