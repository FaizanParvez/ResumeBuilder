-- phpMyAdmin SQL Dump
-- version 4.2.7
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 05, 2014 at 05:43 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbresume`
--

-- --------------------------------------------------------

--
-- Table structure for table `resume1`
--

CREATE TABLE `resume1` (
`s_no` int(20) NOT NULL,
  `name` varchar(50) DEFAULT 'abcd',
  `age` varchar(3) DEFAULT '20',
  `gender` varchar(10) DEFAULT 'male',
  `phone_num` varchar(20) DEFAULT '1234567890',
  `email_id` varchar(50) DEFAULT 'abc@gmail.com',
  `languages` varchar(100) DEFAULT 'aaa',
  `career_obj` varchar(100) DEFAULT 'aaa',
  `date` varchar(10) DEFAULT '1',
  `month` varchar(10) DEFAULT '1',
  `year` varchar(4) DEFAULT '2001',
  `hss` varchar(50) DEFAULT '1',
  `sss` varchar(50) DEFAULT '1',
  `hss_year` varchar(4) DEFAULT '2000',
  `sss_year` varchar(4) DEFAULT '2000',
  `hss_percent` varchar(5) DEFAULT '1',
  `sss_percent` varchar(5) DEFAULT '1',
  `qualification` varchar(20) DEFAULT 'be',
  `hobbies` varchar(500) DEFAULT 'aaa',
  `personal_traits` varchar(500) DEFAULT 'aaa',
  `proff_traits` varchar(500) DEFAULT 'aaa',
  `area_interest` varchar(500) DEFAULT 'aaa',
  `awards` varchar(500) DEFAULT 'aaa',
  `street` varchar(20) DEFAULT 'aaa',
  `city` varchar(20) DEFAULT '1',
  `state` varchar(30) DEFAULT '1',
  `nationality` varchar(10) DEFAULT 'aaa',
  `mar_status` varchar(10) DEFAULT 'aaa',
  `f_name` varchar(40) DEFAULT 'aaa',
  `technical_skills` varchar(500) DEFAULT 'aaa',
  `non_tech_skills` varchar(500) DEFAULT 'aaa',
  `extra_curr` varchar(500) DEFAULT 'aaa',
  `comp_skills` varchar(500) DEFAULT 'aaa',
  `training` varchar(500) DEFAULT 'aaa',
  `min_proj` varchar(500) DEFAULT 'aaa',
  `min_proj_tech` varchar(500) DEFAULT 'aaa',
  `maj_proj` varchar(500) DEFAULT 'aaa',
  `maj_proj_tech` varchar(500) DEFAULT 'aaa',
  `be_univ` varchar(100) DEFAULT 'aaa',
  `be_stream` varchar(100) DEFAULT 'aaa',
  `be_cgpa` float DEFAULT '0',
  `desc_min` varchar(600) DEFAULT 'aaa',
  `be_year` varchar(4) DEFAULT '2001',
  `desc_maj` varchar(20) DEFAULT 'aaa',
  `mba_univ` varchar(100) DEFAULT 'aaa',
  `grad_univ` varchar(100) DEFAULT 'aaa',
  `grad_cgpa` varchar(5) DEFAULT 'aaa',
  `mba_cgpa` varchar(5) DEFAULT 'aaa',
  `grad_degree` varchar(50) DEFAULT 'aaa',
  `grad_year` varchar(4) DEFAULT 'aaa',
  `mba_year` varchar(4) DEFAULT '2001',
  `mba_specialisation` varchar(50) DEFAULT 'aaa',
  `sss_board` varchar(30) DEFAULT 'aaa',
  `hss_board` varchar(40) DEFAULT '2001',
  `date_declaration` varchar(67) NOT NULL DEFAULT '1',
  `place_declaration` varchar(20) NOT NULL DEFAULT '1',
  `sss_stream` varchar(20) DEFAULT 'medical'
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Dumping data for table `resume1`
--

INSERT INTO `resume1` (`s_no`, `name`, `age`, `gender`, `phone_num`, `email_id`, `languages`, `career_obj`, `date`, `month`, `year`, `hss`, `sss`, `hss_year`, `sss_year`, `hss_percent`, `sss_percent`, `qualification`, `hobbies`, `personal_traits`, `proff_traits`, `area_interest`, `awards`, `street`, `city`, `state`, `nationality`, `mar_status`, `f_name`, `technical_skills`, `non_tech_skills`, `extra_curr`, `comp_skills`, `training`, `min_proj`, `min_proj_tech`, `maj_proj`, `maj_proj_tech`, `be_univ`, `be_stream`, `be_cgpa`, `desc_min`, `be_year`, `desc_maj`, `mba_univ`, `grad_univ`, `grad_cgpa`, `mba_cgpa`, `grad_degree`, `grad_year`, `mba_year`, `mba_specialisation`, `sss_board`, `hss_board`, `date_declaration`, `place_declaration`, `sss_stream`) VALUES
(1, 'monika gahlawat', '19', 'female', '9501821781', 'monikagahlawat62@gmail.com', 'hindi, english, punjabi', 'To secure a challenging position where I can effectively contribute my skills as software profession', '04', '11', '1994', 'manav mangal school, panchkula', 'dav senior secondary school, sec 8, chandigarh', '2010', '2012', '87.1', '81.5', 'be', 'playing, reading', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'panchkula', 'haryana', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'panjab university,chandigarh', 'CSE', 8.4, '7.9', '2016', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2016', 'aaa', 'aaa', '0000', '0000-00-00', 'mkn g', 'medical'),
(16, 'Rahul Sharma', '20', 'male', '1234567890', 'abc@gmail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '89.5', '87.9', 'be', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'java', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'computer science and engineering', 8, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(17, 'Ajay', '22', 'male', '8762831987', 'ajoyverma@gmail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '89.0', '98', 'be', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '.net', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Civil Engineering', 7.9, 'aaa', '2001', 'aaa', 'aaa', 'aaa', '9.0', '8.2', 'BA', 'aaa', '2001', 'Finance', 'aaa', '2001', '1', '1', 'Non medical'),
(18, 'Anchit', '26', 'male', '868790876', 'seh_ajoy@gmail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '78.9', '89.7', 'BE', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '.net', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Electrical Engineering', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', '8', '9.2', 'B Tech', 'aaa', '2001', 'Human Resources', 'aaa', '2001', '1', '1', 'medical'),
(19, 'rihani', '19', 'female', '9560876767', 'rihani_singh@ymail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '99', '87.9', 'be', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'PHP', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Civil Engineering', 8.8, 'aaa', '2001', 'aaa', 'aaa', 'aaa', '8.9', '9.4', 'aaa', 'aaa', '2001', 'Finance', 'aaa', '2001', '1', '1', 'medical'),
(20, 'ruhi singhania', '23', 'feamle', '9501342344', 'ruhi_singh@gmail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '88', '87', 'MBA', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'PHP', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Computer Science and Engineering', 9, 'aaa', '2001', 'aaa', 'aaa', 'aaa', '8', '8.4', 'B Tech', 'aaa', '2001', 'Finance', 'aaa', '2001', '1', '1', 'non medical'),
(21, 'aahana verma', '25', 'female', '9898999888', 'aahana_aa@gmail.com', 'aaa', 'aaa', '1', '1', '2001', '1', '1', '2000', '2000', '87', '84.6', 'Class 12', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '1', '1', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Java', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'Computer Science and Engineering', 8.7, 'aaa', '2001', 'aaa', 'aaa', 'aaa', '8', '7', 'aaa', 'aaa', '2001', 'Finance', 'aaa', '2001', '1', '1', 'medical'),
(22, 'jitu gahlawat', '20', 'Male', '9999167120', 'jitu_gah@gmail.com', '0', 'aaa', '15', '03', '1991', '1', '1', '0', '0', '87', '86', 'MBA', '0', '0', 'aaa', 'aaa', 'aaa', 'hnjk', 'ujkm', 'iumk', '0', '0', '0', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(23, 'Sachin Maruti', '22', 'Male', '9887876758', 'sachin@ymail.com', '0', 'aaa', '05', '06', '1992', '1', '1', '0', '0', '89', '84', 'MBA', '0	00	0', '0', 'aaa', 'aaa', 'aaa', 'ghbj', 'hjm', 'yuhnj', '0', '0', '0', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(24, 'harshal manjhu', '21', 'Male', '9898556787', 'anjhu_harshal@gmail.com', '0', 'aaa', '01', '01', '1989', '1', '1', '0', '0', '88', '79', 'MBA', '0	', '0', 'aaa', 'aaa', 'aaa', 'h', 'ujhn', 'uhn', '0', '0', '0', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(25, 'misha', '20', 'Female', '9998989787', 'misssha@gmail.com', 'aaa', 'aaa', '01', '01', '1990', '1', '1', '2000', '2000', '1', '1', 'Class 12', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'wfsdfgsdf', 'ijmlk', 'hguyj', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(26, 'sakshi sehgal', '20', 'Female', '9967678787', 'sehgalsakshi@ymail.com', '0', 'aaa', '01', '01', '1993', '1', '1', '00', '0', '0', '0', 'Class 12', '00	0	', '0	0	0', 'aaa', 'aaa', 'aaa', 'sector 2', 'haryana', 'panchkula', 'indian', '00', '0', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(27, 'Sakshi Sehgal', '20', 'Female', '9646966928', 'sehgalsakshi@ymail.com', 'english, hindi', 'aaa', '22', '08', '1994', '1', '1', '2010', '2012', '91', '89', 'BE', 'listening music\nreading books	', '1\n2', 'aaa', 'aaa', 'aaa', '#615, sector-2', 'haryana', 'pkl', 'indian', 'single', 'Capt. Ravi Sehgal', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical'),
(28, 'Vaibhavi Sharma', '0', 'Female', '9999999999', 'ss@ss.ss', '0', 'aaa', '22', '08', '1994', '1', '1', '0', '0', '00', '0', 'BE', '0', '0', 'aaa', 'aaa', 'aaa', 'ss', 's', 's', '0', '0', '0', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 0, 'aaa', '2001', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', 'aaa', '2001', 'aaa', 'aaa', '2001', '1', '1', 'medical');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `resume1`
--
ALTER TABLE `resume1`
 ADD PRIMARY KEY (`s_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `resume1`
--
ALTER TABLE `resume1`
MODIFY `s_no` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
