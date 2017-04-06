package com.neu.viking.chaptertwo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.neu.viking.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_chaptertwo_layout);
        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                //String input = editText.getText().toString();
                //Toast.makeText(MainActivity.this,input,Toast.LENGTH_SHORT).show();
                //imageView.setImageResource(R.drawable.img_2);
                //if (progressBar.getVisibility() == View.GONE) {
                //    progressBar.setVisibility(View.VISIBLE);
                //}
                //else {
                //    progressBar.setVisibility(View.GONE);
                //}
                //int progress = progressBar.getProgress();
                //progress += 10;
                //progressBar.setProgress(progress);
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("Something happened");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
            default:
                break;
        }

    }
}
