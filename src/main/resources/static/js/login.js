$( document ).ready(function() {
        register();
        jqUI();
        login();


});


function login(){
        $("#loginBtn").on("click",function (event) {
                var username = $("#username").val();
                var password=$("#password").val();
                $.post( "/api/user/login", JSON.stringify({username:username,password:password}),function( baseRes ) {
                        if(baseRes.code==jsonDataSucCD){
                                if(baseRes.data.userType==0){
                                        window.location.href="/superUserMain.html";
                                }else{
                                        window.location.href="/userMain.html";
                                }
                        }else{
                                $("#errMsg").text(baseRes.msg);
                        }
                });
        })
}

function register() {
        $("#registerBtn").on("click",function(){
                $("#signInDiv").show();
        });
        $("#hideBtn").on("click",function(){
                $("#signInDiv").hide();
        });
        $("#sentBtn").on("click",function(){
                var insertUserName = $("#signInUsername").val();
                var insertUserPassword = $("#signInPassword").val();
                var insertUserType = $("#insertUserType").val();
                $.post("/api/user/insertUser", JSON.stringify({"acount":insertUserName,"password":insertUserPassword,"userType":insertUserType}),function( baseRes ){
                        if(baseRes.code==jsonDataSucCD){
                                // 成功＝＞1.登録画面close. 2.成功画面open.
                                $("#signInDiv").hide();
                                $("#sucPage").show();
                        }else{
                                $("#signInErrMsg").text("失敗、何かerror!");
                        }
                });
        });
        $("#sucBtn").on("click",function(){
                $("#sucPage").hide();
        });
}

function jqUI(){
        $( "button" ).button();
        $( "button" ).on( "click", function( event ) {
                event.preventDefault();
        } );
}