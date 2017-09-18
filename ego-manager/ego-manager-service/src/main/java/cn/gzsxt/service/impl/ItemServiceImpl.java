package cn.gzsxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gzsxt.mapper.TbItemMapper;
import cn.gzsxt.pojo.TbItem;
import cn.gzsxt.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long id) throws Exception {
		TbItem item = null;
		try {
			item = itemMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
		}
		
		return item;
	}
}
