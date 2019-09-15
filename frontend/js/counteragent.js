

function checkAgent(){
    $.ajax({
        method: "POST",
        async: false,
        url: "http://localhost:8080/api/integration/check/"+$('#inn').val(),
        success: function (data) {
            !!data['check']['items'][0]['ЮЛ']?fillLegal(data):fillIndividual(data);
        },
        error: function(data){

        }
    })
}

function fillIndividual(data) {
    console.log(data);
    $('#inn_form').hide();
    $('.table').append('<tbody><tr><td>Наименование ЮЛ</td><td>'+data['egr']['items'][0]['ИП']['ФИОПолн']+'</td></tr>' +
        '<tr><td>Статус</td><td>'+data['egr']['items'][0]['ИП']['Статус']+'</td></tr>' +
        '<tr><td>Позитивные факторы</td><td>'+(data['check']['items'][0]['ИП']['Позитив']['Текст']==null?'':data['check']['items'][0]['ИП']['Позитив']['Текст'])+'</td></tr>'+
        '<tr><td>Негативные факторы</td><td>'+(data['check']['items'][0]['ИП']['Негатив']['Текст']==null?'':data['check']['items'][0]['ИП']['Негатив']['Текст'])+'</td></tr></tbody>');
    $('#check_image').append('<img src="img/'+(data['check']['items'][0]['ИП']['Позитив']['Текст'].length>0?data['check']['items'][0]['ИП']['Негатив']['Текст'].length>0?'well':'good':'bad')+'.svg">')
}

function fillLegal(data) {
    console.log(data);
    $('#inn_form').hide();
    $('.table').append('<tbody><tr><td>Наименование ЮЛ</td><td>'+data['egr']['items'][0]['ЮЛ']['НаимПолнЮЛ']+'</td></tr>' +
        '<tr><td>Статус</td><td>'+data['egr']['items'][0]['ЮЛ']['Статус']+'</td></tr>' +
        '<tr><td>Позитивные факторы</td><td>'+(data['check']['items'][0]['ЮЛ']['Позитив']['Текст']==null?'':data['check']['items'][0]['ЮЛ']['Позитив']['Текст'])+'</td></tr>'+
        '<tr><td>Негативные факторы</td><td>'+(data['check']['items'][0]['ЮЛ']['Негатив']['Текст']==null?'':data['check']['items'][0]['ЮЛ']['Негатив']['Текст'])+'</td></tr></tbody>');
    $('#check_image').append('<img src="img/'+(data['check']['items'][0]['ЮЛ']['Позитив']['Текст'].length>0?data['check']['items'][0]['ЮЛ']['Негатив']['Текст'].length>0?'well':'good':'bad')+'.svg">')

}
