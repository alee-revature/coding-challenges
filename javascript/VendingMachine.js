//vending machines have products with a product number and name
//the user inputs money and a product number
//the vending machine shows the product name and change


function vendingMachine(money, productNumber) {
    //$2.00 for product number 7: crackers
    //money is in cents

    //compare change with cost of product in array

    //validation
    if (productNumber < 0 || productNumber > 9) {
        return "Enter a valid product number";
    }

    if (money < productCost) {
        return "Not enough money for this product";
    }

    if (change == 0) {
        //return empty array
    }

    //expected output: productName, change
}

