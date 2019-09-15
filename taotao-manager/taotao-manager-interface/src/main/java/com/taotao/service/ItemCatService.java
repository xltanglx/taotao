package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {
    //根据父节点ID来查询树形结构，因为是懒加载，即最开始只显示第一级目录，
    // 只有当点击下一级目录的时候才会去查询第二级目录的内容
    List<EasyUITreeNode> getItemCatList(long parentId);
}
