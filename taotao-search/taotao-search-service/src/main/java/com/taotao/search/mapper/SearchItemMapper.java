package com.taotao.search.mapper;

import com.taotao.common.pojo.SearchItem;

import java.util.List;

public interface SearchItemMapper {
    // 获取要导入到索引库中的数据
    List<SearchItem> getSearchItemList();

    // 通过商品ID查询商品详情
    SearchItem getItemById(long itemId);
}
