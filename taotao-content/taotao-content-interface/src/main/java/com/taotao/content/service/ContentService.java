package com.taotao.content.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

import java.util.List;

public interface ContentService {

    // 获取内容列表
    // 此内容列表中不包含tb_content表的content字段
    // 我们在查询内容列表的时候由于并不需要显示内容，而内容可能是非常庞大的，如果把内容字段也一并查询出来的话，那么必定是很消耗性能。
    EasyUIDataGridResult getContentList(long categoryId, int page, int rows);

    // 添加内容
    TaotaoResult addContent(TbContent content);

    //修改内容
    TaotaoResult updateContent(TbContent content);

    //删除内容
    TaotaoResult deleteContent(String ids);

    // 得到content字段的内容
    // 因为要修改内容的时候，要把content字段的内容回显到富文本编辑器
    TaotaoResult getContent(long id);

    // 根据内容分类id来获取内容列表
    List<TbContent> getContentListByCid(long cid);
}
