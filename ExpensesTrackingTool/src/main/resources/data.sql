insert ignore into Users(username,password,user_role,creator_id,updator_id,createdOn) values('srinvias','1234','S','1',null,now());
insert ignore into Expense_Types(name,creator_id,updator_id,createdOn) values('Seeds','1',null,now()),('Pesticides','1',null,now()),('Fertilizers','1',null,now()),('Transportation','1',null,now()),('Land Preparation','1',null,now());
insert into farmer_land_mapping(farmer_name,Land_Details,AreaOfLand,Season) values('ramesh','test1',6,'raniy');
insert into crop_information(cropName,`Description`,farm_id) values('cotton','sf',1);
insert into billing_information(BillerName,billNo,billDate,`Description`) values('Test','123','2018-01-18','Test');
insert into billing_information(BillerName,billNo,billDate,`Description`) values('Test 112','12','2018-01-18','Test');