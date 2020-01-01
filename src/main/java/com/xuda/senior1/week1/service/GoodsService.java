package com.xuda.senior1.week1.service;

import java.util.List;

import com.xuda.senior1.week1.entity.Brand;
import com.xuda.senior1.week1.entity.Goods;
import com.xuda.senior1.week1.entity.Goodskind;

public interface GoodsService {

	// 列表
	List<Goods> selectgoods(Goods goods);

	// 详情
	Goods selectgood(Goods goods);

	// 品牌
	List<Brand> selectbrand();

	// 类型
	List<Goodskind> selectType();

	// 添加
	int addGoods(Goods goods);

	// 修改
	int update(Goods goods);

	// 删除
	int del(Goods goods);

}
