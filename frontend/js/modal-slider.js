var k=0,m=7;
$('.modal-body').on('click', '.to-the-next', function(){
   var prev=$(this).parent().parent(),
       next=prev.next();
    prev.toggleClass('d-none');
    next.toggleClass('d-none');
    k=k+15;
    m=m-1;
    if(m>0){
        if (m>4){
            $('#question_number').text(m+' вопросов');
        } else if (m>1){
            $('#question_number').text(m+' вопроса');
        } else{
            $('#question_number').text(m+' вопрос');
        }
    } else if(m==0){
        $('.question_number_text').text('Отлично! Теперь вы можете выбрать любой подарок!')
    }else{
        $('.question_number_text').text('Оставьте Ваш номер телефона или E-mail, чтобы получить расчет цены на ремонт!')
    }
    $('.progress-bar').css('width',k+'%' );
});