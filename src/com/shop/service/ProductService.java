package com.shop.service;

import java.util.List;

import com.shop.model.Product;

public interface ProductService {
	
	//根据二级分类查询商品
	public List<Product> findByCsid(Integer csid, Integer page);

	//根据一级分类查询商品
	public List<Product> findByCid(Integer cid,Integer page);
	
	//查找最热的商品10条
	public List<Product> findHot();
	
	//查找最新的商品10条
	public List<Product> findNew();

	//根据商品的pid的值查询商品
	public Product findByPid(Integer pid);
	
	//返回一级有多少页的数据
	public Integer CountPageProductFromCategory(Integer cid);

	//返回二级分类下游多少的数据
	public Integer CountPageProductFromCategorySecond(Integer csid);

}
