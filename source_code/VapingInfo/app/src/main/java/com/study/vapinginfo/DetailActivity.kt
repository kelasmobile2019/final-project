package com.study.vapinginfo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
//import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_vape.*

class DetailActivity : AppCompatActivity() {

    companion object {
        val PHOTO_KEY = "PHOTO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val vapor = intent?.getParcelableExtra(PHOTO_KEY) as Vapor

        val imgPhoto: ImageView = findViewById(R.id.img_items)
        Glide.with(this)
            .load(vapor.photo)
            .apply(RequestOptions().transform(RoundedCorners(100)))
            .into(imgPhoto)

        tv_item_name.setText(vapor.name)
        tv_item_detail.setText(vapor.details)
    }
}
