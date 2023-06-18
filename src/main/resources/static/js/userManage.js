$( document ).ready(function() {

    init();//刷新page功能

    jqUI();//UI功能

    // 新增用戶頁面UI
    $( "#insertUser" ).dialog({
        autoOpen: false,
        show: {
            effect: "blind",
            duration: 500
        },
        hide: {
            effect: "explode",
            duration: 500
        },
        width: 800
    });

    // 新增用戶按鈕
    $( "#insertUserBtn" ).on( "click", function() {
        $( "#insertUser" ).dialog( "open" );
    });

          //按確認按鈕後，將格內數值交給JAVA新增用戶
    $("#insertUserCom").on("click",function () {
        var insertUserName = $("#insertUserName").val();
        var insertUserPassword = $("#insertUserPassword").val();
        var insertUserType = $("#insertUserType").val();
        $.post("/api/user/insertUser", JSON.stringify({"acount":insertUserName,"password":insertUserPassword,"userType":insertUserType}),function( baseRes ){
            if(baseRes.code==jsonDataSucCD){
                $( "#insertUser" ).dialog( "close" );
                init();
            }
        });
    });


});






//按鈕風格
function jqUI(){
    $( "button" ).button();
    $( "button" ).on( "click", function( event ) {
        event.preventDefault();
    } );
}

// 刷新用戶列表
function init() {
    $("#users tr:gt(0)").remove();
    $.post("/api/user/getUsers", JSON.stringify({}), function (baseRes) {
        $.each(baseRes.data, function (i, ele) {
            $("#users").append('<tr><td>' + ele.id + '</td><td>' + ele.acount + '</td><td>' + ele.userType + '</td><td><button class = "selectBtn" id="select' + ele.name + '">查看詳情</button></td><td><button class="deleteBtn" id = "delete' + ele.name + '">刪除</button></td><td><button class="updateBtn" id = "update' + ele.name + '">修改</button></td></tr>');
        });
    });
}