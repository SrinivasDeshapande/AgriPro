
create table Farmer_Land_Mapping(
	Farm_id int(11) auto_increment primary key,
	Farmer_Name varchar(255),
	Land_Details varchar(255),
	AreaOfLand int(11),
	SharePercentage int(11),
	Description varchar(1000),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp

	);

create table Inverstor_Information(
	inv_id int(11) auto_increment primary key,
	invName varchar(255),
	Amount double(11,4),
	DateOfInv datetime,
	Farm_id int(11),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp,
	CONSTRAINT `fk_farm` FOREIGN KEY (`Farm_id`) REFERENCES `Farmer_Land_Mapping` (`Farm_id`)
);

create table Users(
	user_id int(11) auto_increment primary key,
	username varchar(255),
	password varchar(255),
	user_role varchar(20),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp
);

create table Crop_Information(
	crop_id int(11) auto_increment primary key,
	CropName varchar(100),
	Description varchar(100),
	Farm_id int(11),
	
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp,
	CONSTRAINT `fk_farm1` FOREIGN KEY (`Farm_id`) REFERENCES `Farmer_Land_Mapping` (`Farm_id`)
);

create table Billing_Information(
	Bill_id int(11) auto_increment primary key,
	BillerName varchar(255),
	billDate date,
	Description varchar(1000),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp
);
create table Expense_Types(
	type_id int(11) auto_increment primary key,
	name varchar(255),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp
	);
	
	create table Expenses(
	Exp_id int(11) auto_increment primary key,
	Name varchar(200) ,
	type_id int(11),
	DateOfExp date,
	Quantity double(11,4),
	Rate double(11,4),
	Amount double(11,4),
	Discount double(11,4),
	Bill_id int(11),
	Description varchar(1000),
	crop_id int(11),
	Farm_id int(11),
	creator_id int(11),
	updator_id int(11),
	createdOn datetime,
	updatedOn timestamp default current_timestamp on update current_timestamp,
	 CONSTRAINT `fk_type` FOREIGN KEY (`type_id`) REFERENCES `Expense_Types` (`type_id`),
	 CONSTRAINT `fk_bill` FOREIGN KEY (`Bill_id`) REFERENCES `Billing_Information` (`Bill_id`),
	 CONSTRAINT `fk_crop` FOREIGN KEY (`crop_id`) REFERENCES `Crop_Information` (`crop_id`),
	 CONSTRAINT `fk_farm2` FOREIGN KEY (`Farm_id`) REFERENCES `Farmer_Land_Mapping` (`Farm_id`)
);

alter table Farmer_Land_Mapping  add column Season varchar(100) after AreaOfLand;
alter table Expense_Types add constraint uk unique (name);
alter table billing_information add column billNo int(11) after billerName;
