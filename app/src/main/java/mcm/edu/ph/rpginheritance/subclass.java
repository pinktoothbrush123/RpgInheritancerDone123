package mcm.edu.ph.rpginheritance;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class subclass extends AppCompatActivity {
        private String klass,cls;
        private ImageView a,b,c,d;
        private Spinner spin;
        private Button select;
        private TextView str,intt,agi,patk,matk,pdef,mdef,hp,mp;
        double lvln;
        EditText lvl;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_subclass);
            klass=getIntent().getStringExtra("klass");
            a=findViewById(R.id.summonerknight);
            b=findViewById(R.id.crossbow);
            c=findViewById(R.id.knightking);
            d=findViewById(R.id.darkhealer);
            lvl=findViewById(R.id.lvl1);
            spin=findViewById(R.id.Class);
            hp=findViewById(R.id.HP);
            mp=findViewById(R.id.mana);
            str=findViewById(R.id.str);
            agi=findViewById(R.id.agi);
            intt=findViewById(R.id.inte);
            patk=findViewById(R.id.patk);
            matk=findViewById(R.id.matk);
            pdef=findViewById(R.id.pdef);
            mdef=findViewById(R.id.mdef);


            a.setVisibility(View.VISIBLE);
            b.setVisibility(View.GONE);
            c.setVisibility(View.GONE);
            d.setVisibility(View.GONE);


            if(klass.equals("BattleMage")){
                ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                        this,R.array.BattleMage, android.R.layout.simple_dropdown_item_1line);
                spin.setAdapter(sub);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        cls=spin.getSelectedItem().toString();
                        if(cls.equals("summonerknight")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.VISIBLE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            summonerknight mg=new summonerknight(01,30,30,5,5,10,10);
                            summonerknight mg1= new summonerknight("summonerknight",2,2,2,2,1,2,3,2,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            matk.setText(String.valueOf(mg1.matkinc()));
                            mdef.setText(String.valueOf(mg1.mdefinc()));
                            patk.setText(String.valueOf(mg.getBpatk()+(mg1.getLvl()*.5)));
                            pdef.setText(String.valueOf(mg.getBpdef()+(mg1.getLvl()*.5)));
                        }

                        else{
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.VISIBLE);
                            d.setVisibility(View.GONE);
                            summonerknight mg=new summonerknight(01,30,30,5,5,10,10);
                            summonerknight mg1= new summonerknight("summonerknight",2,2,2,2,1,2,3,3,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            matk.setText(String.valueOf(mg1.matkinc()));
                            mdef.setText(String.valueOf(mg1.mdefinc()));
                            patk.setText(String.valueOf(mg.getBpatk()));
                            pdef.setText(String.valueOf(mg.getBpdef()+(mg1.getLvl()*.5)));


                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            else if(klass.equals("Archer")){
                ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                        this,R.array.Archer, android.R.layout.simple_dropdown_item_1line);
                spin.setAdapter(sub);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        cls=spin.getSelectedItem().toString();
                        if(cls.equals("Crossbow")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.VISIBLE);
                            crossbow mg=new crossbow(01,30,30,5,5,10,10);
                            crossbow mg1= new crossbow("Igor",2,2,2,2,1,3,2,2,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.getBpdef()));
                            matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                            mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                        }

                        else{
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            crossbow mg=new crossbow(01,30,30,5,5,10,10);
                            crossbow mg1= new crossbow("crossbow",2,2,2,2,1,2,2,3,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.getBpdef()));
                            matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                            mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            else if(klass.equals("Swordsman")){
                ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                        this,R.array.Swordsman, android.R.layout.simple_dropdown_item_1line);
                spin.setAdapter(sub);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        cls=spin.getSelectedItem().toString();
                        if(cls.equals("Knightking")){
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            knightking mg=new knightking(01,30,50,5,5,10,10);
                            knightking mg1= new knightking("Knightking",2,2,2,2,1,2,4,3,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.pdefinc()));
                            matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                            mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));
                        }

                        else{
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            knightking mg=new knightking(01,30,30,5,5,10,10);
                            knightking mg1= new knightking("knightking",2,2,2,2,1,4,2,4,2);
                            lvln=Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.pdefinc()));
                            matk.setText(String.valueOf(mg.getBmatk()+(mg1.getLvl()*.5)));
                            mdef.setText(String.valueOf(mg.getBmdef()+(mg1.getLvl()*.5)));


                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }
            else if(klass.equals("Cleric")){
                ArrayAdapter<CharSequence> sub = ArrayAdapter.createFromResource(
                        this,R.array.Cleric, android.R.layout.simple_dropdown_item_1line);
                spin.setAdapter(sub);
                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        cls = spin.getSelectedItem().toString();
                        if (cls.equals("Marauder")) {
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            darkhealer mg = new darkhealer(01, 30, 50, 5, 5, 10, 10);
                            darkhealer mg1 = new darkhealer("darkhealer", 2, 2, 2, 2, 1, 4, 2, 3, 2);
                            lvln = Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.pdefinc()));
                            matk.setText(String.valueOf(mg.getBmatk() + (mg1.getLvl() * .5)));
                            mdef.setText(String.valueOf(mg.getBmdef() + (mg1.getLvl() * .5)));
                        } else {
                            a.setVisibility(View.GONE);
                            b.setVisibility(View.GONE);
                            c.setVisibility(View.GONE);
                            d.setVisibility(View.GONE);
                            darkhealer mg = new darkhealer(01, 30, 30, 5, 5, 10, 10);
                            darkhealer mg1 = new darkhealer("darkhealer", 2, 2, 2, 2, 1, 2, 2, 4, 1);
                            lvln = Double.parseDouble(lvl.getText().toString());
                            mg1.setLvl(lvln);
                            hp.setText(String.valueOf(mg1.hpinc()));
                            mp.setText(String.valueOf(mg1.mpinc()));
                            str.setText(String.valueOf(mg1.strinc()));
                            agi.setText(String.valueOf(mg1.agiinc()));
                            intt.setText(String.valueOf(mg1.agiinc()));
                            patk.setText(String.valueOf(mg1.patkinc()));
                            pdef.setText(String.valueOf(mg1.pdefinc()));
                            matk.setText(String.valueOf(mg.getBmatk() + (mg1.getLvl() * .5)));
                            mdef.setText(String.valueOf(mg.getBmdef() + (mg1.getLvl() * .5)));
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }
        }
}
