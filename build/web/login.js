/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateForm() {
    var x = document.forms["login"]["form-username"].value;
    if (x == "") {
        alert("Please Enter a Valid Username");
        return false;
    }
    var y = document.forms["login"]["form-password"].value;
    if (y == "") {
        alert("Please Enter a Valid Password");
        return false;
    }
    return true;
}
