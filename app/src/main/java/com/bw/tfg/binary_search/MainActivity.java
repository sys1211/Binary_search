package com.bw.tfg.binary_search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et1;
    private Button bt;
    private int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }
    private TextView tv;
    private void initview() {
        tv= (TextView) findViewById(R.id.tv);
        et1= (EditText) findViewById(R.id.et1);

        bt= (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);

    }



    public int zheban(int[] nums, int min, int max, int i){

        if(min>max){

            return -1;

        }else{
            int mid=(min+max)/2;
            sum++;
            if(nums[mid]==i){

                return mid;
            }else {
                if (nums[mid]<i){

                    return zheban(nums,mid+1,max,i);
                }else {

                    return zheban(nums,min,mid-1,i);
                }
            }

        }
    }

    @Override
    public void onClick(View v) {

        int[] nums={0,1,2,3,4,5,6,7,8,9};
        int num=Integer.parseInt(et1.getText().toString());
        zheban(nums,0,9,num);
        String str= String.valueOf(sum);
        tv.setText(str);
    }
}
