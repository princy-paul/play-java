function enableAcceptButton() {
				var acceptBtn = document.getElementById("acceptRadioButton");
				var declineBtn = document.getElementById("declineRadioButton");
				if (acceptBtn.disabled == true) {
					var textArea = document.getElementById("textAreaContainer");
					declineBtn.disabled = acceptBtn.disabled = !(textArea.scrollHeight <= (Math
							.abs(textArea.scrollTop + 10) + textArea.clientHeight));
				}
			}


$(document).ready(function(){
    $("#accept").click(function(){
    var id=$("input:radio[name='Ecare_ChangeAddress_1_1wlw-radio_button_group_key']:checked").val();
    if(id==null){
        alert("Please select an option");
        return false;
    }
    else{
        return true;
        }
    });
});



