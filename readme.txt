使用mysql数据库 地址localhist 数据库密码123456
创建数据库yiibai
创建数据表
	CREATE TABLE `customer` (
	  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
	  `NAME` varchar(100) NOT NULL,
	  `AGE` int(10) unsigned NOT NULL,
	  PRIMARY KEY (`CUST_ID`)
	) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

	
	运行结果
	Customer [age=23, custId=3, name=yiibai2]