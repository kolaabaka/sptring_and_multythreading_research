CREATE TABLE CoinCourse (
    id serial primary key,
    coinId INTEGER NOT NULL,
    course VARCHAR(30),
    FOREIGN KEY (coinId) REFERENCES Coinname(id)
);