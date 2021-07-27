<?php

function isChecked($inputName, $value) {
    if(isset($inputName) && in_array($inputName) && in_array($value,$inputName)){
        echo "checked";
    }
}