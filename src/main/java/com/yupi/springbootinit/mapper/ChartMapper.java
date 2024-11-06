package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author 13238
* @description 针对表【chat(图表信息表)】的数据库操作Mapper
* @createDate 2024-03-02 09:51:25
* @Entity com.yupi.springbootinit.model.entity.Chat
*/
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String,Object>> queryChartData(String quertSql);

    @Delete("delete from chart where id =#{id}")
    int deleteById(@Param("id")Long id);
}




