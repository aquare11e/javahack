function calcTax() {
    let vals=[];
    vals.push($('#contractSum').val());
    vals.push($('#clientType').val());
    vals.push(vals[0]*vals[1]);
    vals.push(vals[1]===0.04?vals[0]*0.01:vals[0]*0.02>10000?10000:vals[0]*0.02);
    vals.push(vals[2]-vals[3]);
    $('form').hide();
    $('.calc_field').each(function (i,v) {
       $(v).append(vals[i]);
    });
    $('.calc_field').show();
    $('#re_calc_button').show();
}

function calcAnotherTax() {
    document.location="calc.html"
}
