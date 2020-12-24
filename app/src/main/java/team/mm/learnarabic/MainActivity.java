package team.mm.learnarabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lgo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lgo = findViewById(R.id.l_go);
        lgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_menu=new Intent(MainActivity.this , Menu.class);
                startActivity(go_menu);
            }
        });

    }

}
