package mcm.edu.ph.rpginheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button hero;
    private Button monsters1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monsters1 = (Button) findViewById(R.id.monsters1);
        hero = (Button) findViewById(R.id.hero);

        monsters1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonster1();
            }
        });

        hero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHeroClasses();
            }
        });
    }

    public void openHeroClasses() {
        Intent intent = new Intent(this, heroClasses.class);
        startActivity(intent);
    }

    public void openMonster1() {
        Intent intent = new Intent(this, MonstersPage.class);
        startActivity(intent);
    }

}