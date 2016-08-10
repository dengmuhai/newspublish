DROP DATABASE IF EXISTS newspublish;
CREATE DATABASE newspublish;
DROP TABLE IF EXISTS manager;
CREATE TABLE manager(
	aid INT PRIMARY KEY AUTO_INCREMENT,#����
	account VARCHAR(20) NOT NULL,##��½�˻�
	password VARCHAR(20) NOT NULL,#��½����
	realname VARCHAR(50),#��ʵ����
	logincount INT NOT NULL#��½���� 
);
DROP TABLE IF EXISTS category;
CREATE TABLE category(#
	cid INT PRIMARY KEY AUTO_INCREMENT,#����id
	cname VARCHAR(50) NOT NULL,#��������
	topid INT
);
DROP TABLE IF EXISTS news;
CREATE TABLE news(
	nid INT PRIMARY KEY AUTO_INCREMENT,#���
	title VARCHAR(100) NOT NULL,#����
	content VARCHAR(255) NOT NULL,#����
	createtime DATETIME,#���ŷ�������
	cid INT,#���id
	CONSTRAINT C_N_FK FOREIGN KEY(cid) REFERENCES category(cid)
);
DROP TABLE IF EXISTS hotnews;
CREATE TABLE hotnews(
	hid INT PRIMARY KEY AUTO_INCREMENT,#��������id
	title VARCHAR(100) NOT NULL,	#����
	content VARCHAR(255) NOT NULL,#����
	createtime DATETIME,#���ŷ�������
	hsign INT NOT NULL #���ͱ�ʾ 1�ǹ���������2����������
);


