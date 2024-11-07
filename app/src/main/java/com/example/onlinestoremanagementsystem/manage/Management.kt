package com.example.onlinestoremanagementsystem.manage
import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.users.Admin
import com.example.onlinestoremanagementsystem.users.Customer
import com.example.onlinestoremanagementsystem.users.Seller
import com.example.onlinestoremanagementsystem.users.User

/**
 * Manages products and users in the online store, providing functionality to add, remove, find
 * and list both products and users.
 */
class Management() : manageableProduct, manageableUsers {
    private var products = mutableListOf<Product>()
    val productList: List<Product>
        get() {
            return products.toList()
        }

    private var users = mutableListOf<User>()
    val userList: List<User>
        get() {
            return users.toList()
        }

    private var customers = mutableListOf<Customer>()
    private var sellers = mutableListOf<Seller>()
    private var admins = mutableListOf<Admin>()
    /**
     * Adds a product to the store inventory.
     * @param product The product to be added.
     */
    fun addProduct(product: Product) {
        if (!products.contains(product)) {
            products.add(product)
            println("product was added successfully")
        } else {
            println("product was already added")
        }
    }

    /**
     * Removes a product from the store inventory.
     * @param product The product to be removed.
     */
    fun removeProduct(product: Product) {
        if (products.contains(product)) {
            products.remove(product)
            println("${product.name} product was removed successfully")
        } else println("product ${product.name} was not found")
    }
    /**
     * Lists all products in the store.
     */
    fun checkStock() {
        if (products.isNotEmpty()) {
            products.forEachIndexed { index, product ->
                print("${index + 1}. ")
                product.printProductInfo()
            }
        } else {
            println("no products found")
        }
    }
    /**
     * Adds a user to the store system.
     * @param user The user to be added.
     */
    fun addUser(user: User) {
        if(!users.contains(user)) {
            users.add(user)
            println("user ${user.name} was added successfully")
        } else{
            println("user already exist")
        }
    }
    /**
     * Removes a user from the store system.
     * @param user The user to be removed.
     */
    fun deleteUser(user: User) {
        if (users.contains(user)) {
            users.remove(user)
            println("user ${user.name} was deleted successfully")
        } else {
            println("user is not in the system.")
        }
    }
    /**
     * Lists all users registered in the system.
     */
    fun listAllUsers() {
        if (users.isNotEmpty()) {
            users.forEachIndexed { index, user ->
                print("${index + 1}. ")
                user.printUserInfo()
            }
        } else {
            println("no users found")
        }
    }
    /**
     * Finds a user by ID.
     * @param enteredId The ID of the user to be found.
     * @return The user if found, or null otherwise.
     */
    fun findUser(enteredId: Int): User? {
        for (user in users) {
            if (enteredId == user.id) {
                return user
            }
        }
        return null
    }
    /**
     * Finds a product by ID.
     * @param productEnteredId The ID of the product to be found.
     * @return The product if found, or null otherwise.
     */
    fun findProduct(productEnteredId: String): Product? {
        for (product in products) {
            if (productEnteredId.equals(product.id)) {
                return product
            }
        }
        return null
    }

}