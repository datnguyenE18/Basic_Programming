<?php

$mang = array('phần tử 1', 'phần tử 2', 3);
echo $mang[0], '<br />'; //phần tử 1

$mang2 = array(
    'key1'  =>  'phần tử 1', 
    'key2'  => 'phần tử 2', 
    'key3'  => 3
);

echo $mang2['key1']; // phần tử 1

$arr = [
    'toan'  => 10,
    'ly'    => 9
];
echo '<pre>';
var_dump($arr);
echo '</pre>';

// hàm thao tác mảng
$arr = array('1');
array_push($mang,'phần tử 4');
echo '<pre>';
var_dump($mang);
echo '</pre>';


array_push($mang, $arr);
echo '<pre>';
var_dump($mang);
echo '</pre>';


$mang = array_merge($mang,$arr);
echo '<pre>';
var_dump($mang);
echo '</pre>';

echo count($mang).'<br/>';


$phan_tu_ktra = 3;
if(in_array($phan_tu_ktra, $mang)){
    echo $phan_tu_ktra;
}
var_dump(in_array($phan_tu_ktra, $mang));
var_dump(array_key_exists('key1',$mang2));

if(array_key_exists('key1',$mang2)){
    echo $mang2['key1'];
}

echo $mang2['abc'];

if(key_exists('abc',$mang2)){
    echo $mang2['abc'];
}


$mang_kq = array_slice($mang, 1);
var_dump( $mang_kq );

?>