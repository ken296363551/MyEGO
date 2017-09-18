package cn.gzsxt.service;

import cn.gzsxt.pojo.TbItem;

public interface ItemService {
	// 根据id查询商品信息
	public TbItem getItemById(long itemId) throws Exception;
}
