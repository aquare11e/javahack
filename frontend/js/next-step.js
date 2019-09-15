$('.change-to-email').on('click',function(){
    $('.email').toggleClass('d-none');
    $('.phone').toggleClass('d-none');
    $('.change-to-email').toggleClass('d-none');
    $('.change-to-phone').toggleClass('d-none');
    $('#changable-text').text('Введите свой E-mail, мы вышлем Вам рещультаты расчета');
});
$('.change-to-phone').on('click',function(){
    $('.email').toggleClass('d-none');
    $('.phone').toggleClass('d-none');
    $('.change-to-email').toggleClass('d-none');
    $('.change-to-phone').toggleClass('d-none');
    $('#changable-text').text('Введите номер телефона, мы вышлем смс с результатами');
});

$('.show').on('change', function(){
    $(this).parent().next().toggleClass('d-none');
    
});

//проверка, что в первом шаге что-то выбрано
$('#napolnaya,#nastennaya').on('change', function(){
    $('#modal-step1').find('.btn-primary').toggleClass('disabled');
    $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
    if ($('#napolnaya').prop('checked')!=true && $('#nastennaya').prop('checked')!=true){
        if ($('#modal-step1').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step1').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#napolnaya').prop('checked')!=false && $('#nastennaya').prop('checked')!=false){
        if ($('#modal-step1').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step1').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#napolnaya').prop('checked')!=false || $('#nastennaya').prop('checked')!=false){
        if ($('#modal-step1').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step1').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#modal-step1').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step1').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step1').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step1').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step1').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});
//проверка, что во втором шаге что-то выбрано
$('#laminat,#parket').on('change', function(){
    $('#modal-step2').find('.btn-primary').toggleClass('disabled');
    $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
    if ($('#laminat').prop('checked')!=true && $('#parket').prop('checked')!=true){
        if ($('#modal-step2').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step2').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#laminat').prop('checked')!=false && $('#parket').prop('checked')!=false){
        if ($('#modal-step2').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step2').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#laminat').prop('checked')!=false || $('#parket').prop('checked')!=false){
        if ($('#modal-step2').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step2').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#modal-step2').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step2').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step2').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step2').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step2').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});
//проверка, чито на третьем шаге что-то выбрано
$('#vhodnye,#mezhkomnatnye').on('change', function(){
    $('#modal-step3').find('.btn-primary').toggleClass('disabled');
    if ($('#vhodnye').prop('checked')!=true && $('#mezhkomnatnye').prop('checked')!=true){
        if ($('#modal-step3').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step3').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#vhodnye').prop('checked')!=false && $('#mezhkomnatnye').prop('checked')!=false){
        if ($('#modal-step3').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step3').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#vhodnye').prop('checked')!=false || $('#mezhkomnatnye').prop('checked')!=false){
        if ($('#modal-step3').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step3').find('.btn-primary').toggleClass('disabled');
            $('#modal-step1').find('.btn-primary').toggleClass('blink_sm');
        }
    }
    if ($('#modal-step3').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step3').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step3').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step3').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step3').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});

//проверка, что на 4-ом шаге что-то выбрано
$('input[name="walls-squere"]').on('input', function(){
    var l=$(this).val().length;
    if (l!=0){
        if ($('#modal-step4').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step4').find('.btn-primary').toggleClass('disabled');
            $('#modal-step4').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step4').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step4').find('.btn-primary').toggleClass('disabled');
            $('#modal-step4').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});

$('#walls-zamer').on('change', function(){
    if ($('#walls-zamer').prop('checked')==true){
        if ($('#modal-step4').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step4').find('.btn-primary').toggleClass('disabled');
            $('#modal-step4').find('.btn-primary').toggleClass('to-the-next');
        } 
    } else{
       if ($('#modal-step4').find('.btn-primary').hasClass('disabled')==false && $('input[name="walls-squere"]').val().length==0){ 
           $('#modal-step4').find('.btn-primary').toggleClass('disabled');
           $('#modal-step4').find('.btn-primary').toggleClass('to-the-next');
       }
    }
});
//проверка, что на 5-ои шаге что-то выбрано
$('input[name="floor-squere"]').on('input', function(){
    var l=$(this).val().length;
    if (l!=0){
        if ($('#modal-step5').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step5').find('.btn-primary').toggleClass('disabled');
            $('#modal-step5').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step5').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step5').find('.btn-primary').toggleClass('disabled');
            $('#modal-step5').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});

$('#floor-zamer').on('change', function(){
    if ($('#floor-zamer').prop('checked')==true){
        if ($('#modal-step5').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step5').find('.btn-primary').toggleClass('disabled');
            $('#modal-step5').find('.btn-primary').toggleClass('to-the-next');
        } 
    } else{
       if ($('#modal-step5').find('.btn-primary').hasClass('disabled')==false && $('input[name="floor-squere"]').val().length==0){ 
           $('#modal-step5').find('.btn-primary').toggleClass('disabled');
           $('#modal-step5').find('.btn-primary').toggleClass('to-the-next');
       }
    }
});
//проверка, что на 6-ом шаге что-то выбрано
$('#sink,#bathtub,#toilet,#mixer').on('change', function(){
    $('#modal-step6').find('.btn-primary').toggleClass('disabled');
    if ($('#sink').prop('checked')!=true && $('#bathtub').prop('checked')!=true && $('#toilet').prop('checked')!=true && $('#mixer').prop('checked')!=true){
        if ($('#modal-step6').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step6').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#sink').prop('checked')!=false && $('#bathtub').prop('checked')!=false && $('#toilet').prop('checked')!=false && $('#mixer').prop('checked')!=false){
        if ($('#modal-step6').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step6').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#sink').prop('checked')!=false || $('#bathtub').prop('checked')!=false || $('#toilet').prop('checked')!=false || $('#mixer').prop('checked')!=false){
        if ($('#modal-step6').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step6').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#modal-step6').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step6').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step6').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step6').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step6').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});
//проверка, что на 7-ом шаге что-то выбрано
$('#ceiling,#floor-sound,#walls-sound').on('change', function(){
    $('#modal-step7').find('.btn-primary').toggleClass('disabled');
    if ($('#ceiling').prop('checked')!=true && $('#floor-sound').prop('checked')!=true && $('#walls-sound').prop('checked')!=true){
        if ($('#modal-step7').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step7').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#ceiling').prop('checked')!=false && $('#floor-sound').prop('checked')!=false && $('#walls-sound').prop('checked')!=false){
        if ($('#modal-step7').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step7').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#ceiling').prop('checked')!=false || $('#floor-sound').prop('checked')!=false || $('#walls-sound').prop('checked')!=false){
        if ($('#modal-step7').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step7').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#modal-step7').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step7').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step7').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step7').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step7').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});
//проверка, что на 8-ом шаге что-то выбрано
$('#switch,#stretch-ceiling,#door').on('change', function(){
    $('#modal-step8').find('.btn-primary').toggleClass('disabled');
    if ($('#switch').prop('checked')!=true && $('#stretch-ceiling').prop('checked')!=true && $('#door').prop('checked')!=true){
        if ($('#modal-step8').find('.btn-primary').hasClass('disabled')==false){
            $('#modal-step8').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#switch').prop('checked')!=false && $('#stretch-ceiling').prop('checked')!=false && $('#door').prop('checked')!=false){
        if ($('#modal-step8').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step8').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#switch').prop('checked')!=false || $('#stretch-ceiling').prop('checked')!=false || $('#door').prop('checked')!=false){
        if ($('#modal-step8').find('.btn-primary').hasClass('disabled')==true){
            $('#modal-step8').find('.btn-primary').toggleClass('disabled');
        }
    }
    if ($('#modal-step8').find('.btn-primary').hasClass('disabled')==false){
        if ($('#modal-step8').find('.btn-primary').hasClass('to-the-next')==false){
            $('#modal-step8').find('.btn-primary').toggleClass('to-the-next');
        }
    } else{
        if ($('#modal-step8').find('.btn-primary').hasClass('to-the-next')==true){
            $('#modal-step8').find('.btn-primary').toggleClass('to-the-next');
        }
    }
});