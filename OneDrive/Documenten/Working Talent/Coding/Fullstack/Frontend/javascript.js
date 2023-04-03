
function retrieveProducts() {

    console.log("fetching products")

    fetch('http://localhost:8080/product/all')
        .then(response => response.json())
        .then(data => {
            console.log('data: ' + Object.keys(data[0]))

            let numberOfColumns = Object.keys(data[0]).length;
            let table = '';

            var tbody = document.getElementById("ProductTable").children[0];

            
                data.forEach(product => {

                    

                    var row = document.createElement("tr");
                    for(var i = 0; i < numberOfColumns; i++){

                        var col = document.createElement("td");
                        var delButton = document.createElement("button")
                        col.id = Object.values(product)[0]

                        delButton.innerHTML = "delete";
                        delButton.onclick = deleteProduct;

                        
                        col.textContent = Object.values(product)[i];
                        row.appendChild(col);
                        
                    }
                    row.appendChild(delButton)

                    tbody.appendChild(row);

                    

                });
                
        }).catch(            console.log("some error occured"));

    console.log('succesfully retrieved products')

}


function addProduct() {

    let inputName = document.getElementById('input-name').value;
    let inputPrice = document.getElementById('input-price').value;
    let inputAvailability = parseInt(document.querySelector('input[name="availability"]:checked').value);
    let inputAmount = document.getElementById('input-amount').value;    

    let product = {

        "name": inputName,
        "price": inputPrice,
        "availability": inputAvailability,
        "amount": inputAmount
        
    }

    console.log("availability: "  + typeof(inputAvailability))
    console.log("product: " +  Object.values(product))

    fetch("http://localhost:8080/product", {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(product)
            })
            .then(response => {
                alert('Succesfully added product');
            })
            .catch(error => {
                alert('Error occured');
            });



}



function deleteProduct() {

    console.log('x')
    document.getElementById("ProductTable")


    // let table = document.getElementById("ProductTable");
    // let delID = ""

    //  fetch(`http://localhost:8080/product/` + delID, {
    //              method: 'DELETE'
    //         })
    //          .then(response => {
    //              alert('Succesfully deleted product');
    //          })
    //          .catch(error => {
    //              alert('Error occured');
    //          });
    
}
