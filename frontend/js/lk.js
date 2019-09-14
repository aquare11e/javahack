function checkInn(){
    $.ajax({
        method: "POST",
        async: false,
        url: "/api/integration/check/"+$('#inn').val(),
        success: function(data){
            $('.knopkilk').hide();
            $('#agent_data').append('<li>'+data['name']+'</li>'+
            '<li>'+data['owner']+'</li>'+ '<li>'+data['razmer_nalog']+'</li>');
            $('#another_check').show();
        },
        error: function(data){
            console.log(data);
        }
    });
}