package com.taotao.search.dao;

import com.taotao.common.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;

public interface SearchDao {
    // 通过查询条件，查询商品，并将结果集添加到SearchResult
    // 注意：这只是对这个操作的一层封装
    SearchResult search(SolrQuery query) throws Exception;
}
