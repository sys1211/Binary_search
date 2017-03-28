package com.bw.tfg.binary_search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }
    private TextView tv;
    private void initview() {
        tv= (TextView) findViewById(R.id.tv);
        MainActivity mainActivity=new MainActivity();
        int[] nums={0,1,2,3,4,5,6,7,8,9};
        String str= String.valueOf(mainActivity.zheban(nums,0,9,7));
        tv.setText(str);
    }
    public int zheban(int[] nums, int min, int max, int i){
        if(min>max){
            return -1;
        }else{
            int mid=(min+max)/2;
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
}
