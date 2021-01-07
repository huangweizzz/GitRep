package com.ssm.utils;

import com.alibaba.excel.EasyExcel;
import com.ssm.beans.DemoData;

import java.util.ArrayList;
import java.util.List;

public class ExcelExport {


    public void writeExcel() {
        String filePath = "D:\\PersonInfo.xlsx";//输出的文件路径
        EasyExcel.write(filePath, DemoData.class).sheet("个人信息").doWrite(writeData());
    }

    //生成10条数据
    public List<DemoData> writeData() {
        List<DemoData> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            DemoData data = new DemoData(); //一个对象代表一行doWrite接受一个List集合
            data.setName("张三" + i);
            data.setAge(15 + i);
            list.add(data);
        }
        return list;
    }

}
