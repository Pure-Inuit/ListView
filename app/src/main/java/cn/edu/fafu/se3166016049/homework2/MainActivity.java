package cn.edu.fafu.se3166016049.homework2;

import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

//    //学生数据
//    private String[] studentID = {          //学号
//            "3166016001",
//            "3166016002",
//            "3166016003",
//            "3166016004",
//            "3166016005",
//            "3166016006",
//            "3166016007",
//            "3166016008",
//            "3166016009",
//            "3166016010",
//            "3166016011",
//            "3166016012",
//            "3166016013",
//            "3166016014",
//            "3166016015",
//            "3166016016",
//            "3166016017",
//            "3166016018",
//            "3166016019",
//            "3166016020",
//            "3166016021",
//            "3166016022",
//            "3166016023",
//            "3166016024",
//            "3166016025",
//            "3166016026",
//            "3166016027",
//            "3166016028",
//            "3166016029",
//            "3166016030",
//            "3166016031",
//            "3166016032",
//            "3166016033",
//            "3166016034",
//            "3166016035",
//            "3166016036",
//            "3166016037",
//            "3166016038",
//            "3166016039",
//            "3166016040",
//            "3166016041",
//            "3166016042",
//            "3166016043",
//            "3166016044",
//            "3166016045",
//            "3166016046",
//            "3166016047",
//            "3166016048",
//            "3166016049",
//            "3166016050",
//            "3166016051",
//            "3166016052",
//            "3166016053",
//            "3166016054",
//            "3166016055",
//            "3166016056",
//            "3166016057",
//            "3166016058",
//            "3166016059",
//            "3166016060",
//            "3166016061",
//            "3166016062",
//            "3166016063",
//            "3166016064",
//            "3166016065",
//            "3166016066",
//            "3166016067",
//            "3166016068",
//            "3166016069",
//            "3166016070",
//            "3166016071",
//            "3166016072",
//            "3166016073",
//            "3166016074",
//            "3166016075",
//            "3166016076",
//            "3166016077",
//            "3166016078",
//            "3166016079",
//            "3166016080",
//            "3166016081",
//            "3166016082",
//            "3166016083",
//            "3166016084",
//            "3166016085",
//            "3166016086",
//            "3166016087",
//            "3166016088",
//            "3166016089",
//            "3166016090"
//    };
//    private String[] studentName = {        //名字
//            "江森伟",
//            "黄铭扬",
//            "郑浩海",
//            "兰信榕",
//            "林煊鸿",
//            "林善凯",
//            "肖宗鎏",
//            "游开钰",
//            "张宗锦",
//            "庄天任",
//            "林顺阳",
//            "温福良",
//            "林嘉辉",
//            "徐如婷",
//            "林宇航",
//            "陈宇锋",
//            "郑翔",
//            "陈诗航",
//            "陈家松",
//            "施文强",
//            "林泽辉",
//            "郭振弘",
//            "方和新",
//            "肖腾跃",
//            "方俊杰",
//            "黄东衡",
//            "陈振南",
//            "庄易鸿",
//            "吴甜甜",
//            "陈靖",
//            "吴悠",
//            "方正友",
//            "陈志鑫",
//            "蒋文维",
//            "吴念梅",
//            "陆朝标",
//            "柯登明",
//            "蒋绿波",
//            "白伟发",
//            "林湖钦",
//            "王彬城",
//            "刘诗殿",
//            "陈祥易",
//            "吴焰婷",
//            "吴嘉淮",
//            "林琦",
//            "陈景亮",
//            "张佳荣",
//            "陈亿强",
//            "叶仲彬",
//            "陈宏毅",
//            "刘键",
//            "郑鸣石",
//            "詹宸偈",
//            "刘洲才",
//            "林海韬",
//            "林岚良",
//            "李权辉",
//            "张瑾",
//            "罗宇",
//            "郑仁法",
//            "黄苏海",
//            "朱晟武",
//            "孙培杰",
//            "苏灏鑫",
//            "苏鸿杰",
//            "缪鸿潜",
//            "郑招阳",
//            "严禹林",
//            "丘伟长",
//            "江闻哲",
//            "郑金迪",
//            "郑庆",
//            "何育婷",
//            "李卓伟",
//            "周志文",
//            "俞有利",
//            "吴凯",
//            "陈良",
//            "陈立辉",
//            "林玮",
//            "陈达",
//            "林钰登",
//            "林伟雄",
//            "苏财杭",
//            "伍泽鑫",
//            "叶金昌",
//            "黄诚懿",
//            "邱顺平",
//            "雷欧鑫宇"
//    };
//    private int[] head_sculpture = {        //头像
//            R.drawable.head_sculpture1,
//            R.drawable.head_sculpture2,
//            R.drawable.head_sculpture3,
//            R.drawable.head_sculpture4,
//            R.drawable.head_sculpture5,
//            R.drawable.head_sculpture6,
//            R.drawable.head_sculpture7,
//            R.drawable.head_sculpture8,
//            R.drawable.head_sculpture9,
//            R.drawable.head_sculpture10,
//            R.drawable.head_sculpture11,
//            R.drawable.head_sculpture12,
//            R.drawable.head_sculpture13,
//            R.drawable.head_sculpture14,
//            R.drawable.head_sculpture15,
//            R.drawable.head_sculpture16,
//            R.drawable.head_sculpture17,
//            R.drawable.head_sculpture18,
//            R.drawable.head_sculpture19,
//            R.drawable.head_sculpture20,
//            R.drawable.head_sculpture21,
//            R.drawable.head_sculpture22,
//            R.drawable.head_sculpture23,
//            R.drawable.head_sculpture24,
//            R.drawable.head_sculpture25,
//            R.drawable.head_sculpture26,
//            R.drawable.head_sculpture27,
//            R.drawable.head_sculpture28,
//            R.drawable.head_sculpture29,
//            R.drawable.head_sculpture30,
//            R.drawable.head_sculpture31,
//            R.drawable.head_sculpture32,
//            R.drawable.head_sculpture33,
//            R.drawable.head_sculpture34,
//            R.drawable.head_sculpture35,
//            R.drawable.head_sculpture36,
//            R.drawable.head_sculpture37,
//            R.drawable.head_sculpture38,
//            R.drawable.head_sculpture39,
//            R.drawable.head_sculpture40,
//            R.drawable.head_sculpture41,
//            R.drawable.head_sculpture42,
//            R.drawable.head_sculpture43,
//            R.drawable.head_sculpture44,
//            R.drawable.head_sculpture45,
//            R.drawable.head_sculpture46,
//            R.drawable.head_sculpture47,
//            R.drawable.head_sculpture48,
//            R.drawable.head_sculpture49,
//            R.drawable.head_sculpture50,
//            R.drawable.head_sculpture51,
//            R.drawable.head_sculpture52,
//            R.drawable.head_sculpture53,
//            R.drawable.head_sculpture54,
//            R.drawable.head_sculpture55,
//            R.drawable.head_sculpture56,
//            R.drawable.head_sculpture57,
//            R.drawable.head_sculpture58,
//            R.drawable.head_sculpture59,
//            R.drawable.head_sculpture60,
//            R.drawable.head_sculpture61,
//            R.drawable.head_sculpture62,
//            R.drawable.head_sculpture63,
//            R.drawable.head_sculpture64,
//            R.drawable.head_sculpture65,
//            R.drawable.head_sculpture66,
//            R.drawable.head_sculpture67,
//            R.drawable.head_sculpture68,
//            R.drawable.head_sculpture69,
//            R.drawable.head_sculpture70,
//            R.drawable.head_sculpture71,
//            R.drawable.head_sculpture72,
//            R.drawable.head_sculpture73,
//            R.drawable.head_sculpture74,
//            R.drawable.head_sculpture75,
//            R.drawable.head_sculpture76,
//            R.drawable.head_sculpture77,
//            R.drawable.head_sculpture78,
//            R.drawable.head_sculpture79,
//            R.drawable.head_sculpture80,
//            R.drawable.head_sculpture81,
//            R.drawable.head_sculpture82,
//            R.drawable.head_sculpture83,
//            R.drawable.head_sculpture84,
//            R.drawable.head_sculpture85,
//            R.drawable.head_sculpture86,
//            R.drawable.head_sculpture87,
//            R.drawable.head_sculpture88,
//            R.drawable.head_sculpture89,
//            R.drawable.head_sculpture90
//    };

    private FragmentTabHost fragmentTabHost;
    private String texts[] = {"一班", "二班", "舍友"};
    private Class fragmentArray[] = {FragmentPage1.class, FragmentPage2.class, FragmentPage3.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化tabhost
        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(),
                R.id.maincontent);
        for (int i = 0; i < texts.length; i++) {
            TabHost.TabSpec spec = fragmentTabHost.newTabSpec(texts[i]).setIndicator(getView(i));
            fragmentTabHost.addTab(spec, fragmentArray[i], null);
            //设置背景(必须在addTab之后，由于需要子节点（底部菜单按钮）否则会出现空指针异常)
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.bt_selector);
        }


        //使用构造函数创建数据库
        Students_Info_DB students_info_db = new Students_Info_DB(MainActivity.this, "students_info_db", null, 1);
        SQLiteDatabase db = students_info_db.getWritableDatabase();

////        只需要跑一次将数据存储到数据库里，所以把代码注释起来
//        //插入数据
//        for (int i = 0; i < 90; i++) {
//            ContentValues values = new ContentValues();
//            values.put("student_id", studentID[i]);
//            values.put("student_name", studentName[i]);
//            values.put("student_image", head_sculpture[i]);
//
//            db.insert("students_info", null, values);
//        }

    }

    private View getView(int i) {
        //取得布局实例
        View view = View.inflate(MainActivity.this, R.layout.tabcontent, null);
        //取得布局对象
        TextView textView = (TextView) view.findViewById(R.id.text);
        //设置标题
        textView.setText(texts[i]);
        return view;
    }
}