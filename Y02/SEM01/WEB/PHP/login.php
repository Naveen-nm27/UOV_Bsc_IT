<?php
$host = 'localhost';
$db   = 'publications';
$user = '2022ICT138';
$pass = '';
$chrs = 'utf8mb4';

$attr = "mysql:host=$host;dbname=$db;charset=$chrs";
$opts = [
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES   => false
];
?>
