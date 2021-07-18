<?php

require __DIR__ . '/vendor/autoload.php';


use \App\Controller\Pages\Home;

$obRequest = new \App\Http\Request();
echo "<pre>";
print_r($obRequest);
echo "<pre>"; exit;



exit;

echo Home::getHome();





//         echo "<pre>";
//         print_r($vars);
//        echo "<pre>"; exit;