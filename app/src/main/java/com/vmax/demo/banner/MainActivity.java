package com.vmax.demo.banner;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.vmax.android.ads.api.VmaxAdView;


/**Its Recommended To Use VMAX plugin For Android Studio To Add Your Dependencies
 and Manage Changes in AndroidManifest as Well as Proguard,
 However You Can Manually Do This By Referring To Our Documentation Or following this Demo Project  */


public class MainActivity extends AppCompatActivity {


    VmaxAdView vmaxAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vmaxAdView=(VmaxAdView)findViewById(R.id.banner_adview);

/** Please Check The Layout activity_main To Find The Implementation*/
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    vmaxAdView.onDestroy();
    }
}
