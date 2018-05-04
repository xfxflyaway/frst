package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.simpleway.frst.controller.SmAreaController;
import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.mapper.SmAreaMapper;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.util.SequenceUtil;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiongfeixiang
 * @title AreaTest
 * @date 2017/10/10 21:21
 * @since v1.0.0
 */
@WebAppConfiguration
public class AreaTest extends BaseTest {
    @Resource
    SmAreaController controller;

    @Resource
    SmAreaMapper areaMapper;


    @Test
    public void pageTest() throws Exception {
        JsonResult result = controller.getListById(-1L);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void inputTest() throws Exception {

        String json = "{\"area\":[\"渝中区\",\"大渡口区\",\"江北区\",\"南岸区\",\"北碚区\",\"渝北区\",\"巴南区\",\"长寿区\",\"双桥区\",\"沙坪坝区\",\"万盛区\",\"万州区\",\"涪陵区\",\"黔江区\",\"永川区\",\"合川区\",\"江津区\",\"九龙坡区\",\"南川区\",\"綦江县\",\"潼南县\",\"荣昌县\",\"璧山县\",\"大足县\",\"铜梁县\",\"梁平县\",\"开县\",\"忠县\",\"城口县\",\"垫江县\",\"武隆县\",\"丰都县\",\"奉节县\",\"云阳县\",\"巫溪县\",\"巫山县\",\"石柱土家族自治县\",\"秀山土家族苗族自治县\",\"酉阳土家族苗族自治县\",\"彭水苗族土家族自治县\",\"其他\"]}";

        Map m = JSON.parseObject(json, Map.class);

        Long id = SequenceUtil.getSeqId();
        SmArea area = new SmArea();
        area.setAreaName("重庆市");
        area.setUpperAreaId(0L);
        area.setAreaId(id);
        areaMapper.insert(area);

        for (Object o : m.keySet()) {
            JSONArray array = (JSONArray) m.get(o);
            List<String> list = array.toJavaList(String.class);
            System.out.println();
            list.forEach(s -> {
                SmArea a = new SmArea();
                a.setAreaId(SequenceUtil.getSeqId());
                a.setAreaName(s);
                a.setUpperAreaId(id);
                areaMapper.insert(a);
            });

        }

        System.out.println(m);
    }


}
