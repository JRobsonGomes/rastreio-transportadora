INSERT INTO tb_order (description) VALUES ('Pedido 01');
INSERT INTO tb_order (description) VALUES ('Pedido 02');
INSERT INTO tb_order (description) VALUES ('Pedido 03');

INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('São Paulo', TIMESTAMP WITH TIME ZONE '2020-11-02T09:00:00Z', 1, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('São Paulo', TIMESTAMP WITH TIME ZONE '2020-11-02T10:00:00Z', 2, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Santo André', TIMESTAMP WITH TIME ZONE '2020-11-02T11:00:00Z', 3, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Mauá', TIMESTAMP WITH TIME ZONE '2020-11-03T10:00:00Z', 3, 1);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Mauá', TIMESTAMP WITH TIME ZONE '2020-11-03T12:00:00Z', 4, 1);

INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Minas Gerais', TIMESTAMP WITH TIME ZONE '2020-10-10T11:00:00Z', 1, 2);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Minas Gerais', TIMESTAMP WITH TIME ZONE '2020-10-10T12:00:00Z', 2, 2);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Salvador', TIMESTAMP WITH TIME ZONE '2020-10-12T13:00:00Z', 3, 2);
INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Feira de Santana', TIMESTAMP WITH TIME ZONE '2020-10-13T11:00:00Z', 4, 2);

INSERT INTO tb_tracking (location, moment, status, order_id) VALUES ('Pernambuco', NOW(), 1, 3);