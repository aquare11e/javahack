<?php
 
/* Задаем переменные */
$url = htmlspecialchars($_POST["url"]);
$floor_tile = htmlspecialchars($_POST["floor_tile"]);
$floor_tile_s = htmlspecialchars($_POST["floor_tile_s"]);
$floor_tile_m = htmlspecialchars($_POST["floor_tile_m"]);
$wall_tile = htmlspecialchars($_POST["wall_tile"]);
$wall_tile_s = htmlspecialchars($_POST["wall_tile_s"]);
$wall_tile_m = htmlspecialchars($_POST["wall_tile_m"]);
$laminate = htmlspecialchars($_POST["laminate"]);
$laminate_s = htmlspecialchars($_POST["laminate_s"]);
$laminate_m = htmlspecialchars($_POST["laminate_m"]);
$parquet = htmlspecialchars($_POST["parquet"]);
$parquet_s = htmlspecialchars($_POST["parquet_s"]);
$parquet_m = htmlspecialchars($_POST["parquet_m"]);
$ent_doors = htmlspecialchars($_POST["ent_doors"]);
$ent_doors_n = htmlspecialchars($_POST["ent_doors_n"]);
$int_doors = htmlspecialchars($_POST["int_doors"]);
$int_doors_n = htmlspecialchars($_POST["int_doors_n"]);
$wallpaper_n = htmlspecialchars($_POST["wallpaper_n"]);
$wallpaper_m = htmlspecialchars($_POST["wallpaper_m"]);
$thermo_floor_s = htmlspecialchars($_POST["thermo_floor_s"]);
$thermo_floor_m = htmlspecialchars($_POST["thermo_floor_m"]);
$thermo_switch = htmlspecialchars($_POST["thermo_switch"]);
$sink_i = htmlspecialchars($_POST["sink_i"]);
$bath_tube_i = htmlspecialchars($_POST["bath_tube_i"]);
$toilet_i = htmlspecialchars($_POST["toilet_i"]);
$mixers_i = htmlspecialchars($_POST["mixers_i"]);
$ceiling_sound = htmlspecialchars($_POST["ceiling_sound"]);
$ceiling_sound_type = htmlspecialchars($_POST["ceiling_sound_type"]);
$ceiling_sound_s = htmlspecialchars($_POST["ceiling_sound_s"]);
$ceiling_sound_m = htmlspecialchars($_POST["ceiling_sound_m"]);
$floor_sound = htmlspecialchars($_POST["floor_sound"]);
$floor_sound_type = htmlspecialchars($_POST["floor_sound_type"]);
$floor_sound_s = htmlspecialchars($_POST["floor_sound_s"]);
$floor_sound_m = htmlspecialchars($_POST["floor_sound_m"]);
$wall_sound = htmlspecialchars($_POST["wall_sound"]);
$wall_sound_type = htmlspecialchars($_POST["wall_sound_type"]);
$wall_sound_s = htmlspecialchars($_POST["wall_sound_s"]);
$wall_sound_m = htmlspecialchars($_POST["wall_sound_m"]);
$switchers_p = htmlspecialchars($_POST["switchers_p"]);
$stretch_ceiling_p = htmlspecialchars($_POST["stretch_ceiling_p"]);
$int_door_p = htmlspecialchars($_POST["int_door_p"]);

$phone = htmlspecialchars($_POST["phone"]);
$email = htmlspecialchars($_POST["email"]);
 
/* Ваш адрес и тема сообщения */
$address = "asilyanov1568@gmail.com";/*Адрес электронной почты, на который нужно, чтобы приходили письма*/
$sub = "Заявка на расчет стоимости ремонта";
                
/* Формат письма */

$mes = "Заявка на расчет стоимости ремонта\n
Телефон заказчика: $phone\n
E-mail заказчика: $email\n
Urд с которого пришел заказчик: $url,\n
__Напольное покрытие__\n
Напольная плитка: $floor_tile
Площадь покрытия напольной плиткой: $floor_tile_s
Замер покрытия напольной плиткой: $floor_tile_m\n
Настенная плитка: $wall_tile
Площадь покрытия настенной плиткой: $wall_tile_s
Замер площади покрытия настенной плиткой: $wall_tile_m\n
Ламинат: $laminate
Плащадь покрытия ламинатом: $laminate_s
Замер площади покрытия ламинатом:$laminate_m\n
Паркет: $parquet
Площадь покрытия паркетом: $parquet_s
Замер площади покрытия паркетом: $parquet_m\n
__Двери__\n
Входные двери: $ent_doors
Количество входных дверей: $ent_doors_n\n
Межкомнатные двери: $int_doors
Количество межкомнатных дверей: $int_doors_n\n
__Обои__\n
Площадь обоев: $wallpaper_n
Звмер площади обоев: $wallpaper_m\n
__Теплый пол__\n
Площадь теплого пола: $thermo_floor_s
Замер площади для теплого пола: $thermo_floor_m
Нужны ли терморегуляторы: $thermo_switch\n
__Сантехника__\n
Раковина: $sink_i
Ванна: $bath_tube_i
Туалет/инсталяция: $toilet_i
Смесители: $mixers_i\n
__Шумоизоляция__\n
Потолок: $ceiling_sound
Тип шума потолока: $ceiling_sound_type
Площадь изоляции потолка: $ceiling_sound_s
Замер потолка: $ceiling_sound_m\n
Пол: $floor_sound
Тип шума пола: $floor_sound_type
Площадь изоляции пола: $floor_sound_s
Замер пола: $floor_sound_m\n
Стены: $wall_sound
Тип шума стен: $wall_sound_type
Площадь изоляции стен: $wall_sound_s
Замер стен: $wall_sound_m\n
__Выбранный подарок__\n
Набор выключателей: $switchers_p
Натяжной потолок: $stretch_ceiling_p\n
Межкомнатная дверь: $int_door_p"; 

$token = "497038008:AAHZgJU1vBnfQN-jjaG1-CdM4TxVmbouvck";
$chat_id = "-208697004";

$arr = array(
    'Телефон заказчика: ' => $phone,
    'E-mail заказчика: ' => $email,
    'url с которого пришел заказчик: ' => $url,
    '__Напольное покрытие__',
    'Напольная плитка: ' => $floor_tile,
    'Площадь покрытия напольной плиткой: ' => $floor_tile_s,
    'Замер покрытия напольной плиткой: ' => $floor_tile_m,
    'Настенная плитка: ' => $wall_tile,
    'Площадь покрытия настенной плиткой: ' => $wall_tile_s,
    'Замер площади покрытия настенной плиткой: ' => $wall_tile_m,
    'Ламинат: ' => $laminate,
    'Плащадь покрытия ламинатом: ' => $laminate_s,
    'Замер площади покрытия ламинатом: ' =>$laminate_m,
    'Паркет: ' => $parquet,
    'Площадь покрытия паркетом: ' => $parquet_s,
    'Замер площади покрытия паркетом: ' => $parquet_m,
    '__Двери__',
    'Входные двери: ' => $ent_doors,
    'Количество входных дверей: ' => $ent_doors_n,
    'Межкомнатные двери: ' => $int_doors,
    'Количество межкомнатных дверей: ' => $int_doors_n,
    '__Обои__',
    'Площадь обоев: ' => $wallpaper_n,
    'Звмер площади обоев: ' => $wallpaper_m,
    '__Теплый пол__',
    'Площадь теплого пола: ' => $thermo_floor_s,
    'Замер площади для теплого пола: ' => $thermo_floor_m,
    'Нужны ли терморегуляторы: ' => $thermo_switch,
    '__Сантехника__',
    'Раковина: ' => $sink_i,
    'Ванна: ' => $bath_tube_i,
    'Туалет/инсталяция: ' => $toilet_i,
    'Смесители: ' => $mixers_i,
    '__Шумоизоляция__',
    'Потолок: ' => $ceiling_sound,
    'Тип шума потолока: ' => $ceiling_sound_type,
    'Площадь изоляции потолка: ' => $ceiling_sound_s,
    'Замер потолка: ' => $ceiling_sound_m,
    'Пол: ' => $floor_sound,
    'Тип шума пола: ' => $floor_sound_type,
    'Площадь изоляции пола: ' => $floor_sound_s,
    'Замер пола: ' => $floor_sound_m,
    'Стены: ' => $wall_sound,
    'Тип шума стен: ' => $wall_sound_type,
    'Площадь изоляции стен: ' => $wall_sound_s,
    'Замер стен: ' => $wall_sound_m,
    '__Выбранный подарок__',
    'Набор выключателей: ' => $switchers_p,
    'Натяжной потолок: ' => $stretch_ceiling_p,
    'Межкомнатная дверь: ' => $int_door_p,
);

foreach($arr as $key => $value) {
  $txt .= "<b>".$key."</b> ".$value."%0A";
};

$sendToTelegram = fopen("https://api.telegram.org/bot{$token}/sendMessage?chat_id={$chat_id}&parse_mode=html&text={$txt}","r");

iconv ($in_charset, $out_charset, $mes); /*Преобразуем*/
 
if (empty($bezspama))
{
$from  = "From: Заказчик \r\n $email \r\n <$phone> \r\n $phone \r\n";
if (mail($address, '=?UTF-8?B?'.base64_encode($sub).'?=', $mes, $from)) {
 header('Refresh: 5; URL=http://xxxxx');/*Здесь нужно указать адрес сайта, на который будет переходить пользователь после отправки письма, например URL = http://www.example.com*/;}
else {
 header('Refresh: 5; URL=http://xxxxx');/*Здесь нужно указать адрес сайта, на который будет переходить пользователь после отправки письма, например URL = http://www.example.com*/;}
}
exit; /* Выход без сообщения, если поле bezspama заполнено спам ботами */
?>