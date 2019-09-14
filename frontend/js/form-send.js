$('.last_step_buttons').on('click',function(){
    
    //M-1
    $('input[name="url"]').val(window.location.href);
    if ($('#napolnaya').prop('checked')==true){
        $('input[name="floor_tile"]').val('Да');
    } else{
        $('input[name="floor_tile"]').val('Нет'); 
    }
    
    $('input[name="floor_tile_s"]').val($('input[name="napolnaya-squere"]').val());
    
    if ($('#napolnaya-zamer').prop('checked')==true){
        $('input[name="floor_tile_m"]').val('нужен');
    } else{
        $('input[name="floor_tile_m"]').val('не нужен'); 
    } 
    if ($('#nastennaya').prop('checked')==true){
        $('input[name="wall_tile"]').val('Да');
    } else{
        $('input[name="wall_tile"]').val('Нет'); 
    }
    
    $('input[name="wall_tile_s"]').val($('input[name="nastennaya-squere"]').val());
    
    if ($('#nastennaya-zamer').prop('checked')==true){
        $('input[name="wall_tile_m"]').val('нужен');
    } else{
        $('input[name="wall_tile_m"]').val('не нужен'); 
    }
    
    //M-2
    
    if ($('#laminat').prop('checked')==true){
        $('input[name="laminate"]').val('Да');
    } else{
        $('input[name="laminate"]').val('Нет'); 
    }
    
    $('input[name="laminate_s"]').val($('input[name="laminat-squere"]').val());
    
    if ($('#laminat-zamer').prop('checked')==true){
        $('input[name="laminate_m"]').val('нужен');
    } else{
        $('input[name="laminate_m"]').val('не нужен'); 
    } 
    if ($('#parket').prop('checked')==true){
        $('input[name="parquet"]').val('Да');
    } else{
        $('input[name="parquet"]').val('Нет'); 
    }
    
    $('input[name="parquet_s"]').val($('input[name="parket-squere"]').val());
    
    if ($('#parket-zamer').prop('checked')==true){
        $('input[name="parquet_m"]').val('нужен');
    } else{
        $('input[name="parquet_m"]').val('не нужен'); 
    }
    
    //M-3
    
    if ($('#vhodnye').prop('checked')==true){
        $('input[name="ent_doors"]').val('Да');
    } else{
        $('input[name="ent_doors"]').val('Нет'); 
    }
    
    $('input[name="ent_doors_n"]').val($('input[name="vhodnye-number"]').val());
    
    if ($('#mezhkomnatnye').prop('checked')==true){
        $('input[name="int_doors"]').val('Да');
    } else{
        $('input[name="int_doors"]').val('Нет'); 
    }
    
    $('input[name="int_doors_n"]').val($('input[name="mezhkomnatnye-number"]').val());
    
    //M-4
    
    $('input[name="wallpaper_n"]').val($('nput[name="walls-squere"]').val());
    
    if ($('#walls-zamer').prop('checked')==true){
        $('input[name="wallpaper_m"]').val('Да');
    } else{
        $('input[name="wallpaper_m"]').val('Нет'); 
    }
    
    //M-5
    
    $('input[name="thermo_floor_s"]').val($('nput[name="floor-squere"]').val());
    
    if ($('#thermo-zamer').prop('checked')==true){
        $('input[name="thermo_switch"]').val('Да');
    } else{
        $('input[name="thermo_switch"]').val('Нет'); 
    }
    
    if ($('#floor-zamer').prop('checked')==true){
        $('input[name="thermo_floor_m"]').val('Да');
    } else{
        $('input[name="thermo_floor_m"]').val('Нет'); 
    }
    
    //M-6
    
    if ($('#sink').prop('checked')==true){
        $('input[name="sink_i"]').val('Да');
    } else{
        $('input[name="sink_i"]').val('Нет'); 
    }
    
    if ($('#bathtub').prop('checked')==true){
        $('input[name="bath_tube_i"]').val('Да');
    } else{
        $('input[name="bath_tube_i"]').val('Нет'); 
    }
    
    if ($('#toilet').prop('checked')==true){
        $('input[name="toilet_i"]').val('Да');
    } else{
        $('input[name="toilet_i"]').val('Нет'); 
    }
    
    if ($('#mixer').prop('checked')==true){
        $('input[name="mixers_i"]').val('Да');
    } else{
        $('input[name="mixers_i"]').val('Нет'); 
    }
    
    //M-7
    var select1=$('#modal-step7').find('.cs-placeholder')[0], select2=$('#modal-step7').find('.cs-placeholder')[1], select3=$('#modal-step7').find('.cs-placeholder')[2];
    if ($('#ceiling').prop('checked')==true){
        $('input[name="ceiling_sound"]').val('Да');
    } else{
        $('input[name="ceiling_sound"]').val('Нет'); 
    }
    
    $('input[name="ceiling_sound_s"]').val($('input[name="ceiling-squere"]').val());
    
    if ($('#ceiling-zamer').prop('checked')==true){
        $('input[name="ceiling_sound_m"]').val('нужен');
    } else{
        $('input[name="ceiling_sound_m"]').val('не нужен'); 
    } 
    if(select1.innerHTML!="Выберете тип шума"){
        $('input[name="ceiling_sound_type"]').val(select1.innerHTML);
    } else{
        $('input[name="ceiling_sound_type"]').val('не выбран');
    }
    
    if ($('#floor-sound').prop('checked')==true){
        $('input[name="floor_sound"]').val('Да');
    } else{
        $('input[name="floor_sound"]').val('Нет'); 
    }
    
    $('input[name="floor_sound_s"]').val($('input[name="floor-sound-squere"]').val());
    
    if ($('#floor-sound-zamer').prop('checked')==true){
        $('input[name="floor_sound_m"]').val('нужен');
    } else{
        $('input[name="floor_sound_m"]').val('не нужен'); 
    } 
    if(select2.innerHTML!="Выберете тип шума"){
        $('input[name="floor_sound_type"]').val(select2.innerHTML);
    } else{
        $('input[name="floor_sound_type"]').val('не выбран');
    }
    
    if ($('#walls-sound').prop('checked')==true){
        $('input[name="wall_sound"]').val('Да');
    } else{
        $('input[name="wall_sound"]').val('Нет'); 
    }
    
    $('input[name="wall_sound_s"]').val($('input[name="walls-sound-squere"]').val());
    
    if ($('#walls-sound-zamer').prop('checked')==true){
        $('input[name="wall_sound_m"]').val('нужен');
    } else{
        $('input[name="wall_sound_m"]').val('не нужен'); 
    } 
    if(select3.innerHTML!="Выберете тип шума"){
        $('input[name="wall_sound_type"]').val(select3.innerHTML);
    } else{
        $('input[name="wall_sound_type"]').val('не выбран');
    }
    
    //M-8
    
    if ($('#switch').prop('checked')==true){
        $('input[name="switchers_p"]').val('Да');
    } else{
        $('input[name="switchers_p"]').val(''); 
    }
    
    if ($('#stretch-ceiling').prop('checked')==true){
        $('input[name="stretch_ceiling_p"]').val('Да');
    } else{
        $('input[name="stretch_ceiling_p"]').val(''); 
    }
    
    if ($('#door').prop('checked')==true){
        $('input[name="int_door_p"]').val('Да');
    } else{
        $('input[name="int_door_p"]').val(''); 
    }
});
$("#brif_form").submit(function(e) { //устанавливаем событие отправки для формы с id=form
    e.preventDefault();
    
    if (($('input[name="phone"]').val() != "") || ($('input[name="email"]').val() != "")){
            var form_data = $(this).serialize(); //собераем все данные из формы
            
            $.ajax({
            type: "POST", //Метод отправки
            url: "brif-form-mail.php", //путь до php фаила отправителя
            data: form_data,
            success: function() {
                   //код в этом блоке выполняется при успешной отправке сообщения
                   alert("Ваш запрос отправлен, вскоре с Вами свяжется наш менеджер!");
            }
            })
    } else {alert("Оставьте телефон или почту для связи, перед отправкой, чтобы получить подарок!")}
});