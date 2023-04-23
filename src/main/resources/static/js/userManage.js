$( document ).ready(function() {
    $.post( "/api/user/getUsers", JSON.stringify({}),function( baseRes ) {
        $.each(baseRes.data,function(i,ele){
            $("#users").append('<tr><td>'+ele.id+'</td><td>'+ele.acount+'</td><td>'+ele.userType+'</td></tr>');
        });
    });
});