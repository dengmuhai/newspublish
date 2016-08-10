package com.boy.xjz.test;

import java.util.Date;

import org.junit.Test;

import com.boy.dao.impl.NewsDao;
import com.boy.models.Category;
import com.boy.models.News;

public class NewsDaoTest {
	@Test
	public void newsAdd() {
		News n = new News();
		Category category = new Category();
		category.setCname("���ְ���");
		category.setTopid(1);
		n.setCategory(category);
		String title= "���ѧ����¥:�����ò���ѧλ֤�������Ҳ�������";
		n.setTitle(title);
		String content = "�ϲ���ѧ�ڷ������³��м�ơ��ϴ󡱣�������������顣���������ơ��ϴ󡱣��ڸ��³̷�����ļ������������������飬�漰��ҹ��ڸ�У�����У��Ͼ���ѧУ�ѵķ��������Ϊǿ�ҡ�����2014�꣬����������׼�ġ��Ͼ���ѧ�³̡����ߵ�ѧУ�³̺�׼���37�ţ��ڵ�һ������ĵڶ�����д����ѧУ����Ϊ�Ͼ���ѧ������ϴ󡣡���7��4��������������";

		n.setContent(content);
		n.setCreatetime(new Date());
	
		NewsDao nd = new NewsDao();
		for(int i=0;i<278;i++)
			nd.save(n);
	}
}
