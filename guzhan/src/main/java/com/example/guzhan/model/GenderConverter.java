package com.example.guzhan.model;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

/**
 * <p>created at 2019/11/15</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class GenderConverter implements Converter<Integer> {
    // Converter 接口的泛型是指要转换的 Java 数据类型，与 supportJavaTypeKey 方法中的返回值类型一致
    public static final String MALE = "男";
    public static final String FEMALE = "女";

    @Override
    public Class supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public Integer convertToJavaData(CellData cellData, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        String stringValue = cellData.getStringValue();
        if (MALE.equals(stringValue)){
            return 1;
        }else {
            return 2;
        }
    }

    @Override
    public CellData convertToExcelData(Integer integer, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return null;
    }
}
