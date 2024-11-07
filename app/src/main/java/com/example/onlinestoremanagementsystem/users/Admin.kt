package com.example.onlinestoremanagementsystem.users
import com.example.onlinestoremanagementsystem.manage.Management
import com.example.onlinestoremanagementsystem.manage.manageableProduct
import com.example.onlinestoremanagementsystem.manage.manageableUsers
import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.purchase.Purchase
/**
 * Represents an administrator in the store system, with capabilities to manage users and products.
 *
 * @property id Unique identifier for the admin.
 * @property name Name of the admin.
 * @property email Email address of the admin.
 * @property accountNumber The admin's unique account number.
 * @property purchaseList List of products associated with the admin.
 * @property purchaseHistory List of the admin’s purchase history.
 */
class Admin(
    override val id: Int,
    override val name: String,
    override val email: String,
    private val accountNumber:Int,
    override val purchaseList: MutableList<Product>,
    override val purchaseHistory: MutableList<Purchase>
) : User(), manageableProduct, manageableUsers {

    val hasAccount = true
    /**
     * Adds a product to the store’s inventory using the [Management] instance.
     *
     * @param product The product to be added.
     * @param management The store management instance responsible for managing products.
     */
    override fun addProduct(product: Product, management: Management) {
        super.addProduct(product, management)
        println("${product.name} has been added by Admin ${this.name}")
    }
    /**
     * Removes a product from the store’s inventory using the [Management] instance.
     *
     * @param product The product to be removed.
     * @param management The store management instance responsible for managing products.
     */
    override fun removeProduct(product: Product, management: Management) {
        super.removeProduct(product, management)
        println("${product.name} has been removed by Admin ${this.name}")
    }
    /**
     * Adds a user to the store system using the [Management] instance.
     *
     * @param user The user to be added.
     * @param management The store management instance responsible for managing users.
     */
    override fun addUser(user: User, management: Management) {
        super.addUser(user, management)
        println("${user.name} has been added by Admin ${this.name}")
    }
    /**
     * Deletes a user from the store system using the [Management] instance.
     *
     * @param user The user to be removed.
     * @param management The store management instance responsible for managing users.
     */
    override fun deleteUser(user: User, management: Management) {
        super.deleteUser(user, management)
        println("${user.name} has been removed by Admin ${this.name}")
    }
    /**
     * Prints detailed information about the admin, including account number.
     */
    override fun printUserInfo() {
        println("Admin:")
        super.printUserInfo()
        println("account number: ${accountNumber}")
    }
}
