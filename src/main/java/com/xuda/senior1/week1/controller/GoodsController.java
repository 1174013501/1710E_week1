package com.xuda.senior1.week1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuda.senior1.week1.entity.Brand;
import com.xuda.senior1.week1.entity.Goods;
import com.xuda.senior1.week1.entity.Goodskind;
import com.xuda.senior1.week1.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService service;

	@RequestMapping("selectgoods")
	public String selectgoods(Model model, Goods goods, @RequestParam(defaultValue = "1") int pageNum) {
		// 分页
		PageHelper.startPage(pageNum, 4);

		// 查询数据
		List<Goods> list = service.selectgoods(goods);

		// 分页
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);

		model.addAttribute("g", goods);
		model.addAttribute("pg", pageInfo);
		model.addAttribute("list", list);

		return "list";
	}

	// 商品详情
	@RequestMapping("selectgood")
	public String selectgood(Model model, Goods goods) {

		// 查询数据
		goods = service.selectgood(goods);

		System.out.println(goods);
		model.addAttribute("g", goods);

		return "good";
	}

	// 去添加页面
	@RequestMapping("toadd")
	public String toadd() {
		return "add";
	}

	// 品牌
	@RequestMapping("selectbrand")
	@ResponseBody
	public List<Brand> selectbrand() {
		return service.selectbrand();
	}

	// 类型
	@RequestMapping("selectType")
	@ResponseBody
	public List<Goodskind> selectType() {
		return service.selectType();
	}
	
	
	// 添加
	@RequestMapping("add")
	@ResponseBody
	public int add(Goods goods) {
		return service.addGoods(goods);
	}
	
	// 去修改页面
	@RequestMapping("toupdate")
	public String toupdate(Goods goods,Model model) {
		
		model.addAttribute("g", service.selectgood(goods));
		
		return "update";
	}
	
	// 修改
	@RequestMapping("update")
	@ResponseBody
	public int update(Goods goods) {
		return service.update(goods);
	}
	
	// 删除
	@RequestMapping("del")
	@ResponseBody
	public int del(Goods goods) {
		return service.del(goods);
	}
}
