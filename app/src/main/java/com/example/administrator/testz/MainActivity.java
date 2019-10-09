package com.example.administrator.testz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MHS_SeekBar id_mcl_seekbar_valume;
    private EQ_SeekBar id_mvs_equalizer_one_1;
    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        id_mcl_seekbar_valume = (MHS_SeekBar) findViewById(R.id.id_mcl_seekbar_valume);
        id_mvs_equalizer_one_1 = (EQ_SeekBar) findViewById(R.id.id_mvs_equalizer_one_1);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);

        id_mcl_seekbar_valume.setProgressMax(100);
        id_mvs_equalizer_one_1.setProgressMax(100);

        id_mcl_seekbar_valume.setOnSeekBarChangeListener(new MHS_SeekBar.OnMSBSeekBarChangeListener() {
            @Override
            public void onProgressChanged(MHS_SeekBar mhs_SeekBar, int progress, boolean fromUser) {
                tv1.setText(fromUser+", " + progress);
            }
        });

        id_mvs_equalizer_one_1.setOnSeekBarChangeListener(new EQ_SeekBar.OnMSBEQSeekBarChangeListener() {
            @Override
            public void onProgressChanged(EQ_SeekBar mvs_SeekBar, int progress, boolean fromUser) {
                tv2.setText(fromUser+", " + progress);
            }
        });


    }
}
