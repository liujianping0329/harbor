$( document ).ready(function() {
    $(".menuBtn").on("click",function (event){
        $("#mainPage iframe").attr("src","/"+$(this).attr("myUrl")+".html");
    });
});