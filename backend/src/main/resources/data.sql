INSERT INTO tb_tracking (situation, location) VALUES ('Saiu para entrega', 'São Paulo');
INSERT INTO tb_tracking (situation, location) VALUES ('Aguardando', 'Santo André');
INSERT INTO tb_tracking (situation, location) VALUES ('Recebido', 'Mauá');

INSERT INTO tb_order (tracking_id) VALUES (1);
INSERT INTO tb_order (tracking_id) VALUES (2);
INSERT INTO tb_order (tracking_id) VALUES (3);