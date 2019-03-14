/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validateRegistration()
{
    var firstname=document.forms["register"]["form-first-name"].value;
    if(firstname=="")
        {
            alert("Please enter Valid First Name");
            return false;
        }
    var lastname=document.forms["register"]["form-last-name"].value;
    if(lastname=="")
        {
            alert("Please enter Valid Last Name");
            return false;
        }
        var x = document.forms["register"]["form-email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
  var phoneNo=document.forms["register"]["contact_no"].value;
    if (phoneNo.value == "") {
    alert("Please enter your Mobile No.");
    return false;
  }
  if (phoneNo < 1000000000 || phoneNo > 10000000000) {
    alert("Mobile No. is not valid, Please Enter 10 Digit Mobile No.");
    return false;
  }

    else return true;
}

function isNumber(evt) {
  evt = (evt) ? evt : window.event;
  var charCode = (evt.which) ? evt.which : evt.keyCode;
  if (charCode > 31 && (charCode < 48 || charCode > 57)) {
    alert("Please enter only Numbers.");
    return false;
  }

  return true;
}
