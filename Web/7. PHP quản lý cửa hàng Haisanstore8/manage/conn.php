<?php

$conn = mysqli_connect("localhost", "root", "", "pos", 3306);
if (!$conn) {
	die("Connection failed: " . mysqli_connect_error());
}
