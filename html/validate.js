function validate() {
      
    if( document.myForm.Name.value == "" ) {
       alert( "Please provide your name!" );
       document.myForm.Name.focus() ;
       return false;
    }
    if( document.myForm.EMail.value == "" ) {
       alert( "Please provide your Email!" );
       document.myForm.EMail.focus() ;
       return false;
    }
    if( document.myForm.Zip.value == "" || isNaN( document.myForm.Zip.value ) ||
       document.myForm.Zip.value.length != 5 ) {
       
       alert( "Please provide a zip in the format #####." );
       document.myForm.Zip.focus() ;
       return false;
    }
    if( document.myForm.Country.value == "-1" ) {
       alert( "Please provide your country!" );
       return false;
    }
    

    if(document.myForm.Password.value.length<=4)
    {
        alert( "Please provide a correct password" );
       document.myForm.Password.focus() ;
       return false;
    }

    if(document.myForm.Password.value.length!=document.myForm.CPassword.value.length)
    {
        alert( "password should be match" );
       document.myForm.CPassword.focus() ;
       return false;
    }
    return( true );
 }