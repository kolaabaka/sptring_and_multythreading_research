CREATE TABLE CoinCourse (
    id INTEGER NOT NULL PRIMARY KEY,
    coinId INTEGER NOT NULL,
    course INTEGER,
    FOREIGN KEY (coinId) REFERENCES Coinname(id)
);