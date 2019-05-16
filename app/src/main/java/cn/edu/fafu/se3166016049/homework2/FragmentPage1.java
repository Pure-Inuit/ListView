package cn.edu.fafu.se3166016049.homework2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FragmentPage1 extends Fragment {

    ListView list;
    private ArrayList<Map<String, Object>> mData = new ArrayList<Map<String, Object>>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        list = (ListView) view.findViewById(R.id.list);

        Students_Info_DB students_info_db = new Students_Info_DB(getActivity(), "students_info_db", null, 1);
        SQLiteDatabase db = students_info_db.getWritableDatabase();
        Cursor cursor = db.query("students_info", new String[]{"student_id", "student_name", "student_image"}, null, null, null, null, null);
        //利用游标遍历所有数据对象
        while(cursor.moveToNext()){
            String student_id = cursor.getString(cursor.getColumnIndex("student_id"));
            String student_name = cursor.getString(cursor.getColumnIndex("student_name"));
            int student_image = cursor.getInt(cursor.getColumnIndex("student_image"));
            if("3166016046".equals(student_id))
                break;
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("studentID", student_id);
            item.put("head_sculpture", student_image);
            item.put("studentName", student_name);
            if (!mData.contains(item))
                mData.add(item);
        }

        TestSimpleAdapter adapter = new TestSimpleAdapter(getActivity(), mData, R.layout.testitem,
                new String[]{"studentID", "head_sculpture", "studentName"}, new int[]{R.id.textView, R.id.imageView, R.id.textView2});
        adapter.setDB(db);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        toNewActivity(position);
                    }
                }
        );
        list.setAdapter(adapter);

        return view;
    }

    private void toNewActivity(int position){
        Intent intent;
        intent = new Intent(getActivity(),StudentInfo.class);

        intent.putExtra("position", position);
        startActivity(intent);
    }

}