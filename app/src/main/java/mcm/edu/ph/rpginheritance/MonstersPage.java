package mcm.edu.ph.rpginheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MonstersPage extends AppCompatActivity{
    ImageView a, b, c, d, e, f;
    TextView patk, pdef, matk, mdef, hp, mp;
    String mon;
    Spinner spin;
    Button summon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsters1);

        a = findViewById(R.id.Slime);
        b = findViewById(R.id.Goblin);
        c = findViewById(R.id.Orc);
        d = findViewById(R.id.Eldritch);
        patk = findViewById(R.id.patk);
        pdef = findViewById(R.id.pdef);
        matk = findViewById(R.id.matk);
        mdef = findViewById(R.id.mdef);
        hp = findViewById(R.id.HP2);
        mp = findViewById(R.id.MP2);
        spin = findViewById(R.id.spinner);
        summon = findViewById(R.id.button);

        a.setVisibility(View.VISIBLE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        f.setVisibility(View.GONE);

        ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                this,R.array.monsters1, android.R.layout.simple_dropdown_item_1line);


        spin.setAdapter(sub);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mon = spin.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        summon.setOnClickListener(
                v -> {
                    if (mon.equals("Goblin")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.VISIBLE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        Monsters1 gob = new Monsters1(01,24,23,52,12,42,12,"Goblin");
                        hp.setText(String.valueOf(gob.getBhp()));
                        mp.setText(String.valueOf(gob.getBmp()));
                        patk.setText(String.valueOf(gob.getBpatk()));
                        pdef.setText(String.valueOf(gob.getBmdef()));
                        matk.setText(String.valueOf(gob.getBmatk()));
                        mdef.setText(String.valueOf(gob.getBmdef()));

                    } else if (mon.equals("Orc")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.VISIBLE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        Monsters1 gob = new Monsters1(01,42,42,21,64,21,42,"Orc");
                        hp.setText(String.valueOf(gob.getBhp()));
                        mp.setText(String.valueOf(gob.getBmp()));
                        patk.setText(String.valueOf(gob.getBpatk()));
                        pdef.setText(String.valueOf(gob.getBpdef()));
                        matk.setText(String.valueOf(gob.getBmatk()));
                        mdef.setText(String.valueOf(gob.getBmdef()));

                    } else if (mon.equals("Eldritch")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.VISIBLE);
                        e.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        Monsters1 gob = new Monsters1(01,21,64,21,42,21,52,"Eldirtch");
                        hp.setText(String.valueOf(gob.getBhp()));
                        mp.setText(String.valueOf(gob.getBmp()));
                        patk.setText(String.valueOf(gob.getBpatk()));
                        pdef.setText(String.valueOf(gob.getBpdef()));
                        matk.setText(String.valueOf(gob.getBmatk()));
                        mdef.setText(String.valueOf(gob.getBmdef()));

                    } else if (mon.equals("Slime")) {
                        a.setVisibility(View.GONE);
                        b.setVisibility(View.GONE);
                        c.setVisibility(View.GONE);
                        d.setVisibility(View.GONE);
                        e.setVisibility(View.VISIBLE);
                        f.setVisibility(View.GONE);
                        Monsters1 gob = new Monsters1(01,13,53,51,21,32,1,"Slime");
                        hp.setText(String.valueOf(gob.getBhp()));
                        mp.setText(String.valueOf(gob.getBmp()));
                        patk.setText(String.valueOf(gob.getBpatk()));
                        pdef.setText(String.valueOf(gob.getBpdef()));
                        matk.setText(String.valueOf(gob.getBmatk()));
                        mdef.setText(String.valueOf(gob.getBmdef()));


                    }
                }
        );

    }
}