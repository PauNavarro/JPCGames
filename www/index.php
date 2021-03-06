<?php
 
session_start();
 
if(isset($_GET['logout'])){    
     
    //Mensaje al cerrar sesion
    $logout_message = "<div class='msgln'><span class='left-info'>El Usuario <b class='user-name-left'>". $_SESSION['name'] ."</b> se ha desconectado.</span><br></div>";
    file_put_contents("log.html", $logout_message, FILE_APPEND | LOCK_EX);
     
    session_destroy();
    header("Location: chat.php"); //redireccionar al usuario
}
 
if(isset($_POST['enter'])){
    if($_POST['name'] != ""){
        $_SESSION['name'] = stripslashes(htmlspecialchars($_POST['name']));
    }
    else{
        echo '<span class="error">Por favor introduce un nombre</span>';
    }
}
 
function loginForm(){
    echo
    '<div id="loginform">
    <p>Introduce tu nombre!</p>
    <form action="index.php" method="post">
      <label for="name">Nombre &mdash;</label>
      <input type="text" name="name" id="name" />
      <input type="submit" name="enter" id="enter" value="Continuar" />
    </form>
  </div>';
}
 
?>
 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>JPCGames Chat</title>
        <meta name="description" content="JPCGames Chat" />
        <link rel="stylesheet" href="./css/chat.css" />
		<link rel="shortcut icon" href="favicon.ico"/>

    </head>
    <body>
    <?php
    if(!isset($_SESSION['name'])){
        loginForm();
    }
    else {
    ?>
        <div id="wrapper">
            <div id="menu">
                <p class="welcome">Bienvenido, <b><?php echo $_SESSION['name']; ?></b></p>
                <p class="logout"><a id="exit" href="#">Salir</a></p>
            </div>
 
            <div id="chatbox">
            <?php
            if(file_exists("log.html") && filesize("log.html") > 0){
                $contents = file_get_contents("log.html");          
                echo $contents;
            }
            ?>
            </div>
 
            <form name="message" action="">
                <input name="usermsg" type="text" id="usermsg" />
                <input name="submitmsg" type="submit" id="submitmsg" value="Enviar" />
            </form>
        </div>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript">
            // jQuery Document
            $(document).ready(function () {
                $("#submitmsg").click(function () {
                    var clientmsg = $("#usermsg").val();
                    $.post("post.php", { text: clientmsg });
                    $("#usermsg").val("");
                    return false;
                });
 
                function loadLog() {
                    var oldscrollHeight = $("#chatbox")[0].scrollHeight - 20; 
 
                    $.ajax({
                        url: "log.html",
                        cache: false,
                        success: function (html) {
                            $("#chatbox").html(html); //Insertar el chat log en el #chatbox div
 
                            //Auto-scroll           
                            var newscrollHeight = $("#chatbox")[0].scrollHeight - 20; 
                            if(newscrollHeight > oldscrollHeight){
                                $("#chatbox").animate({ scrollTop: newscrollHeight }, 'normal'); 
                            }   
                        }
                    });
                }
 
                setInterval (loadLog, 2500);
 
                $("#exit").click(function () {
                    var exit = confirm("Estas seguro de que quierer salir?");
                    if (exit == true) {
                    window.location = "chat.php?logout=true";
                    }
                });
            });
        </script>
    </body>
</html>
<?php
}
?>