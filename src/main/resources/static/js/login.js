$( document ).ready(function() {
        jqUI();
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
});

// $(document).read(function (){
//         $("input").keydown(function (event){
//                 if (event.keycode == 13){
//                         var username = $("#username").val();
//                         var password=$("#password").val();
//                         $.post( "/api/user/login", JSON.stringify({username:username,password:password}),function( baseRes ) {
//                                 if(baseRes.code==jsonDataSucCD){
//                                         if(baseRes.data.userType==0){
//                                                 window.location.href="/superUserMain.html";
//                                         }else{
//                                                 window.location.href="/userMain.html";
//                                         }
//                                 }else{
//                                         $("#errMsg").text(baseRes.msg);
//                                 }
//                         });
//                 }
//         })
// });
function jqUI(){
        $( "button" ).button();
        $( "button" ).on( "click", function( event ) {
                event.preventDefault();
        } );
}