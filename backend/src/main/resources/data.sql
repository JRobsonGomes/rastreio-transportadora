INSERT INTO tb_order (description) VALUES ('Pedido 01');
INSERT INTO tb_order (description) VALUES ('Pedido 02');
INSERT INTO tb_order (description) VALUES ('Pedido 03');

INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('São Paulo', NOW(), 1, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('São Paulo', TIMESTAMP WITH TIME ZONE '2020-11-02T10:00:00Z', 2, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Santo André', TIMESTAMP WITH TIME ZONE '2020-11-02T11:00:00Z', 3, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Mauá', TIMESTAMP WITH TIME ZONE '2020-11-03T10:00:00Z', 3, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Mauá', TIMESTAMP WITH TIME ZONE '2020-11-03T12:00:00Z', 4, 1);