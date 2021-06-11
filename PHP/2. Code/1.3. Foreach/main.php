<?php

$mang = array('phần tử 1', 'phần tử 2', 3); 
foreach($mang as $key => $value){
   echo $key.'=>'.$value, '<br />';
}

/*
0=>phần tử 1
1=>phần tử 2
2=>3
*/

echo '<br />======================================<br />';
$mang = array('phần tử 1', 'phần tử 2', 3); 
foreach($mang as $value){
   echo $value, '<br />';
}

/*
phần tử 1
phần tử 2
3
*/

?>