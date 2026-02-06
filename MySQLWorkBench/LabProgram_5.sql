USE studentdb;
INSERT INTO MarkList VALUES (101, 'John', '85', '90', '88', 'Pass');
INSERT INTO MarkList VALUES (102, 'goutham', '85', '90', '88', 'fail');
INSERT INTO MarkList VALUES (103, 'sravan', '854', '940', '858', 'Pass');
SELECT * FROM MarkList;

DELETE FROM MarkList WHERE regno = 102;