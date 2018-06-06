-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2017 at 08:13 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hos_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment_accepted`
--

CREATE TABLE `appointment_accepted` (
  `time` varchar(50) NOT NULL,
  `day` varchar(50) NOT NULL,
  `Doctor` varchar(50) NOT NULL,
  `Applicant` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `appointment_applied`
--

CREATE TABLE `appointment_applied` (
  `time` varchar(50) NOT NULL,
  `day` varchar(50) NOT NULL,
  `Doctor` varchar(50) NOT NULL,
  `Applicant` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bloodbank_applied`
--

CREATE TABLE `bloodbank_applied` (
  `name` varchar(50) NOT NULL,
  `required_group` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodbank_applied`
--

INSERT INTO `bloodbank_applied` (`name`, `required_group`) VALUES
('Doctor1', 'A+'),
('tamim', 'A+');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(15) NOT NULL,
  `Id` int(10) NOT NULL,
  `password` varchar(12) DEFAULT NULL,
  `Acc_type` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `Id`, `password`, `Acc_type`) VALUES
('Admin', 10, 'Admin', 'Admin'),
('Doctor Strange', 47, '4747', 'Doctor'),
('Doctor Who', 48, '4848', 'Doctor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment_accepted`
--
ALTER TABLE `appointment_accepted`
  ADD UNIQUE KEY `Applicant` (`Applicant`);

--
-- Indexes for table `appointment_applied`
--
ALTER TABLE `appointment_applied`
  ADD UNIQUE KEY `Applicant` (`Applicant`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`,`Id`),
  ADD KEY `username` (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
