INSERT INTO genres (id, name) VALUES (1, 'RPG');
INSERT INTO genres (id, name) VALUES (2, 'Action');
INSERT INTO genres (id, name) VALUES (3, 'Puzzle');

INSERT INTO platforms (id, name) VALUES (1, 'PC');
INSERT INTO platforms (id, name) VALUES (2, 'PS5');
INSERT INTO platforms (id, name) VALUES (3, 'Switch');

INSERT INTO games (id, title, rating, price, description) VALUES (1, 'Elden Ring', 9.5, 59.99, 'Dark fantasy open world');
INSERT INTO games (id, title, rating, price, description) VALUES (2, 'Tetris Effect', 8.0, 29.99, 'Musical puzzle experience');
INSERT INTO games (id, title, rating, price, description) VALUES (3, 'God of War Ragnarok', 9.7, 69.99, 'Mythological action adventure');

INSERT INTO game_genre (game_id, genre_id) VALUES (1, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (1, 2);
INSERT INTO game_genre (game_id, genre_id) VALUES (2, 3);
INSERT INTO game_genre (game_id, genre_id) VALUES (3, 2);

INSERT INTO game_platform (game_id, platform_id) VALUES (1, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (1, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (3, 2);

INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'USER');

INSERT INTO users (id, username, password) VALUES (1, 'admin', '{noop}admin123');
INSERT INTO users (id, username, password) VALUES (2, 'user1', '{noop}user123');

INSERT INTO role_user (user_id, role_id) VALUES (1, 1);
INSERT INTO role_user (user_id, role_id) VALUES (2, 2);
