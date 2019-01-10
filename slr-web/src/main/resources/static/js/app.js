/**
 * Created by fauzi on 1/3/19.
 */

$('#btLogin').on('click', function(e) {
    e.preventDefault();
    var payload = {};
    payload.userName = $('#inputUsername').val();
    payload.password = $('#inputPassword').val();
    //var loginUrl = 'http://localhost:8081/auth/login';
    var loginUrl = 'http://localhost:8080/login/perform';
    var adminUrl = 'http://localhost:8080/admin';

    $('#btLogin').html('Please Wait ...');
    payload = JSON.stringify(payload);
    $.ajax({
        type : 'POST',
        url : loginUrl,
        data: payload,
        contentType : 'application/json',
        success: function( data, textStatus, jQxhr ){
            console.log(JSON.stringify(data));
            if (data.responseCode == "200") {
                window.location.href = adminUrl;
            }else {
                alert("Response Code "+data.responseCode + " Response Message "+data.responseMsg);
                $('#btLogin').html('Try Again...');
            }
        },
        error: function( jqXhr, textStatus, errorThrown ){
            console.log(jqXhr)
            alert(JSON.stringify(jqXhr));
            alert('gagal'+jqXhr.responseText);
            $('#btLogin').html('Try Again...');
        }
    });
});

$(document).ready(function(){
    $("#register").click(function(){
        $("#myModal").modal();
    });
});