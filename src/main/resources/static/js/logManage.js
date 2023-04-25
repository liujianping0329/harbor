$( document ).ready(function() {
    $.post( "/api/log/getlogManage", JSON.stringify({}),function( baseRes ) {
        $.each(baseRes.data,function(i,ele){
            $("#logManage").append('<tr><td>'+ele.id+'</td><td>'+ele.itemId+'</td><td>'+ele.type+'</td><td>'+ele.number+'</td><td>'+ele.date+'</td><td>'+ele.userId+'</td></tr>');
        });
    });
});



