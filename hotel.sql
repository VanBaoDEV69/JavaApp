-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 12, 2022 lúc 03:00 PM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `hotel`
--
CREATE DATABASE IF NOT EXISTS `hotel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hotel`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `id_bill` int(11) NOT NULL,
  `fullname_client` varchar(50) NOT NULL,
  `phone_client` varchar(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `room_number` int(11) NOT NULL,
  `date_in` date NOT NULL,
  `date_out` date NOT NULL,
  `price_unit` float NOT NULL,
  `service_chanrge` float NOT NULL,
  `discount_price` float NOT NULL,
  `price_total` float NOT NULL,
  `add_by` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`id_bill`, `fullname_client`, `phone_client`, `mail`, `room_number`, `date_in`, `date_out`, `price_unit`, `service_chanrge`, `discount_price`, `price_total`, `add_by`) VALUES
(1, 'Lê Anh', '0335556668', 'vanbaopm01@gmail.com', 1, '2022-04-21', '2022-04-23', 150, 0, 0, 450, 'admin'),
(5, 'Tô Văn A', '0335056407', 'vanbaopm01@gmail.com', 12, '2022-04-22', '2022-05-02', 170, 0, 0, 1700, 'admin'),
(6, 'Tô Văn A', '0335056407', 'vanbaopm01@gmail.com', 6, '2022-05-02', '2022-05-02', 200, 0, 0, 200, 'admin'),
(7, 'Lê Văn B', '0335056407', 'vanbaopm01@gmail.com', 1, '2022-05-02', '2022-05-02', 150, 0, 0, 150, 'admin'),
(8, 'Lê D', '0335056407', 'vanbaopm01@gmail.com', 8, '2022-05-02', '2022-05-02', 230, 0, 0, 230, 'user1'),
(9, 'Lê D', '0335056407', 'vanbaopm01@gmail.com', 1, '2022-05-02', '2022-05-02', 150, 0, 0, 150, 'user1'),
(10, 'Lê B', '0335056407', 'vanbaopm01@gmail.com', 9, '2022-05-02', '2022-05-02', 500, 0, 0, 500, 'user2'),
(11, 'Lê B', '0335056407', 'vanbaopm01@gmail.com', 12, '2022-05-02', '2022-05-02', 170, 0, 0, 170, 'user2'),
(12, 'Lê C', '0335056407', 'vanbaopm01@gmail.com', 4, '2022-05-02', '2022-05-11', 200, 0, 0, 1800, 'admin'),
(13, 'Lê Huy', '0335056407', 'vanbaopm01@gmail.com', 3, '2022-05-02', '2022-05-11', 180, 0, 0, 1620, 'admin'),
(14, 'Lê H', '0335056407', 'vanbaopm01@gmail.com', 12, '2022-05-11', '2022-05-11', 170, 0, 0, 170, 'user1'),
(15, 'Lê D', '0335056407', 'vanbaopm01@gmail.com', 21, '2022-05-11', '2022-05-11', 170, 0, 0, 170, 'user1'),
(16, 'Lê A', '0335056407', 'vanbaopm01@gmail.com', 2, '2022-05-11', '2022-05-11', 170, 0, 0, 170, 'user1'),
(17, 'Lê B', '0335056407', 'vanbaopm01@gmail.com', 6, '2022-05-11', '2022-05-11', 200, 0, 0, 200, 'admin'),
(18, 'Lê C', '0335056407', 'vanbaopm01@gmail.com', 9, '2022-05-11', '2022-05-11', 500, 0, 0, 500, 'admin'),
(19, 'Lê J', '0335056407', 'vanbaopm01@gmail.com', 16, '2022-05-11', '2022-05-11', 200, 0, 0, 200, 'user1'),
(20, 'Lê Phi', '0335056407', 'vanbaopm01@gmail.com', 10, '2022-05-11', '2022-05-12', 700, 0, 0, 1400, 'admin'),
(21, 'Tô D', '0123213123', 'vanbaopmdp@gmail.com', 6, '2022-05-12', '2022-05-12', 200, 0, 0, 200, 'admin'),
(22, 'Tô A', '0123213123', 'vanbaopmdp@gmail.com', 23, '2022-05-11', '2022-05-19', 180, 0, 0, 1440, 'user1'),
(23, 'Tô A', '0123213123', 'vanbaopmdp@gmail.com', 22, '2022-05-11', '2022-05-27', 170, 0, 0, 2720, 'admin'),
(26, 'Tô Duy', '0123213123', 'vanbaopmdp@gmail.com', 2, '2022-05-11', '2022-05-29', 170, 230, 0, 3290, 'admin'),
(27, 'Tô A', '0123213123', 'vanbaopmdp@gmail.com', 26, '2022-05-29', '2022-05-29', 200, 269, 0, 469, 'admin'),
(28, 'Tô Do', '0123213123', 'vanbaopmdp@gmail.com', 4, '2022-05-29', '2022-05-29', 200, 100, 0, 300, 'admin'),
(29, 'Tô B', '0123213123', 'vanbaopmdp@gmail.com', 7, '2022-05-29', '2022-05-29', 230, 130, 0, 360, 'admin'),
(30, 'Tô C', '0123213123', 'vanbaopmdp@gmail.com', 1, '2022-05-29', '2022-05-29', 150, 0, 0, 150, 'admin'),
(31, 'Tô Do', '0123213123', 'vanbaopmdp@gmail.com', 10, '2022-05-29', '2022-05-29', 700, 130, 0, 830, 'admin'),
(32, 'Tô A', '0123213123', 'vanbaopmdp@gmail.com', 3, '2022-05-29', '2022-06-11', 180, 414, 5.2, 143.208, 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `booking`
--

CREATE TABLE `booking` (
  `id` int(11) NOT NULL,
  `fullname_client` varchar(50) NOT NULL,
  `birth_day` date DEFAULT NULL,
  `phone` varchar(11) NOT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `amount` int(2) NOT NULL,
  `type_room` varchar(50) NOT NULL,
  `room_number` int(11) NOT NULL,
  `price_day` float NOT NULL,
  `date_in` date NOT NULL,
  `date_out` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `booking`
--

INSERT INTO `booking` (`id`, `fullname_client`, `birth_day`, `phone`, `mail`, `amount`, `type_room`, `room_number`, `price_day`, `date_in`, `date_out`) VALUES
(32, 'Tô D', '2001-05-12', '0123213123', 'vanbaopmdp@gmail.com', 1, 'Phòng V.I.P', 5, 200, '2022-05-12', '2022-05-14'),
(66, 'Lê A', '2001-05-12', '0123213123', 'vanbaopmdp@gmail.com', 3, 'Phòng V.I.P', 7, 230, '2022-05-29', '2022-05-31'),
(67, 'Lê B', '2001-05-12', '0123213123', 'vanbaopmdp@gmail.com', 1, 'Phòng thường', 1, 150, '2022-05-31', '2022-06-03');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `booking_details`
--

CREATE TABLE `booking_details` (
  `fullname_client` varchar(50) NOT NULL,
  `phone_number` varchar(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `room_number` int(11) NOT NULL,
  `price` float NOT NULL,
  `date_in` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `booking_details`
--

INSERT INTO `booking_details` (`fullname_client`, `phone_number`, `mail`, `room_number`, `price`, `date_in`) VALUES
('Tô Di', '0123213123', 'vanbaopmdp@gmail.com', 17, 200, '2022-05-29 20:27:47');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `discount`
--

CREATE TABLE `discount` (
  `id` int(11) NOT NULL,
  `discount_code` varchar(50) NOT NULL,
  `discount_price` float NOT NULL,
  `date_begin` date NOT NULL,
  `date_end` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `discount`
--

INSERT INTO `discount` (`id`, `discount_code`, `discount_price`, `date_begin`, `date_end`) VALUES
(1, 'EVENT1-6', 10, '2022-06-01', '2022-06-05'),
(2, 'EVENT28-5', 5.2, '2022-06-01', '2022-06-28');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `room_number` int(10) NOT NULL,
  `type_room` varchar(50) NOT NULL,
  `amount` int(10) NOT NULL,
  `price_day` float NOT NULL,
  `price_hour` float NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`room_number`, `type_room`, `amount`, `price_day`, `price_hour`, `status`) VALUES
(1, 'Phòng thường', 1, 150, 50, 'Empty'),
(2, 'Phòng thường', 2, 170, 60, 'Empty'),
(3, 'Phòng thường', 3, 180, 70, 'Empty'),
(4, 'Phòng thường', 4, 200, 80, 'Empty'),
(5, 'Phòng V.I.P', 1, 200, 75, 'Empty'),
(6, 'Phòng V.I.P', 2, 200, 75, 'Using'),
(7, 'Phòng V.I.P', 3, 230, 90, 'Empty'),
(8, 'Phòng V.I.P', 4, 230, 90, 'Empty'),
(9, 'Tổng thống', 2, 500, 120, 'Empty'),
(10, 'Tổng thống', 4, 700, 150, 'Empty'),
(11, 'Phòng thường', 1, 150, 50, 'Empty'),
(12, 'Phòng thường', 2, 170, 60, 'Empty'),
(13, 'Tổng thống', 2, 500, 60, 'Empty'),
(14, 'Tổng thống', 2, 500, 60, 'Empty'),
(15, 'Tổng thống', 4, 700, 150, 'Empty'),
(16, 'Phòng V.I.P', 2, 200, 75, 'Empty'),
(17, 'Phòng V.I.P', 1, 200, 75, 'Using'),
(18, 'Phòng thường', 4, 200, 80, 'Empty'),
(19, 'Phòng V.I.P', 1, 200, 75, 'Empty'),
(20, 'Phòng V.I.P', 1, 200, 75, 'Empty'),
(21, 'Phòng thường', 2, 170, 60, 'Empty'),
(22, 'Phòng thường', 2, 170, 60, 'Empty'),
(23, 'Phòng thường', 3, 180, 70, 'Empty'),
(25, 'Phòng V.I.P', 1, 200, 75, 'Empty'),
(26, 'Phòng V.I.P', 2, 200, 75, 'Empty'),
(27, 'Phòng V.I.P', 3, 230, 90, 'Empty'),
(28, 'Phòng V.I.P', 4, 230, 90, 'Empty'),
(29, 'Tổng thống', 2, 500, 120, 'Empty'),
(30, 'Tổng thống', 4, 700, 150, 'Empty'),
(31, 'Phòng V.I.P', 1, 200, 75, 'Empty'),
(32, 'Phòng V.I.P', 2, 200, 75, 'Empty'),
(33, 'Tổng thống', 4, 700, 150, 'Empty'),
(34, 'Tổng thống', 2, 500, 60, 'Empty'),
(35, 'Tổng thống', 4, 700, 150, 'Empty'),
(36, 'Phòng thường', 4, 200, 80, 'Empty'),
(37, 'Phòng V.I.P', 3, 230, 90, 'Empty'),
(38, 'Tổng thống', 4, 700, 150, 'Empty'),
(39, 'Phòng thường', 1, 150, 50, 'Empty'),
(40, 'Phòng V.I.P', 1, 200, 75, 'Empty');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `service`
--

CREATE TABLE `service` (
  `id` int(11) NOT NULL,
  `service_name` varchar(50) NOT NULL,
  `price_unit` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `service`
--

INSERT INTO `service` (`id`, `service_name`, `price_unit`) VALUES
(1, 'Sét ăn sáng', 50),
(2, 'Sét ăn trưa', 60),
(3, 'Sét ăn tối', 65),
(4, 'Spa', 219),
(5, 'Giặc là', 30);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `service_detail`
--

CREATE TABLE `service_detail` (
  `room_number` int(11) NOT NULL,
  `service_name` varchar(50) NOT NULL,
  `price_unit` float NOT NULL,
  `amount` int(100) NOT NULL,
  `price_total` float NOT NULL,
  `date_buy` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `service_detail`
--

INSERT INTO `service_detail` (`room_number`, `service_name`, `price_unit`, `amount`, `price_total`, `date_buy`) VALUES
(17, 'Sét ăn sáng', 50, 2, 100, '2022-05-29'),
(17, 'Spa', 219, 1, 219, '2022-06-11');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `type_room`
--

CREATE TABLE `type_room` (
  `id_type` int(11) NOT NULL,
  `type_room` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `type_room`
--

INSERT INTO `type_room` (`id_type`, `type_room`) VALUES
(1, 'Phòng thường'),
(2, 'Phòng V.I.P'),
(3, 'Tổng thống');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `type_service`
--

CREATE TABLE `type_service` (
  `id` int(11) NOT NULL,
  `service_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `type_service`
--

INSERT INTO `type_service` (`id`, `service_name`) VALUES
(1, 'Sét ăn uống'),
(2, 'Spa'),
(3, 'Giặc là'),
(4, 'Thức uống'),
(5, 'Gym');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `birth_day` varchar(50) NOT NULL,
  `phonenumber` varchar(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `fullname`, `username`, `password`, `birth_day`, `phonenumber`, `mail`, `address`, `status`) VALUES
(1, 'Tô Văn Bảo', 'admin', '1', '2001-18-04', '0335056407', 'vanbaopm01@gmail.com', 'Quảng Ngãi', 'Admin'),
(4, 'Văn Bảo', 'user1', '1', '2001-19-04', '0335056407', 'vb@gmail.com', 'HCM', 'Open'),
(5, 'Hoàng Trung', 'user2', '1', '2001-16-04', '0113114115', 'ht@gmail.com', 'HCM', 'Open'),
(9, 'Trần Thị Trúc Quỳnh', 'quynh', '1', '2002-01-20', '0335056407', 'amilygaming2001@gmail.com', 'Quảng Ngãi', 'Admin'),
(10, 'Nguyễn Thị Thu Hiền', 'hien', '1', '2001-04-19', '3472834732', 'ntth0601@gmail.com', 'HCM', 'Open'),
(11, 'Thiên Lê', 'thien', '1', '2022-04-21', '098675443', 'ntllss114@gmail.com', 'QN', 'Block'),
(12, 'Văn Bảo', 'bao', '1', '2001-04-18', '0335056407', 'vanbaopmdp@gmail.com', 'HCM', 'Block'),
(13, 'bao', 'bao123', '1', '2022-05-19', '0335056407', 'vanbaopm01@gmail.com', 'HCM', 'Open');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`id_bill`);

--
-- Chỉ mục cho bảng `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_number`);

--
-- Chỉ mục cho bảng `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `type_room`
--
ALTER TABLE `type_room`
  ADD PRIMARY KEY (`id_type`);

--
-- Chỉ mục cho bảng `type_service`
--
ALTER TABLE `type_service`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bill`
--
ALTER TABLE `bill`
  MODIFY `id_bill` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT cho bảng `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT cho bảng `discount`
--
ALTER TABLE `discount`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `service`
--
ALTER TABLE `service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `type_room`
--
ALTER TABLE `type_room`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `type_service`
--
ALTER TABLE `type_service`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
