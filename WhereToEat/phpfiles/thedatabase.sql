-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 11, 2017 at 02:22 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `thedatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `thetable`
--

CREATE TABLE `thetable` (
  `user_id` int(11) NOT NULL,
  `name` varchar(16) NOT NULL,
  `username` varchar(16) NOT NULL,
  `age` tinyint(4) NOT NULL,
  `password` varchar(200) NOT NULL,
  `aboutme` varchar(200) NOT NULL,
  `email` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thetable`
--

INSERT INTO `thetable` (`user_id`, `name`, `username`, `age`, `password`, `aboutme`, `email`) VALUES
(1, 'kennedy', 'bushido', 89, '11993377', 'funny sort of an', 'kennedylinzie@GM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `thetable`
--
ALTER TABLE `thetable`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `thetable`
--
ALTER TABLE `thetable`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
