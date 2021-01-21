-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 21 Oca 2021, 16:40:42
-- Sunucu sürümü: 10.4.17-MariaDB
-- PHP Sürümü: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `librarymanagementsystem`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author`
--

CREATE TABLE `author` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Address` text CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Phone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book`
--

CREATE TABLE `book` (
  `Id` int(11) NOT NULL,
  `BookName` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Category` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Author` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Publisher` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Contents` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `PageCount` int(11) NOT NULL,
  `EditionYear` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Status` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `lendbook`
--

CREATE TABLE `lendbook` (
  `Id` int(11) NOT NULL,
  `MemberId` int(11) NOT NULL,
  `MemberName` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `BookId` int(11) NOT NULL,
  `LendDate` date NOT NULL,
  `ReturnDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `member`
--

CREATE TABLE `member` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) COLLATE utf8_bin NOT NULL,
  `Address` varchar(255) COLLATE utf8_bin NOT NULL,
  `Phone` varchar(11) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `publisher`
--

CREATE TABLE `publisher` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Address` text CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Phone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `register`
--

CREATE TABLE `register` (
  `UserName` varchar(255) NOT NULL,
  `Password` int(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `returnbook`
--

CREATE TABLE `returnbook` (
  `Id` int(11) NOT NULL,
  `MemberId` int(11) NOT NULL,
  `MemberName` varchar(255) COLLATE utf8_bin NOT NULL,
  `BookName` varchar(255) COLLATE utf8_bin NOT NULL,
  `ReturnDate` varchar(255) COLLATE utf8_bin NOT NULL,
  `PassingDay` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `Id` int(11) NOT NULL,
  `UserName` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL,
  `Password` varchar(255) CHARACTER SET utf16 COLLATE utf16_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Id`) USING BTREE;

--
-- Tablo için indeksler `lendbook`
--
ALTER TABLE `lendbook`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `returnbook`
--
ALTER TABLE `returnbook`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `author`
--
ALTER TABLE `author`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `book`
--
ALTER TABLE `book`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `category`
--
ALTER TABLE `category`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `lendbook`
--
ALTER TABLE `lendbook`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `member`
--
ALTER TABLE `member`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `publisher`
--
ALTER TABLE `publisher`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `returnbook`
--
ALTER TABLE `returnbook`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `user`
--
ALTER TABLE `user`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
