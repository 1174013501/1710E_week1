package com.xuda.senior1.week1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuda.senior1.week1.dao.GoodsDao;
import com.xuda.senior1.week1.entity.Brand;
import com.xuda.senior1.week1.entity.Goods;
import com.xuda.senior1.week1.entity.Goodskind;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsDao dao;

	// 列表
	public List<Goods> selectgoods(Goods goods) {
		return dao.selectgoods(goods);
	}

	// 详情
	public Goods selectgood(Goods goods) {
		return dao.selectgood(goods);
	}

	// 品牌
	public List<Brand> selectbrand() {
		return dao.selectbrand();
	}

	// 类型
	public List<Goodskind> selectType() {
		return dao.selectType();
	}

	// 添加
	public int addGoods(Goods goods) {
		return dao.addGoods(goods);
	}

	// 修改
	public int update(Goods goods) {
		return dao.update(goods);
	}

	// 删除
	public int del(Goods goods) {
		return dao.del(goods);
	}
	
}
