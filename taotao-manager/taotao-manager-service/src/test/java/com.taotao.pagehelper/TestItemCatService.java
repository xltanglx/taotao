package com.taotao.pagehelper;

import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestItemCatService {

    @Test
    public void testGetItemCatList() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemCatMapper itemCatMapper = applicationContext.getBean(TbItemCatMapper.class);
//      根据父节点ID查询子节点列表
        TbItemCatExample example = new TbItemCatExample();
//      设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
//      设置parentId
        criteria.andParentIdEqualTo(0l);
//      执行查询
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        for (TbItemCat itemCat : list) {
            System.out.println(itemCat.getId() + " " + itemCat.getName() + " " + itemCat.getIsParent());
        }
    }
}
