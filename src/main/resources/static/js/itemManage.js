$( document ).ready(function() {
    init();
    $("#itemGroup").on("click",".deleteBtn",function () {
        $.post("/api/item/deleteItemGroup", JSON.stringify({id:$(this).parents("tr").find("td").eq(0).text()}),function( baseRes ){
            if(baseRes.code==jsonDataSucCD){
                init();
            }
        });
    });
    $( "#iteminf" ).dialog({
        autoOpen: false,
        show: {
            effect: "blind",
            duration: 500
        },
        hide: {
            effect: "explode",
            duration: 500
        },
        width:1000
    });


    //新增商品組頁面
    $( "#itemInsertinfo" ).dialog({
        autoOpen: false,
        show: {
            effect: "blind",
            duration: 500
        },
        hide: {
            effect: "explode",
            duration: 500
        },
        width: 300
    });

    $( "#itemInsert" ).on( "click", function() {
        $( "#itemGroupInsertinfo" ).dialog( "open" );
        $("#updateConform").hide();
        $("#insertConform").show();
    });
    // insert itemgroup
    $("#insertConform").on("click",function () {
        $.post("/api/item/insertItemGroup", JSON.stringify({name:$("#insertName").val()}),function( baseRes ){
            if(baseRes.code==jsonDataSucCD){
                $( "#itemInsertinfo" ).dialog( "close" );
                init();
            }
        });
    });

    //修改商品組頁面
    $( "#itemGroupInsertinfo" ).dialog({
        autoOpen: false,
        show: {
            effect: "blind",
            duration: 500
        },
        hide: {
            effect: "explode",
            duration: 500
        },
        width: 300
    });



    $("#itemGroup").on("click",".updateBtn",function () {
        $( "#itemGroupInsertinfo" ).dialog( "open" );
        $( "#itemGroupInsertinfo" ).dialog({
            title: "商品組修改頁面"
        });
        $("#idNum").attr("mydata",$(this).parents("tr").find("td").eq(0).text())
        $("#insertConform").hide();
        $("#updateConform").show();


    });
    // update itemgroup
    $("#updateConform").on("click",function () {
        $.post("/api/item/updateItemGroup", JSON.stringify({id:$("#idNum").attr("mydata"),name:$("#insertName").val()}),function( baseRes ){
            if(baseRes.code==jsonDataSucCD){
                $( "#itemInsertinfo" ).dialog( "close" );
                init();
            }
        });
    });

    // 點擊查看商品詳情->商品頁面開啟
    $("#itemGroup").on("click",".selectBtn",function () {
        $("#itemInfPageItemGroup").html($(this).parents("tr").find("td").eq(1).text());
        $( "#iteminf" ).dialog( "open");
        $.post("/api/itemPage/itemSelectPage", JSON.stringify({itemGroupId:$(this).parents("tr").find("td").eq(0).text()}),function( baseRes ){
            $.each(baseRes.data,function(i,ele){
                $("#iteminformation").append('<tr><td>'+ele.id+'</td><td>'+ele.name+'</td><td>'+ele.number+'</td><td>'+ele.sannti+'</td><td><button class = "selectBtn" id="select'+ele.name+'">查看詳情</button></td><td><button class="deleteBtn" id = "delete'+ele.name+'">刪除</button></td><td><button class="updateBtn" id = "update'+ele.name+'">修改</button></td></tr>');
            });

        });
    });

});

function init(){
    $("#itemGroup tr:gt(0)").remove();
    $.post( "/api/item/getItemGroup", JSON.stringify({}),function( baseRes ) {
        $.each(baseRes.data,function(i,ele){
            $("#itemGroup").append('<tr><td>'+ele.id+'</td><td>'+ele.name+'</td><td><button class = "selectBtn" id="select'+ele.name+'">查看詳情</button></td><td><button class="deleteBtn" id = "delete'+ele.name+'">刪除</button></td><td><button class="updateBtn" id = "update'+ele.name+'">修改</button></td></tr>');
        });
    });
}



