package com.example.onlinestoremanagementsystem.users
import com.example.onlinestoremanagementsystem.manage.Management
import com.example.onlinestoremanagementsystem.manage.manageableProduct
import com.example.onlinestoremanagementsystem.products.Product
import com.example.onlinestoremanagementsystem.purchase.Purchase
/**
 * Represents a seller in the store system, capable of managing their inventory.
 *
 * @property id Unique identifier for the seller.
 * @property name Name of the seller.
 * @property email Email address of the seller.
 * @property purchaseList List of products purchased by the seller.
 * @property purchaseHistory List of the seller's purchase history.
 * @property inventory List of products available in the seller's inventory.
 */
class Seller(override val id: Int,
             override val name: String,
             override val email: String,
             override val purchaseList: MutableList<Product>,
             override val purchaseHistory: MutableList<Purchase>,
             private val inventory:MutableList<Product>
): User() , manageableProduct {
     val hasAccount = true;

    /**
     * Prints detailed information about the seller, including their inventory.
     */
    override fun printUserInfo() {
        println("Seller:")
        super.printUserInfo()
        println("inventory: ${inventory.joinToString()}")
    }

    override fun addProduct(product: Product, management: Management) {
        super.addProduct(product, management)
        println("${product.name} has been added by Seller ${this.name}")
    }

    override fun removeProduct(product: Product, management: Management) {
        super.removeProduct(product, management)
        println("${product.name} has been removed by Seller ${this.name}")
    }
}