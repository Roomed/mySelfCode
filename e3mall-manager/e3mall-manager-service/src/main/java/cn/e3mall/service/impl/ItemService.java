package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.IItemService;
@Service
@Transactional
public class ItemService implements IItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem queryById(long id) {
		// TODO Auto-generated method stub
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
