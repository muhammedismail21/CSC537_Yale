package com.example.ismail.wowlockout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView dungeonsListTV ;
    String [] normalDungeons ;
    String [] heroicDungeons;
    String [] mythicDungeons;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normalDungeons = new String[]{"normal1","normal2","normal3","normal4","normal5","normal6","normal7","normal8","normal9","normal10"};
        heroicDungeons= new  String[]{"heroic1","heroic2","heroic3","heroic4","heroic5","heroic6","heroic7","heroic8","heroic9","heroic10"};
        mythicDungeons = new  String[]{"mythic1","mythic2","mythic3","mythic4","mythic5","mythic6","mythic7","mythic8","mythic9","mythic10"};

        dungeonsListTV = (TextView)this.findViewById(R.id.dungeonsListTV);
    }
    //fragments
    private void print(String dungeonName)
    {
        String val = "";
        String [] dungeonsList = {"<no-dungeons>"};
        switch (dungeonName)
        {
            case "normal":
                dungeonsList = normalDungeons;
                break;
            case "heroic":
                dungeonsList = heroicDungeons;
                break;
            case "mythic":
                dungeonsList = mythicDungeons;
                break;
            default:
                return;
        }
        for(int i=0;i<10;i++)
        {
            val += dungeonsList[i] + "\n";
        }
        dungeonsListTV.setText(val);
    }
    public void mythicButtonPressed(View v)
    {
        print("mythic");
        //dungeonsListTV.setText("Mythic");
    }
    public void heroicButtonPressed(View v)
    {
        print("heroic");
        //dungeonsListTV.setText("Heroic");
    }
    public void normalButtonPressed(View v)
    {
        print("normal");
        //dungeonsListTV.setText("Normal");
    }
}
