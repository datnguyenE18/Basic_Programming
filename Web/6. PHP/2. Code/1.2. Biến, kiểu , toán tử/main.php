<?php

$bien_1 = 1;
echo 'biến 1:', $bien_1, '<br />' ; //biến 1:1
var_dump($bien_1); //int(1)
echo '<br \>=====================================<br \>';

$Bien_1 = 1;
$bien_1 = 'a';
var_dump($bien_1); // string(1) "a"
echo '<br \>=====================================<br \>';

define('__HANGSO__', 20);
var_dump(__HANGSO__); // int(20)
echo '<br \>=====================================<br \>';

$x = 1;
$y = '1';
var_dump($x == $y);echo '<br \>'; // bool(true)
var_dump($x === $y); // bool(false)
echo '<br \>=====================================<br \>';

$z = 'b';
var_dump($x != $z); echo '<br \>'; // bool(true)
var_dump($x !== $y); // bool(true) 
echo '<br \>=====================================<br \>';

$a = ($x > 5)? $x : 0; // gán a = 5 nếu x > 5 , không thì gán a = 0
var_dump($a); echo '<br \>';
$b = 'Test';
$b = $b ?? 'Gia tri dau tien';
var_dump($b);
?>