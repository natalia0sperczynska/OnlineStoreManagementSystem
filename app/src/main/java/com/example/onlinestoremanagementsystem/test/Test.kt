package com.example.onlinestoremanagementsystem.test

import com.example.onlinestoremanagementsystem.manage.Management
import com.example.onlinestoremanagementsystem.products.ElectronicsProduct
import com.example.onlinestoremanagementsystem.products.FashionProduct
import com.example.onlinestoremanagementsystem.products.FoodProduct
import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.products.Status
import com.example.onlinestoremanagementsystem.products.categories.CategoryElectronicsProduct
import com.example.onlinestoremanagementsystem.products.categories.CategoryFashionProduct
import com.example.onlinestoremanagementsystem.purchase.PaymentMethods
import com.example.onlinestoremanagementsystem.purchase.Purchase
import com.example.onlinestoremanagementsystem.users.Admin
import com.example.onlinestoremanagementsystem.users.Customer
import com.example.onlinestoremanagementsystem.users.Seller

/**
 * Main function to check functionalities of the Online Store Management System
 */
fun main() {
 // products
    val electronicsProduct = ElectronicsProduct(
        id = "E001",
        name = "Smartphone",
        price = 699.99,
        status = Status.AVAILABLE,
        energyConsumption = 50,
        warranty = "2 years",
        category = CategoryElectronicsProduct.SMARTPHONE
    )

    val fashionProduct = FashionProduct(
        id = "F001",
        name = "Leather Jacket",
        price = 150.0,
        status = Status.AVAILABLE,
        size = "L",
        material = "Leather",
        category = CategoryFashionProduct.MALE
    )

    val foodProduct = FoodProduct(
        id = "FD001",
        name = "Organic Honey",
        price = 12.99,
        status = Status.AVAILABLE,
        expirationDate = "31.12.2025",
        isBio = true,
        isVegan = false
    )

    // manage
    val storeManager = Management()

    // admin
    val admin = Admin(
        id = 1,
        name = "Alice",
        email = "alice@onlinestoreAdmin.com",
        accountNumber = 11823,
        purchaseList = mutableListOf<Product>(),
        purchaseHistory = mutableListOf<Purchase>()
    )
    // seller
    val seller = Seller(
        id = 2,
        name = "Alan",
        email="alan@onlinestoreSeller.com",
        purchaseList = mutableListOf(),
        purchaseHistory = mutableListOf(),
        inventory = mutableListOf()
    )
    // customers
    val customer = Customer(
        id = 3,
        name = "Emily",
        email = "emily@onlinestoreCustomer.com",
        purchaseList = mutableListOf(),
        purchaseHistory = mutableListOf()
    )
    val customer2 = Customer(
        id = 4,
        name = "Jacob",
        email = "jacob@onlinestoreCustomer2.com",
        purchaseList = mutableListOf(),
        purchaseHistory = mutableListOf()
    )

    // adding products to the store
    println("\n adding products to store")
    admin.addProduct(electronicsProduct, storeManager)
    seller.addProduct(fashionProduct, storeManager)
    admin.addProduct(foodProduct, storeManager)

    println("\n checking stock")
    storeManager.checkStock()

    println("\n adding user")
    storeManager.addUser(admin, storeManager)
    admin.addUser(customer, storeManager)
    admin.addUser(customer2,storeManager)
    admin.addUser(seller,storeManager)


    println("\n All Users:")
    storeManager.listAllUsers()

    // customer is buying a  product
    println("\n customer buying product")
    electronicsProduct.addProductToPurchaseList(electronicsProduct,customer)
    foodProduct.addProductToPurchaseList(foodProduct,customer)
    electronicsProduct.addProductToPurchaseList(electronicsProduct,customer) //trying to add the same product again

    val purchase = customer.finalizePurchase(PaymentMethods.DEBIT_CARD)
    
    println("\n customer purchase history and info")
    customer.printUserInfo()

    println("\n customer returning products")
    customer.returnPurchase(purchase)

    println("\n removing user")
    admin.deleteUser(customer2, storeManager)

    println("\n listing users again")
    storeManager.listAllUsers()

    println("\n stock check")
    storeManager.checkStock()

}