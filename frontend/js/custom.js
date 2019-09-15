  var $body;

  $(document).ready(function(){
    $body = $('body');

    $body
      .find('.user-phone').each(function(){
          $(this).mask("+7 (999) 999-99-99", {autoсlear: false});
      });
    });