package com.fanshao.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.fanshao.demo.databinding.DemoActivityBootstrapBinding;
import com.fanshao.demo.util.LogUtil;

public class BootstrapActivity extends Activity implements View.OnClickListener {

    private DemoActivityBootstrapBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DemoActivityBootstrapBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        initView();
    }

    private void initView() {
        binding.tvDemoWebView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (binding.tvDemoWebView.equals(view)) {
            LogUtil.e("--------------");
            LogUtil.e("--------------");
        }
    }
}
