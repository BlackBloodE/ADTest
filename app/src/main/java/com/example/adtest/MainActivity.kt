package com.example.adtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AdMob 初始化
        MobileAds.initialize(this, getString(R.string.admob_app_id));

        // 橫幅廣告
        // 透過第 8 列的 import, 直接參照到 adView, 而不用再 findViewById
        adView.loadAd(AdRequest.Builder().build())
    }
}
