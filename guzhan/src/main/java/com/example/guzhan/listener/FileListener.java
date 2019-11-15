package com.example.guzhan.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.guzhan.model.ExcelTeacherModel;
import com.example.guzhan.service.DeptService;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>created at 2019/11/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class FileListener extends AnalysisEventListener<ExcelTeacherModel> {
//    private DeptService deptService;

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    private List<ExcelTeacherModel> list = new ArrayList<>();

    // spring中提供了初始化方法，实现此方法。  编写初始化类，在初始化类中对listener进行赋值
    private static DeptService deptService;

    public static DeptService getDeptService() {
        return deptService;
    }

    public static void setLocationService(DeptService deptService) {
        FileListener.deptService = deptService;
    }


    // 一种方式是从controller把service带过来
    public FileListener(DeptService deptService) {
        super();
        this.deptService = deptService;
    }

    @Override
    public void invoke(ExcelTeacherModel data, AnalysisContext context) {
//        log.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();
//        log.info("所有数据解析完成！");
    }

    private void saveData() {
        list.forEach(excelTeacherModel -> {
//            teacherService.saveTeacher(teacherModel);
        });
    }

}
