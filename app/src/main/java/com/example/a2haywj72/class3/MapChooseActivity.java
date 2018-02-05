/**
 * Created by 2haywj72 on 05/02/2018.
 */

package com.example.a2haywj72.class3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.id;

public class MapChooseActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);

        Button regular = (Button)findViewById(R.id.btnRegular);
        Button hikebikemap = (Button)findViewById(R.id.btnHikeBikeMap);
        regular.setOnClickListener(this);
        hikebikemap.setOnClicklistener(this);
    }

    public void onClick(View view)
    {
        Intent intent=new Intent();
        Bundle bundle=new Bundle();
        boolean hikeBike=false;
        if (v.getID()==R.id.btnHikeBikeMap)
        {
            hikebikemap=true
        }
        bundle.putBoolean("com.exmaple.hikebikemap",hikebikemap);
        intent.putExtras(bundle);
        setRestult(RESULT_OK,intent);
        finish();
    }
}
