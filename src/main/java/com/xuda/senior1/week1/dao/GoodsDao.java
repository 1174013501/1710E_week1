package com.xuda.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.xuda.senior1.week1.entity.Brand;
import com.xuda.senior1.week1.entity.Goods;
import com.xuda.senior1.week1.entity.Goodskind;

public interface GoodsDao {

	// 列表
	List<Goods> selectgoods(Goods goods);

	// 详情
	Goods selectgood(@Param("g") Goods goods);

	// 品牌
	List<Brand> selectbrand();

	// 类型
	List<Goodskind> selectType();

	// 添加
	int addGoods(Goods goods);

	// 修改
	int update(Goods goods);

	@Update("update tb_goods set del=0 where id=#{id}")
	int del(Goods goods);

}
