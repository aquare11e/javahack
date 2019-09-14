/*
function checkInn(){
    $.ajax({
        method: "POST",
        async: false,
        url: "/api/integration/check/"+$('#inn').val(),
        success: function(data){
            $('.knopkilk').hide();
            $('#agent_data').append('<li>'+data['name']+'</li>'+
            '<li>'+data['owner']+'</li>'+
            '<li>'+data['risk_nal']+'</li>' + 
            '<li>'+data['negativ_factor']+'</li>');
            $('#another_check').show();
        },
        error: function(data){
            console.log(data);
        }
    });
}
*/