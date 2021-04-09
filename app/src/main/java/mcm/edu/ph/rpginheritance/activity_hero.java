package mcm.edu.ph.rpginheritance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_hero extends AppCompatActivity {
    Spinner klass;
    String cls;
    Button select;
    Button next;
    TextView str, inte, agi, vit, patk, matk, pdef, mdef, hp, mp, lvl;
    ImageView ccss, a, b, c, d, e;
    double lvln;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heropage);

        next = findViewById(R.id.button2);
        str = findViewById(R.id.str);
        patk = findViewById(R.id.patkk);
        matk = findViewById(R.id.magic);
        pdef = findViewById(R.id.pd);
        mdef = findViewById(R.id.mr);
        agi = findViewById(R.id.agi);
        inte = findViewById(R.id.inte);
        klass = findViewById(R.id.Class);
        hp = findViewById(R.id.HP);
        mp = findViewById(R.id.mana);
        a = findViewById(R.id.BattleMage);
        b = findViewById(R.id.Swordsman);
        c = findViewById(R.id.Cleric);
        d = findViewById(R.id.Archer);
        lvl = findViewById(R.id.lvl1);
        a.setVisibility(View.GONE);
        b.setVisibility(View.GONE);
        c.setVisibility(View.GONE);
        d.setVisibility(View.GONE);
        e.setVisibility(View.GONE);
        next.setVisibility(View.GONE);
        ArrayAdapter<CharSequence> cLass = ArrayAdapter.createFromResource(
                this, R.array.Class, android.R.layout.simple_dropdown_item_1line);
        klass.setAdapter(cLass);


        klass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                cls = klass.getSelectedItem().toString();
                next.setVisibility(View.VISIBLE);
                if(cls.equals("BattleMage")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    BattleMage mg=new BattleMage(01,30,30,5,5,10,10);
                    BattleMage mg1= new BattleMage("BattleMage",2,2,2,2,1,2,3,2,2);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    mg1.setLvl(lvln);
                    hp.setText(String.valueOf(mg1.hpinc()));
                    mp.setText(String.valueOf(mg1.mpinc()));
                    str.setText(String.valueOf(mg1.strinc()));
                    agi.setText(String.valueOf(mg1.agiinc()));
                    inte.setText(String.valueOf(mg1.intinc()));
                    vit.setText(String.valueOf((mg1.vitinc())));
                    matk.setText(String.valueOf(mg1.matkinc()));
                    mdef.setText(String.valueOf(mg1.mdefinc()));
                    patk.setText(String.valueOf(mg.getBpatk()+(mg1.getLvl()*.5)));
                    pdef.setText(String.valueOf(mg.getBpdef()+(mg1.getLvl()*.5)));
                }
                else if(cls.equals("Archer")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    Archer a =new Archer(01,30,30,5,5,10,10);
                    Archer b=new Archer("Archer",2,2,2,2,1,3,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    inte.setText(String.valueOf(b.intinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    patk.setText(String.valueOf(b.patkinc()));
                    pdef.setText(String.valueOf(b.pdefinc()));
                    matk.setText(String.valueOf(a.getBmatk()+(b.getLvl()*.5)));
                    mdef.setText(String.valueOf(a.getBmdef()+(b.getLvl()*.5)));
                }
                else if(cls.equals("Cleric")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.GONE);
                    e.setVisibility(View.GONE);
                    Cleric a =new Cleric(01,30,30,5,5,10,10);
                    Cleric b=new Cleric("Cleric",2,2,2,2,1,2,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    inte.setText(String.valueOf(b.intinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    matk.setText(String.valueOf(b.matkinc()));
                    mdef.setText(String.valueOf(b.mdefinc()));
                    patk.setText(String.valueOf(b.getBpatk()+(b.getLvl()*.5)));
                    pdef.setText(String.valueOf(b.getBpdef()+(b.getLvl()*.5)));
                }
                else if(cls.equals("Swordsman")){
                    ccss.setVisibility(View.GONE);
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    d.setVisibility(View.VISIBLE);
                    e.setVisibility(View.GONE);
                    Swordsman a =new Swordsman(01,30,30,5,5,10,10);
                    Swordsman b=new Swordsman("Swordsman",2,2,2,2,1,3,2,2,3);
                    lvln=Double.parseDouble(lvl.getText().toString());
                    b.setLvl(lvln);
                    hp.setText(String.valueOf(b.hpinc()));
                    mp.setText(String.valueOf(b.mpinc()));
                    str.setText(String.valueOf(b.strinc()));
                    agi.setText(String.valueOf(b.agiinc()));
                    inte.setText(String.valueOf(b.intinc()));
                    vit.setText(String.valueOf((b.vitinc())));
                    patk.setText(String.valueOf(b.patkinc()));
                    pdef.setText(String.valueOf(b.pdefinc()));
                    matk.setText(String.valueOf(a.getBmatk()+(b.getLvl()*.5)));
                    mdef.setText(String.valueOf(a.getBmdef()+(b.getLvl()*.5)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent go =new Intent(activity_hero.this,subclass.class);
                        go.putExtra("klass",cls);
                        startActivity(go);
                    }


                });
    }}
