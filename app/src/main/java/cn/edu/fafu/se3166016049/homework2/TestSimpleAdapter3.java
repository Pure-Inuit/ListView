package cn.edu.fafu.se3166016049.homework2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import java.util.List;
import java.util.Map;

public class TestSimpleAdapter3 extends SimpleAdapter {
    private static int[] nums = {
            43,
            45,
            46,
            47,
            48,
            49,
            50,
            51
    };

    public TestSimpleAdapter3(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View localView = super.getView(position, convertView, parent);
        ImageView imgview = localView.findViewById(R.id.imageView);
        TextView txtview = localView.findViewById(R.id.textView);
        TextView txtview2 = localView.findViewById(R.id.textView2);

        if(nums[position] == 48) {

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(imgview.getLayoutParams());
            lp.setMargins(350, 30, 0, 0);
            imgview.setLayoutParams(lp);

            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(txtview.getLayoutParams());
            lp2.setMargins(640, 80, 0, 0);
            txtview.setLayoutParams(lp2);

            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(txtview2.getLayoutParams());
            lp3.setMargins(730, 150, 0, 0);
            txtview2.setLayoutParams(lp3);

        } else if (nums[position] % 2 == 1) {
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(imgview.getLayoutParams());
            lp.setMargins(100, 30, 0, 0);
            imgview.setLayoutParams(lp);

            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(txtview.getLayoutParams());
            lp2.setMargins(640, 80, 0, 0);
            txtview.setLayoutParams(lp2);

            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(txtview2.getLayoutParams());
            lp3.setMargins(730, 150, 0, 0);
            txtview2.setLayoutParams(lp3);

        } else {
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(imgview.getLayoutParams());
            lp.setMargins(700, 30, 0, 0);
            imgview.setLayoutParams(lp);

            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(txtview.getLayoutParams());
            lp2.setMargins(100, 80, 0, 0);
            txtview.setLayoutParams(lp2);

            RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(txtview2.getLayoutParams());
            lp3.setMargins(160, 150, 0, 0);
            txtview2.setLayoutParams(lp3);
        }

        return localView;
    }

}