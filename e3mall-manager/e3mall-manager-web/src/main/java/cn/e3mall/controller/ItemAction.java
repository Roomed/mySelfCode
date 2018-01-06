package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.IItemService;

@Controller
public class ItemAction {
	@Autowired
	private IItemService itemService;
	@RequestMapping("list/{id}")
	@ResponseBody
	public TbItem queryById(@PathVariable("id") long id){
		 TbItem queryById = itemService.queryById(id);
		return queryById;
		
	} 
}
