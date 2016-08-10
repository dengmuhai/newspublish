package com.boy.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao {
	/**
	 * ͨ��dao�ӿ�
	 */
	/**
	 * �������
	 * @param obj
	 */
	<T> void save(T obj);
	/**
	 * ɾ������
	 * @param obj
	 */
	<T> void delete(T obj);
	/**
	 * ���¶���
	 * @param obj
	 */
	<T> void update(T obj);
	/**
	 * ����hql��ѯ����list
	 * @return
	 */
	<T> List<T> listByHql(String hql);
	/**
	 * ����HQL��ѯ����һ������
	 * @param hql
	 * @return
	 */
	<T> T oneByHql(String hql);
	/**
	 * ���ݳ־û���õ����ж���
	 * @param clazz
	 * @return
	 */
	<T> List<T> listBySessionGet(Class<T> clazz);
	/**
	 * ���ݳ־û����id�õ���һ������
	 * @param clazz
	 * @param id
	 * @return
	 */
	<T> T oneBySessionGet(Class<T> clazz,Serializable id);
	/**
	 * use hql remove a Object
	 * @param hql
	 */
	void deleteByHql(String hql);
}
