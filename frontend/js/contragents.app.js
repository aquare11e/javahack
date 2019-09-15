$(document).ready(function() {
    document.addEventListener("DOMContentLoaded", function () {
        var scrollbar = document.body.clientWidth - window.innerWidth + 'px';
        console.log(scrollbar);
        document.querySelector('[href="#openModal"]').addEventListener('click', function () {
            document.body.style.overflow = 'hidden';
            document.querySelector('#openModal').style.marginLeft = scrollbar;
        });
        document.querySelector('[href="#close"]').addEventListener('click', function () {
            document.body.style.overflow = 'visible';
            document.querySelector('#openModal').style.marginLeft = '0px';
        });
    });

    $.ajax({
        method: "GET",
        async: false,
        beforeSend: function(request){
            request.setRequestHeader('user_id', '1')
        },
        url: "http://app.walkingcoders.xyz/api/counteragent",
        success:function (data) {
            $(data).each(function(i, v){
                $('#tbody').append('<tr><td>'+v['name']+'</td>' +
                    '<td>'+v['contactPerson']+'</td>' +
                    '<td>'+v['inn']+'</td>' +
                    '<td>'+v['type']+'</td></tr>')
            });
        },
        error:function (data) {
            alert(data);
        }
    });
});

function registerCA() {
    let ca={};
    ca.client='1';
    ca.name=$('#c_name').val();
    ca.contactPerson=$('#c_contact').val();
    ca.type=$('[name="i_type"]').val();
    ca.inn=$('#c_inn').val();
    ca.account=$('#c_account').val();
    $.ajax({
       method: "POST",
       beforeSend: function (requset) {
           requset.setRequestHeader('user_id', '1')
       },
        url: "http://app.walkingcoders.xyz/api/counteragent",
        data: ca,
        success: function (data) {
            alert(data);
        },
        error: function (data) {
            alert(data);
        }
    });
}
