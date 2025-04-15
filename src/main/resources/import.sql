-- GENRES
INSERT INTO genres (id, name) VALUES (1, 'RPG');
INSERT INTO genres (id, name) VALUES (2, 'Action');
INSERT INTO genres (id, name) VALUES (3, 'Puzzle');
INSERT INTO genres (id, name) VALUES (4, 'Adventure');
INSERT INTO genres (id, name) VALUES (5, 'Shooter');
INSERT INTO genres (id, name) VALUES (6, 'Platformer');
INSERT INTO genres (id, name) VALUES (7, 'Horror');
INSERT INTO genres (id, name) VALUES (8, 'Racing');
INSERT INTO genres (id, name) VALUES (9, 'Simulation');
INSERT INTO genres (id, name) VALUES (10, 'Strategy');

-- PLATFORMS
INSERT INTO platforms (id, name) VALUES (1, 'PC');
INSERT INTO platforms (id, name) VALUES (2, 'PS5');
INSERT INTO platforms (id, name) VALUES (3, 'Switch');
INSERT INTO platforms (id, name) VALUES (4, 'Xbox Series X');
INSERT INTO platforms (id, name) VALUES (5, 'Mobile');
INSERT INTO platforms (id, name) VALUES (6, 'PS4');
INSERT INTO platforms (id, name) VALUES (7, 'Mac');
INSERT INTO platforms (id, name) VALUES (8, 'Steam Deck');

-- GAMES
INSERT INTO games (id, title, rating, price, description) VALUES (1, 'Elden Ring', 9.5, 59.99, 'Dark fantasy open world');
INSERT INTO games (id, title, rating, price, description) VALUES (2, 'Tetris Effect', 8.0, 29.99, 'Musical puzzle experience');
INSERT INTO games (id, title, rating, price, description) VALUES (3, 'God of War Ragnarok', 9.7, 69.99, 'Mythological action adventure');
INSERT INTO games (id, title, rating, price, description) VALUES (4, 'Hollow Knight', 9.0, 14.99, 'Challenging metroidvania platformer');
INSERT INTO games (id, title, rating, price, description) VALUES (5, 'The Witcher 3', 9.8, 39.99, 'Epic story-driven RPG');
INSERT INTO games (id, title, rating, price, description) VALUES (6, 'Overwatch 2', 8.5, 0.00, 'Team-based hero shooter');
INSERT INTO games (id, title, rating, price, description) VALUES (7, 'Celeste', 9.2, 19.99, 'Emotional pixel-perfect platformer');
INSERT INTO games (id, title, rating, price, description) VALUES (8, 'Resident Evil Village', 8.7, 49.99, 'First-person horror with action elements');
INSERT INTO games (id, title, rating, price, description) VALUES (9, 'Gran Turismo 7', 8.8, 69.99, 'Realistic racing simulation');
INSERT INTO games (id, title, rating, price, description) VALUES (10, 'Stardew Valley', 9.4, 14.99, 'Charming farming simulator');
INSERT INTO games (id, title, rating, price, description) VALUES (11, 'Civilization VI', 9.0, 29.99, 'Turn-based global strategy');
INSERT INTO games (id, title, rating, price, description) VALUES (12, 'Hades', 9.6, 24.99, 'Roguelike action with rich storytelling');
INSERT INTO games (id, title, rating, price, description) VALUES (13, 'It Takes Two', 9.3, 39.99, 'Co-op platformer adventure');
INSERT INTO games (id, title, rating, price, description) VALUES (14, 'Among Us', 8.0, 4.99, 'Multiplayer social deduction game');
INSERT INTO games (id, title, rating, price, description) VALUES (15, 'Minecraft', 9.5, 26.95, 'Sandbox creativity and survival');
INSERT INTO games (id, title, rating, price, description) VALUES (16, 'Fortnite', 8.3, 0.00, 'Battle royale shooter and builder');
INSERT INTO games (id, title, rating, price, description) VALUES (17, 'Animal Crossing: New Horizons', 8.9, 59.99, 'Social sim on an island paradise');
INSERT INTO games (id, title, rating, price, description) VALUES (18, 'Inside', 8.6, 19.99, 'Dark minimalist puzzle platformer');
INSERT INTO games (id, title, rating, price, description) VALUES (19, 'Portal 2', 9.7, 9.99, 'Brilliant puzzle game with physics');
INSERT INTO games (id, title, rating, price, description) VALUES (20, 'Dead Cells', 9.1, 24.99, 'Roguelite action platformer');
INSERT INTO games (id, title, rating, price, description) VALUES (21, 'League of Legends', 8.4, 0.00, 'Competitive online MOBA');
INSERT INTO games (id, title, rating, price, description) VALUES (22, 'The Legend of Zelda: BOTW', 9.9, 59.99, 'Expansive open-world adventure');
INSERT INTO games (id, title, rating, price, description) VALUES (23, 'Flight Simulator', 8.7, 59.99, 'Ultra-realistic flight sim');

-- GAME_GENRE
INSERT INTO game_genre (game_id, genre_id) VALUES (1, 1), (1, 2);
INSERT INTO game_genre (game_id, genre_id) VALUES (2, 3);
INSERT INTO game_genre (game_id, genre_id) VALUES (3, 2), (3, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (4, 6), (4, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (5, 1), (5, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (6, 5);
INSERT INTO game_genre (game_id, genre_id) VALUES (7, 6), (7, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (8, 7), (8, 2);
INSERT INTO game_genre (game_id, genre_id) VALUES (9, 8), (9, 9);
INSERT INTO game_genre (game_id, genre_id) VALUES (10, 9), (10, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (11, 10);
INSERT INTO game_genre (game_id, genre_id) VALUES (12, 2), (12, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (13, 4), (13, 6);
INSERT INTO game_genre (game_id, genre_id) VALUES (14, 3), (14, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (15, 9), (15, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (16, 5), (16, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (17, 9), (17, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (18, 3), (18, 6);
INSERT INTO game_genre (game_id, genre_id) VALUES (19, 3), (19, 4);
INSERT INTO game_genre (game_id, genre_id) VALUES (20, 6), (20, 2);
INSERT INTO game_genre (game_id, genre_id) VALUES (21, 10), (21, 5);
INSERT INTO game_genre (game_id, genre_id) VALUES (22, 4), (22, 1);
INSERT INTO game_genre (game_id, genre_id) VALUES (23, 9), (23, 10);

-- GAME_PLATFORM
INSERT INTO game_platform (game_id, platform_id) VALUES (1, 1), (1, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (2, 1), (2, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (3, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (4, 1), (4, 3), (4, 7);
INSERT INTO game_platform (game_id, platform_id) VALUES (5, 1), (5, 2), (5, 6);
INSERT INTO game_platform (game_id, platform_id) VALUES (6, 1), (6, 4);
INSERT INTO game_platform (game_id, platform_id) VALUES (7, 1), (7, 3), (7, 7);
INSERT INTO game_platform (game_id, platform_id) VALUES (8, 1), (8, 2);
INSERT INTO game_platform (game_id, platform_id) VALUES (9, 2), (9, 4);
INSERT INTO game_platform (game_id, platform_id) VALUES (10, 1), (10, 3), (10, 5);
INSERT INTO game_platform (game_id, platform_id) VALUES (11, 1), (11, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (12, 1), (12, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (13, 1), (13, 2), (13, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (14, 1), (14, 3), (14, 5);
INSERT INTO game_platform (game_id, platform_id) VALUES (15, 1), (15, 3), (15, 5), (15, 7);
INSERT INTO game_platform (game_id, platform_id) VALUES (16, 1), (16, 3), (16, 4), (16, 5);
INSERT INTO game_platform (game_id, platform_id) VALUES (17, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (18, 1), (18, 3), (18, 7);
INSERT INTO game_platform (game_id, platform_id) VALUES (19, 1), (19, 7);
INSERT INTO game_platform (game_id, platform_id) VALUES (20, 1), (20, 3), (20, 8);
INSERT INTO game_platform (game_id, platform_id) VALUES (21, 1);
INSERT INTO game_platform (game_id, platform_id) VALUES (22, 3);
INSERT INTO game_platform (game_id, platform_id) VALUES (23, 1), (23, 7);


-- ROLES
INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'USER');

-- USERS
INSERT INTO users (id, username, password) VALUES (1, 'admin', '{noop}admin123');
INSERT INTO users (id, username, password) VALUES (2, 'user1', '{noop}user123');

-- ROLE_USER
INSERT INTO role_user (user_id, role_id) VALUES (1, 1);
INSERT INTO role_user (user_id, role_id) VALUES (2, 2);

