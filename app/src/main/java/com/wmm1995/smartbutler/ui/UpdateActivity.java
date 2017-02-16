package com.wmm1995.smartbutler.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.wmm1995.smartbutler.R;

import java.io.File;

import static com.wmm1995.smartbutler.R.id.number_progress_bar;
import static com.wmm1995.smartbutler.R.id.tv_size;

/**
 * Created by Administrator on 2017/2/15.
 * 下载
 * 暂时有些手机不能下载，无写入sd卡的权限
 * TODO 加入6.0运行时权限，找出写入sd卡的权限问题
 */

public class UpdateActivity extends BaseActivity {

//    //正在下载
//    public static final int HANDLER_LOADING = 10001;
//    //下载完成
//    public static final int HANDLER_OK = 10002;
//    //下载失败
//    public static final int HANDLER_NO = 10003;
//
//    private TextView tv_size;
//    private String url;
//    private String path;//文件地址
//
//    //进度条
//    private NumberProgressBar number_progress_bar;
//
//    private Handler handler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            switch (msg.what) {
//                case HANDLER_LOADING:
//                    //实时更新进度
//                    Bundle bundle = msg.getData();
//                    long transferredBytes = bundle.getLong("transferredBytes");
//                    long totalSize = bundle.getLong("totalSize");
//                    tv_size.setText(transferredBytes + "/" + totalSize);
//                    //设置进度
//                    number_progress_bar.setProgress((int) (((float) transferredBytes / (float) totalSize) * 100));
//                    break;
//                case HANDLER_OK:
//                    tv_size.setText("下载成功");
//                    //启动应用安装
//                    startInstallApk();
//                    break;
//                case HANDLER_NO:
//                    tv_size.setText("下载失败");
//                    break;
//            }
//        }
//    };
//
//    //启动安装apk
//    private void startInstallApk() {
//        Intent i = new Intent();
//        i.setAction(Intent.ACTION_VIEW);
//        i.addCategory(Intent.CATEGORY_DEFAULT);
//        i.setDataAndType(Uri.fromFile(new File(path)), "application/vnd.android.package-archive");
//        startActivity(i);
//        finish();
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

//        initView();
    }

//    //初始化
//    private void initView() {
//        tv_size = (TextView) findViewById(tv_size);
//        number_progress_bar = (NumberProgressBar) findViewById(number_progress_bar);
//        number_progress_bar.setMax(100);
//
//        path = FileUtils.getSDCardPath() + "/" + System.currentTimeMillis() + ".apk";
//
//        //获取下载地址
//        url = getIntent().getStringExtra("url");
////        Toast.makeText(this, url, Toast.LENGTH_SHORT).show();
//        if (!TextUtils.isEmpty(url)) {
//            //下载
//            RxVolley.download(path, url, new ProgressListener() {
//                @Override
//                public void onProgress(long transferredBytes, long totalSize) {
//                    Message msg = new Message();
//                    msg.what = HANDLER_LOADING;
//                    Bundle bundle = new Bundle();
//                    bundle.putLong("transferredBytes", transferredBytes);
//                    bundle.putLong("totalSize", totalSize);
//                    msg.setData(bundle);
//                    handler.sendMessage(msg);
//                }
//            }, new HttpCallback() {
//                @Override
//                public void onSuccess(String t) {
//                    handler.sendEmptyMessage(HANDLER_OK);
//                }
//
//                @Override
//                public void onFailure(VolleyError error) {
//                    handler.sendEmptyMessage(HANDLER_NO);
//                }
//            });
//        }
//    }
}
