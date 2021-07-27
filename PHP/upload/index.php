<?php
$alllowedTypes = array(
    'image/png',
    'image/jpg',
    'image/jpeg'
);

    if($_FILES['photo']){
        $totalFiles = count($_FILES['photo']);
        for($i=0;$i<$totalFiles;$i++){
            if(in_array($_FILES['photo']['type'][$i], $alllowedTypes) !== false && $_FILES['photo']['size'][$i] < 5*1024*1024){
             move_uploaded_file($_FILES['photo']['tmp_name'][$i],"../files/".$_FILES['photo']['name'][$i]);
            }
        }
    }
   
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Example</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,300italic,700,700italic">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">

    <style>
        body {
            margin-top:30px;
        }
    </style>

    
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="column colmun-60 column-offset-20">
                <h2>File Upload</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Repellendus at exercitationem esse labore non optio alias, iste perferendis in officia, nam nisi perspiciatis dolore illum suscipit commodi, asperiores eveniet dolor.</p>
                <?php
                    if(isset($_POST['submit'])):
                ?>
                    <pre>
                        <p>
                            <?php
                                print_r($_POST);
                                print_r($_FILES);
                            ?>
                        </p>
                    </pre>
                <?php
                endif;
                ?>
                
            </div>
        </div>
        <div class="row">
            <div class="column column-60 column-offset-20">
                <form method="POST" enctype="multipart/form-data">
                    <label for="fname">First Name</label>
                    <input type="text" name="fname" id="fname">

                    <label for="lname">Last Name</label>
                    <input type="text" name="lname" id="lname">

                    <label for="photo">Photo</label>
                    <input type="file" name="photo[]" id="photo"><br>
                    <input type="file" name="photo[]" id="photo"><br>
                    <input type="file" name="photo[]" id="photo"><br>

                    <button type="submit" name="submit" value="submit">Submit</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>