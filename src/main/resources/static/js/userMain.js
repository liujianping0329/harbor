$(document).ready(function (){
    //訪問item數據庫
    $.post( "/api/itemPage/itemSelectPage", JSON.stringify({}),function( baseRes ) {
        $.each(baseRes.data,function(i,ele){
            console.log(ele.id);
        });
    });
    //新增欄目按鍵
    $("#cornerPlus").on("click",function () {
        $("#table").append('<tr><th><input type="text" class="item" /></th><th><input type="text" class="price" /></th><th><input type="text" class="number" /></th><th>入庫or出庫</th></tr>');

    })

});







