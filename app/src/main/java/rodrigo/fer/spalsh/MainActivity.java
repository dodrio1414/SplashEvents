package rodrigo.fer.spalsh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_top);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_bot);


        LinearLayout linear1=findViewById(R.id.linear1);
        LinearLayout linear2=findViewById(R.id.linear2);
        TextView txt_nameComp=findViewById(R.id.txt_nameComp);
        ImageView img_logo=findViewById(R.id.img_logo);


        img_logo.setAnimation(animacion1);
        txt_nameComp.setAnimation(animacion2);
        linear1.setAnimation(animacion2);
        linear2.setAnimation(animacion2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        },4000);

    }
}