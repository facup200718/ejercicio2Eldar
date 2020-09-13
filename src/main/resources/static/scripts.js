var brand = document.getElementById("brand")
var amount = document.getElementById("amount")
var brandValue 
var amountValue


function check() {
    if (brand.value.length != "" && amount.value.length != "") {
        amountValue = parseInt(amount.value)
        brandValue = brand.value

        if(isNaN(amountValue)) {
            alert("Amount field value is not numeric")
        } else {
            if (amountValue <= 0) {
                alert("Amount is negative or equals 0")
            } else {
                updateRate()
            }
        }
    }
    else {
        alert("There are blank spaces")
    }
} 

function updateRate () {
    document.getElementById("three").innerText = "Rates: " + 30
}