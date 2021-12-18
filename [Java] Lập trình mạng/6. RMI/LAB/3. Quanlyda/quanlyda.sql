-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 16, 2021 lúc 10:31 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlyda`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `duan`
--

CREATE TABLE `duan` (
  `id_da` int(11) NOT NULL,
  `ten_da` varchar(50) NOT NULL,
  `thoigian` float NOT NULL,
  `mota` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `duan`
--

INSERT INTO `duan` (`id_da`, `ten_da`, `thoigian`, `mota`) VALUES
(1, 'Viec1', 20, 'duan1'),
(2, 'Viec2', 10, 'duan2'),
(3, 'Viec2', 15, 'duan3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lamviec`
--

CREATE TABLE `lamviec` (
  `id_da` int(11) NOT NULL,
  `id_nv` int(11) NOT NULL,
  `vitri` varchar(200) NOT NULL,
  `sogio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `lamviec`
--

INSERT INTO `lamviec` (`id_da`, `id_nv`, `vitri`, `sogio`) VALUES
(1, 1, 'Kiem tra', 5),
(1, 2, 'lam viec', 15);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `id_nv` int(11) NOT NULL,
  `ten_nv` varchar(50) NOT NULL,
  `ngaysinh` varchar(50) NOT NULL,
  `chucvu` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`id_nv`, `ten_nv`, `ngaysinh`, `chucvu`) VALUES
(1, 'Nguyen Van A', '20/10/1995', 'test1'),
(2, 'Nguyen Dang B', '20/05/1981', 'test2'),
(3, 'Tran Thanh C', '11/11/1991', 'test3');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `duan`
--
ALTER TABLE `duan`
  ADD PRIMARY KEY (`id_da`);

--
-- Chỉ mục cho bảng `lamviec`
--
ALTER TABLE `lamviec`
  ADD KEY `id_nv` (`id_nv`),
  ADD KEY `id_da` (`id_da`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`id_nv`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `duan`
--
ALTER TABLE `duan`
  MODIFY `id_da` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `id_nv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `lamviec`
--
ALTER TABLE `lamviec`
  ADD CONSTRAINT `lamviec_ibfk_1` FOREIGN KEY (`id_nv`) REFERENCES `nhanvien` (`id_nv`),
  ADD CONSTRAINT `lamviec_ibfk_2` FOREIGN KEY (`id_da`) REFERENCES `duan` (`id_da`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
