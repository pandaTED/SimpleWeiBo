package cn.panda.base.dao;
/**
 * 
 * @author panda
 *	增删改查
 */
public interface BaseDao<T> {
	//clazz
	
	Class clazz = null;
	
	//增
		void add(Class clazz);
	//删
		void delete(Long id);
	//改
		void update(Class clazz);
	//查
		void findById(Long id);
	
}
